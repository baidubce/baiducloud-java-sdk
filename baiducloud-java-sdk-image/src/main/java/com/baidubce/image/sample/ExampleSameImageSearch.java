package com.baidubce.image.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.BceApiKeyCredentials;
import com.baidubce.image.ImageClient;
import com.baidubce.image.models.SameImageSearchRequest;
import com.baidubce.image.models.SameImageSearchResponse;

public class ExampleSameImageSearch {
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

        ImageClient client = new ImageClient(bceClientConfig);
        SameImageSearchRequest sameImageSearchRequest = new SameImageSearchRequest();
        sameImageSearchRequest.setImage("");
        sameImageSearchRequest.setUrl("");
        sameImageSearchRequest.setTags("");
        sameImageSearchRequest.setTagLogic(0);
        sameImageSearchRequest.setPn(0);
        sameImageSearchRequest.setRn(0);
        try {
            SameImageSearchResponse response = client.sameImageSearch(sameImageSearchRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
