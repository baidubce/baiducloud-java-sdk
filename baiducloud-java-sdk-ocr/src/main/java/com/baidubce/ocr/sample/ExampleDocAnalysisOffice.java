package com.baidubce.ocr.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.BceApiKeyCredentials;
import com.baidubce.ocr.OcrClient;
import com.baidubce.ocr.models.DocAnalysisOfficeRequest;
import com.baidubce.ocr.models.DocAnalysisOfficeResponse;

public class ExampleDocAnalysisOffice {
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
        DocAnalysisOfficeRequest docAnalysisOfficeRequest = new DocAnalysisOfficeRequest();
        docAnalysisOfficeRequest.setImage("");
        docAnalysisOfficeRequest.setUrl("");
        docAnalysisOfficeRequest.setPdfFile("");
        docAnalysisOfficeRequest.setPdfFileNum(0);
        docAnalysisOfficeRequest.setOfdFile("");
        docAnalysisOfficeRequest.setOfdFileNum(0);
        docAnalysisOfficeRequest.setLanguageType("");
        docAnalysisOfficeRequest.setResultType("");
        docAnalysisOfficeRequest.setCharProbability(false);
        docAnalysisOfficeRequest.setDetectDirection(false);
        docAnalysisOfficeRequest.setLineProbability(false);
        docAnalysisOfficeRequest.setDispLinePoly(false);
        docAnalysisOfficeRequest.setWordsType("");
        docAnalysisOfficeRequest.setLayoutAnalysis(false);
        docAnalysisOfficeRequest.setRecgTables(false);
        docAnalysisOfficeRequest.setRecogSeal(false);
        docAnalysisOfficeRequest.setRecgFormula(false);
        docAnalysisOfficeRequest.setEraseSeal(false);
        docAnalysisOfficeRequest.setDispUnderlineAnalysis(false);
        try {
            DocAnalysisOfficeResponse response = client.docAnalysisOffice(docAnalysisOfficeRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
