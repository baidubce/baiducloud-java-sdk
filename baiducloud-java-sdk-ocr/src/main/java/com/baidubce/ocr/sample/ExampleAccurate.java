package com.baidubce.ocr.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.BceApiKeyCredentials;
import com.baidubce.ocr.OcrClient;
import com.baidubce.ocr.models.AccurateRequest;
import com.baidubce.ocr.models.AccurateResponse;

public class ExampleAccurate {
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
        AccurateRequest accurateRequest = new AccurateRequest();
        accurateRequest.setImage("");
        accurateRequest.setUrl("");
        accurateRequest.setPdfFile("");
        accurateRequest.setPdfFileNum(0);
        accurateRequest.setOfdFile("");
        accurateRequest.setOfdFileNum(0);
        accurateRequest.setLanguageType("");
        accurateRequest.setEngGranularity("");
        accurateRequest.setRecognizeGranularity("");
        accurateRequest.setDetectDirection(false);
        accurateRequest.setVertexesLocation(false);
        accurateRequest.setParagraph(false);
        accurateRequest.setProbability(false);
        accurateRequest.setCharProbability(false);
        accurateRequest.setMultidirectionalRecognize(false);
        try {
            AccurateResponse response = client.accurate(accurateRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
