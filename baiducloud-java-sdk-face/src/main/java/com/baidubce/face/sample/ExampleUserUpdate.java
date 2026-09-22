package com.baidubce.face.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.BceApiKeyCredentials;
import com.baidubce.face.FaceClient;
import com.baidubce.face.models.UserUpdateRequest;
import com.baidubce.face.models.UserUpdateResponse;

public class ExampleUserUpdate {
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
        UserUpdateRequest userUpdateRequest = new UserUpdateRequest();
        userUpdateRequest.setImage("");
        userUpdateRequest.setImageType("");
        userUpdateRequest.setGroupId("");
        userUpdateRequest.setUserId("");
        userUpdateRequest.setUserInfo("");
        userUpdateRequest.setQualityControl("");
        userUpdateRequest.setLivenessControl("");
        userUpdateRequest.setSpoofingControl("");
        userUpdateRequest.setActionType("");
        try {
            UserUpdateResponse response = client.userUpdate(userUpdateRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
