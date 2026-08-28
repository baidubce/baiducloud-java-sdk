package com.baidubce.ocr.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.BceApiKeyCredentials;
import com.baidubce.ocr.OcrClient;
import com.baidubce.ocr.models.TollInvoiceRequest;
import com.baidubce.ocr.models.TollInvoiceResponse;

public class ExampleTollInvoice {
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
        TollInvoiceRequest tollInvoiceRequest = new TollInvoiceRequest();
        tollInvoiceRequest.setImage("");
        tollInvoiceRequest.setUrl("");
        tollInvoiceRequest.setPdfFile("");
        tollInvoiceRequest.setPdfFileNum(0);
        tollInvoiceRequest.setOfdFile("");
        tollInvoiceRequest.setOfdFileNum(0);
        try {
            TollInvoiceResponse response = client.tollInvoice(tollInvoiceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
