package com.baidubce.iam.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.iam.IamClient;
import com.baidubce.iam.models.UpdateLoginProfileRequest;

public class ExampleUpdateLoginProfile {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        IamClient client = new IamClient(bceClientConfig);
        UpdateLoginProfileRequest updateLoginProfileRequest = new UpdateLoginProfileRequest();
        updateLoginProfileRequest.setUserName("");
        updateLoginProfileRequest.setPassword("");
        updateLoginProfileRequest.setNeedResetPassword(false);
        updateLoginProfileRequest.setEnabledLogin(false);
        updateLoginProfileRequest.setEnabledLoginMfa(false);
        updateLoginProfileRequest.setLoginMfaType("");
        updateLoginProfileRequest.setThirdPartyType("");
        updateLoginProfileRequest.setThirdPartyAccount("");
        try {
            client.updateLoginProfile(updateLoginProfileRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
