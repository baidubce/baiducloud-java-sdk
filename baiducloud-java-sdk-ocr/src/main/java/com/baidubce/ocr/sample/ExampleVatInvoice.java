package com.baidubce.ocr.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.BceApiKeyCredentials;
import com.baidubce.ocr.OcrClient;
import com.baidubce.ocr.models.VatInvoiceRequest;
import com.baidubce.ocr.models.VatInvoiceResponse;

public class ExampleVatInvoice {
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
        VatInvoiceRequest vatInvoiceRequest = new VatInvoiceRequest();
        vatInvoiceRequest.setImage("");
        vatInvoiceRequest.setUrl("");
        vatInvoiceRequest.setPdfFile("");
        vatInvoiceRequest.setPdfFileNum(0);
        vatInvoiceRequest.setOfdFile("");
        vatInvoiceRequest.setOfdFileNum(0);
        vatInvoiceRequest.setType("");
        vatInvoiceRequest.setSealTag(false);
        try {
            VatInvoiceResponse response = client.vatInvoice(vatInvoiceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
