package com.baidubce.ocr.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.BceApiKeyCredentials;
import com.baidubce.ocr.OcrClient;
import com.baidubce.ocr.models.GeneralBasicRequest;
import com.baidubce.ocr.models.GeneralBasicResponse;

public class ExampleGeneralBasic {
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
        GeneralBasicRequest generalBasicRequest = new GeneralBasicRequest();
        generalBasicRequest.setImage("");
        generalBasicRequest.setUrl("");
        generalBasicRequest.setPdfFile("");
        generalBasicRequest.setPdfFileNum(0);
        generalBasicRequest.setOfdFile("");
        generalBasicRequest.setOfdFileNum(0);
        generalBasicRequest.setLanguageType("");
        generalBasicRequest.setDetectDirection(false);
        generalBasicRequest.setDetectLanguage(false);
        generalBasicRequest.setParagraph(false);
        generalBasicRequest.setProbability(false);
        try {
            GeneralBasicResponse response = client.generalBasic(generalBasicRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
