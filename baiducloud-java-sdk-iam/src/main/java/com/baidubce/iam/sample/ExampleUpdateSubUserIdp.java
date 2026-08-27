package com.baidubce.iam.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.iam.IamClient;
import com.baidubce.iam.models.UpdateSubUserIdpRequest;
import com.baidubce.iam.models.UpdateSubUserIdpResponse;

public class ExampleUpdateSubUserIdp {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        IamClient client = new IamClient(bceClientConfig);
        UpdateSubUserIdpRequest updateSubUserIdpRequest = new UpdateSubUserIdpRequest();
        updateSubUserIdpRequest.setFileName("");
        updateSubUserIdpRequest.setEncodeMetadata("");
        updateSubUserIdpRequest.setAuxiliaryDomain("");
        try {
            UpdateSubUserIdpResponse response = client.updateSubUserIdp(updateSubUserIdpRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
