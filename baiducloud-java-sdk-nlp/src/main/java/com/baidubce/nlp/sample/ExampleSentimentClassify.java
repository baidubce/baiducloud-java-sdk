package com.baidubce.nlp.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.BceApiKeyCredentials;
import com.baidubce.nlp.NlpClient;
import com.baidubce.nlp.models.SentimentClassifyRequest;
import com.baidubce.nlp.models.SentimentClassifyResponse;

public class ExampleSentimentClassify {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        // String ak = "Your Ak";
        // String sk = "Your Sk";
        // bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        // ==== AccessToken 鉴权（API Key / Secret Key 换取 AccessToken）====
        // String apiKey = "Your ApiKey";
        // String secretKey = "Your SecretKey";
        // bceClientConfig.setCredentials(new BceAccessTokenCredentials(apiKey, secretKey));

        // ==== API Key 鉴权 ====
        String apiKey = "Your ApiKey";
        bceClientConfig.setCredentials(new BceApiKeyCredentials(apiKey));

        NlpClient client = new NlpClient(bceClientConfig);
        SentimentClassifyRequest sentimentClassifyRequest = new SentimentClassifyRequest();
        sentimentClassifyRequest.setCharset("");
        sentimentClassifyRequest.setText("");
        try {
            SentimentClassifyResponse response = client.sentimentClassify(sentimentClassifyRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
