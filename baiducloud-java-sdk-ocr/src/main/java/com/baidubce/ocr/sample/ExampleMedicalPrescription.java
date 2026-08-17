package com.baidubce.ocr.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.BceApiKeyCredentials;
import com.baidubce.ocr.OcrClient;
import com.baidubce.ocr.models.MedicalPrescriptionRequest;
import com.baidubce.ocr.models.MedicalPrescriptionResponse;

public class ExampleMedicalPrescription {
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
        MedicalPrescriptionRequest medicalPrescriptionRequest = new MedicalPrescriptionRequest();
        medicalPrescriptionRequest.setImage("");
        medicalPrescriptionRequest.setUrl("");
        medicalPrescriptionRequest.setLocation(false);
        medicalPrescriptionRequest.setProbability(false);
        try {
            MedicalPrescriptionResponse response = client.medicalPrescription(medicalPrescriptionRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
