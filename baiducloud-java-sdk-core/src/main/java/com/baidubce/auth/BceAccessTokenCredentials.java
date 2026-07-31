package com.baidubce.auth;

import com.baidubce.BceClientException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 通过AK/SK向 https://aip.baidubce.com/oauth/2.0/token 请求获取access token
 * 拿到access_token, 支持自动刷新*/
public class BceAccessTokenCredentials implements BceCredentials {

    private static final Logger LOGGER = LoggerFactory.getLogger(BceAccessTokenCredentials.class);
    private static final String TOKEN_URL = "https://aip.baidubce.com/oauth/2.0/token"
            + "?grant_type=client_credentials&client_id=%s&client_secret=%s";
    private static int maxRetry = 3;
    /**
     * access token 距离过期时间小于24小时，则自动刷新
     */
    private static final long REFRESH_THRESHOLD = 24 * 60 * 60 * 1000L;

    private final String apiKey;
    private final String secretKey;
    private volatile String accessToken;
    private volatile long expireTimeMills;

    public BceAccessTokenCredentials(String apiKey, String secretKey) {
        if (apiKey == null || apiKey.isEmpty()) {
            throw new IllegalArgumentException("apiKey is null or empty");
        }
        if (secretKey == null || secretKey.isEmpty()) {
            throw new IllegalArgumentException("secretKey is null or empty");
        }
        this.apiKey = apiKey;
        this.secretKey = secretKey;
        refresh();
    }

    /**
     * 返回当前有效的access token，如果当前token已经过期，则自动刷新
     *
     * @return access token
     */
    public String getAccessToken() {
        if (System.currentTimeMillis() >= expireTimeMills - REFRESH_THRESHOLD) {
            refresh();
        }
        return accessToken;
    }

    @Override
    public String getAccessKeyId() {
        return apiKey;
    }

    @Override
    public String getSecretKey() {
        return secretKey;
    }


    /**
     * 向百度ai平台换取新的access token
     * 使用 synchronized 保证多线程下只有一个线程在刷新token
     */
    private synchronized void refresh() {
        if (System.currentTimeMillis() < expireTimeMills - REFRESH_THRESHOLD) {
            return;
        }
        int attempt = 0;
        while (attempt < maxRetry) {
            attempt++;
            HttpURLConnection connection = null;
            try {
                String url = String.format(TOKEN_URL, apiKey, secretKey);
                URL urlObj = new URL(url);
                connection = (HttpURLConnection) urlObj.openConnection();
                connection.setRequestMethod("POST");
                connection.setConnectTimeout(10000);
                connection.setReadTimeout(10000);
                connection.setRequestProperty("Content-Type", "application/json");
                connection.setRequestProperty("Accept", "application/json");

                int statusCode = connection.getResponseCode();
                if (statusCode == 500 && attempt < maxRetry) {
                    LOGGER.warn("Failed to get access token, response code: 500, retrying ({}/{})",
                            attempt, maxRetry);
                    continue;
                }

                if (statusCode != 200) {
                    throw new BceClientException("Failed to get access token, response code: " + statusCode);
                }

                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(connection.getInputStream(), "UTF-8"));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                   sb.append(line);
                }
                reader.close();

                String body = sb.toString();
            // 简单json解析，避免引入额外依赖
                String token = extractJsonField(body, "access_token");
                String expiresInStr = extractJsonField(body, "expires_in");

                if (token == null || token.isEmpty()) {
                    throw new BceClientException("Failed to parse access_token from response body: " + body);
                }

                this.accessToken = token;
                Long expiresInLong = expiresInStr != null ? Long.parseLong(expiresInStr) : 2592000L;
                this.expireTimeMills = System.currentTimeMillis() + expiresInLong * 1000L;

                LOGGER.debug("access_token refreshed, expires in {} seconds", expiresInLong);
            } catch (BceClientException e) {
                throw e;
            }catch (Exception e) {
                throw new BceClientException("Failed to refresh access token", e);
            } finally {
                if (connection != null) {
                    connection.disconnect();
                }
            }
        }
    }

    /**
     * 从json字符串中提取指定字段的值
     */
    private static String extractJsonField(String json, String field) {
        // 匹配“filed”：“value”格式的字段
        String key = "\"" + field + "\"";
        int keyIndex = json.indexOf(key);
        if (keyIndex < 0) {
            return null;
        }
        int colonIndex = json.indexOf(':', keyIndex + key.length());
        if (colonIndex < 0) {
            return null;
        }
        int valueStart = colonIndex + 1;
        while (valueStart < json.length() && json.charAt(valueStart) == ' ') {
            valueStart++;
        }
        if (valueStart >= json.length()) {
            return null;
        }
        if (json.charAt(valueStart) == '"') {
            int endIndex = json.indexOf('"', valueStart + 1);
            if (endIndex < 0) {
                return null;
            }
            return json.substring(valueStart + 1, endIndex);
        } else {
            int endIndex = valueStart;
            while (endIndex < json.length()
                    && json.charAt(endIndex) != ','
                    && json.charAt(endIndex) != '}') {
                endIndex++;
            }
            return json.substring(valueStart, endIndex).trim();
        }
    }
}
