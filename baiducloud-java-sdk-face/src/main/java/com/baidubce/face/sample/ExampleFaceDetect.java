package com.baidubce.face.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.BceApiKeyCredentials;
import com.baidubce.face.FaceClient;
import com.baidubce.face.models.FaceDetectRequest;
import com.baidubce.face.models.FaceDetectResponse;

public class ExampleFaceDetect {
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
        FaceDetectRequest faceDetectRequest = new FaceDetectRequest();
        faceDetectRequest.setImage("");
        faceDetectRequest.setImageType("");
        faceDetectRequest.setFaceField("");
        faceDetectRequest.setMaxFaceNum(0);
        faceDetectRequest.setFaceType("");
        faceDetectRequest.setLivenessControl("");
        faceDetectRequest.setFaceSortType(0);
        faceDetectRequest.setDisplayCorpImage(0);
        try {
            FaceDetectResponse response = client.faceDetect(faceDetectRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
