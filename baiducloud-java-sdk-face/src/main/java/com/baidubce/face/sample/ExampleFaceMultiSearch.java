package com.baidubce.face.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.BceApiKeyCredentials;
import com.baidubce.face.FaceClient;
import com.baidubce.face.models.FaceMultiSearchRequest;
import com.baidubce.face.models.FaceMultiSearchResponse;

public class ExampleFaceMultiSearch {
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

        FaceClient client = new FaceClient(bceClientConfig);
        FaceMultiSearchRequest faceMultiSearchRequest = new FaceMultiSearchRequest();
        faceMultiSearchRequest.setImage("");
        faceMultiSearchRequest.setImageType("");
        faceMultiSearchRequest.setGroupIdList("");
        faceMultiSearchRequest.setMaxFaceNum(0);
        faceMultiSearchRequest.setMatchThreshold(0);
        faceMultiSearchRequest.setQualityControl("");
        faceMultiSearchRequest.setLivenessControl("");
        faceMultiSearchRequest.setSpoofingControl("");
        faceMultiSearchRequest.setMaxUserNum(0);
        try {
            FaceMultiSearchResponse response = client.faceMultiSearch(faceMultiSearchRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
