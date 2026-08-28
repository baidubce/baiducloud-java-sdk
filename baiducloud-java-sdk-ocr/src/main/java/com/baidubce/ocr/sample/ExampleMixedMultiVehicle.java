package com.baidubce.ocr.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.BceApiKeyCredentials;
import com.baidubce.ocr.OcrClient;
import com.baidubce.ocr.models.MixedMultiVehicleRequest;
import com.baidubce.ocr.models.MixedMultiVehicleResponse;

public class ExampleMixedMultiVehicle {
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
        MixedMultiVehicleRequest mixedMultiVehicleRequest = new MixedMultiVehicleRequest();
        mixedMultiVehicleRequest.setImage("");
        mixedMultiVehicleRequest.setUrl("");
        mixedMultiVehicleRequest.setDetectDirection(false);
        mixedMultiVehicleRequest.setUnified(false);
        try {
            MixedMultiVehicleResponse response = client.mixedMultiVehicle(mixedMultiVehicleRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
