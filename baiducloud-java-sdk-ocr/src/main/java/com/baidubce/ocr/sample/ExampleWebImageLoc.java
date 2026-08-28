package com.baidubce.ocr.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.BceApiKeyCredentials;
import com.baidubce.ocr.OcrClient;
import com.baidubce.ocr.models.WebImageLocRequest;
import com.baidubce.ocr.models.WebImageLocResponse;

public class ExampleWebImageLoc {
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
        WebImageLocRequest webImageLocRequest = new WebImageLocRequest();
        webImageLocRequest.setImage("");
        webImageLocRequest.setUrl("");
        webImageLocRequest.setPdfFile("");
        webImageLocRequest.setPdfFileNum(0);
        webImageLocRequest.setOfdFile("");
        webImageLocRequest.setOfdFileNum(0);
        webImageLocRequest.setDetectDirection(false);
        webImageLocRequest.setProbability(false);
        webImageLocRequest.setPolyLocation(false);
        webImageLocRequest.setRecognizeGranularity("");
        try {
            WebImageLocResponse response = client.webImageLoc(webImageLocRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
