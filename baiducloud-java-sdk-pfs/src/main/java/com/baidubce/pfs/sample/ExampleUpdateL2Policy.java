package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.UpdateL2PolicyRequest;
import com.baidubce.pfs.models.UpdateL2PolicyResponse;

public class ExampleUpdateL2Policy {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        UpdateL2PolicyRequest updateL2PolicyRequest = new UpdateL2PolicyRequest();
        updateL2PolicyRequest.setInstanceId("");
        updateL2PolicyRequest.setPolicyId("");
        updateL2PolicyRequest.setNewPolicyName("");
        updateL2PolicyRequest.setExpiredTime(0);
        updateL2PolicyRequest.setExecuteTime(0);
        updateL2PolicyRequest.setBucketName("");
        updateL2PolicyRequest.setBucketPrefix("");
        try {
            UpdateL2PolicyResponse response = client.updateL2Policy(updateL2PolicyRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
