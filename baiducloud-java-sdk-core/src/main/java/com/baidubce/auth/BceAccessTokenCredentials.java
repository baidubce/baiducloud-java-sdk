package com.baidubce.auth;

import com.baidubce.BceClientException;
import com.baidubce.util.JsonUtils;
import com.fasterxml.jackson.databind.JsonNode;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

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
        checkNotNull(apiKey, "apiKey should not be null.");
        checkArgument(!apiKey.isEmpty(), "apiKey should not be empty.");
        checkNotNull(secretKey, "secretKey should not be null.");
        checkArgument(!secretKey.isEmpty(), "secretKey should not be empty.");
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
        return null;
    }

    @Override
    public String getSecretKey() {
        return null;
    }

    @Override
    public Signer getSigner() {
        return new BceAccessTokenSigner();
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
            String url = String.format(TOKEN_URL, apiKey, secretKey);
            HttpPost httpPost = new HttpPost(url);
            httpPost.setHeader("Content-Type", "application/json");
            httpPost.setHeader("Accept", "application/json");
            try (CloseableHttpClient httpClient = HttpClients.createDefault();
                 CloseableHttpResponse response = httpClient.execute(httpPost)) {
                int statusCode = response.getStatusLine().getStatusCode();
                if (statusCode == 500 && attempt < maxRetry) {
                    LOGGER.warn("Failed to get access token, response code: 500, retrying ({}/{})",
                            attempt, maxRetry);
                    continue;
                }
                if (statusCode != 200) {
                    throw new BceClientException("Failed to get access token, response code: " + statusCode);
                }
                String body = EntityUtils.toString(response.getEntity(), "UTF-8");
                JsonNode node = JsonUtils.jsonNodeOf(body);
                JsonNode tokenNode = node == null ? null : node.get("access_token");
                if (tokenNode == null || tokenNode.asText().isEmpty()) {
                    throw new BceClientException("Failed to parse access_token from response body: " + body);
                }
                this.accessToken = tokenNode.asText();
                long expiresIn = node.has("expires_in") ? node.get("expires_in").asLong() : 2592000L;
                this.expireTimeMills = System.currentTimeMillis() + expiresIn * 1000L;
                LOGGER.debug("access_token refreshed, expires in {} seconds", expiresIn);
                return;
            } catch (BceClientException e) {
                throw e;
            } catch (Exception e) {
                throw new BceClientException("Failed to refresh access token", e);
            }
        }
    }
}
