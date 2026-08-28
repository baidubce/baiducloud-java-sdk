package com.baidubce.ocr.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.BceApiKeyCredentials;
import com.baidubce.ocr.OcrClient;
import com.baidubce.ocr.models.DocAnalysisRequest;
import com.baidubce.ocr.models.DocAnalysisResponse;

public class ExampleDocAnalysis {
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
        DocAnalysisRequest docAnalysisRequest = new DocAnalysisRequest();
        docAnalysisRequest.setImage("");
        docAnalysisRequest.setUrl("");
        docAnalysisRequest.setPdfFile("");
        docAnalysisRequest.setPdfFileNum(0);
        docAnalysisRequest.setLanguageType("");
        docAnalysisRequest.setResultType("");
        docAnalysisRequest.setDetectDirection(false);
        docAnalysisRequest.setLineProbability(false);
        docAnalysisRequest.setDispLinePoly(false);
        docAnalysisRequest.setWordsType("");
        docAnalysisRequest.setLayoutAnalysis(false);
        docAnalysisRequest.setRecgFormula(false);
        docAnalysisRequest.setRecgLongDivision(false);
        docAnalysisRequest.setDispUnderlineAnalysis(false);
        docAnalysisRequest.setRecgAlter(false);
        try {
            DocAnalysisResponse response = client.docAnalysis(docAnalysisRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
