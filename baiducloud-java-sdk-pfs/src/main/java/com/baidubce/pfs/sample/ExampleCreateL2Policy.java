package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.CreateL2PolicyRequest;
import com.baidubce.pfs.models.CreateL2PolicyResponse;

public class ExampleCreateL2Policy {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        CreateL2PolicyRequest createL2PolicyRequest = new CreateL2PolicyRequest();
        createL2PolicyRequest.setInstanceId("");
        createL2PolicyRequest.setPolicyName("");
        createL2PolicyRequest.setPath("");
        createL2PolicyRequest.setExpiredTime(0);
        createL2PolicyRequest.setType(0);
        createL2PolicyRequest.setExecuteTime(0);
        createL2PolicyRequest.setBucketName("");
        createL2PolicyRequest.setBucketPrefix("");
        try {
            CreateL2PolicyResponse response = client.createL2Policy(createL2PolicyRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
