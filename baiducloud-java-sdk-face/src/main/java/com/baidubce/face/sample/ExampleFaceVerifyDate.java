package com.baidubce.face.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.BceApiKeyCredentials;
import com.baidubce.face.FaceClient;
import com.baidubce.face.models.FaceVerifyDateRequest;
import com.baidubce.face.models.FaceVerifyDateResponse;

public class ExampleFaceVerifyDate {
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
        FaceVerifyDateRequest faceVerifyDateRequest = new FaceVerifyDateRequest();
        faceVerifyDateRequest.setName("");
        faceVerifyDateRequest.setIdCardNumber("");
        faceVerifyDateRequest.setStartDate("");
        faceVerifyDateRequest.setEndDate("");
        faceVerifyDateRequest.setImage("");
        faceVerifyDateRequest.setImageType("");
        faceVerifyDateRequest.setLivenessControl("");
        faceVerifyDateRequest.setSpoofingControl("");
        faceVerifyDateRequest.setQualityControl("");
        try {
            FaceVerifyDateResponse response = client.faceVerifyDate(faceVerifyDateRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
