package com.baidubce.iam.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.iam.IamClient;
import com.baidubce.iam.models.UpdateSubUserIdpStatusRequest;
import com.baidubce.iam.models.UpdateSubUserIdpStatusResponse;

public class ExampleUpdateSubUserIdpStatus {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        IamClient client = new IamClient(bceClientConfig);
        UpdateSubUserIdpStatusRequest updateSubUserIdpStatusRequest = new UpdateSubUserIdpStatusRequest();
        updateSubUserIdpStatusRequest.setStatus("");
        try {
            UpdateSubUserIdpStatusResponse response = client.updateSubUserIdpStatus(updateSubUserIdpStatusRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
