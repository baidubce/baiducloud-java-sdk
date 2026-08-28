package com.baidubce.ocr.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.BceApiKeyCredentials;
import com.baidubce.ocr.OcrClient;
import com.baidubce.ocr.models.MultiIdcardRequest;
import com.baidubce.ocr.models.MultiIdcardResponse;

public class ExampleMultiIdcard {
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

        OcrClient client = new OcrClient(bceClientConfig);
        MultiIdcardRequest multiIdcardRequest = new MultiIdcardRequest();
        multiIdcardRequest.setImage("");
        multiIdcardRequest.setUrl("");
        multiIdcardRequest.setDetectRisk(false);
        multiIdcardRequest.setDetectQuality(false);
        multiIdcardRequest.setDetectPhoto(false);
        multiIdcardRequest.setDetectCard(false);
        multiIdcardRequest.setDetectScreenshot(false);
        try {
            MultiIdcardResponse response = client.multiIdcard(multiIdcardRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
