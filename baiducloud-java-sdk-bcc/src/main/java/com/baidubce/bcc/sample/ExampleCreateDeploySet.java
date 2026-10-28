package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.CreateDeploySetRequest;
import com.baidubce.bcc.models.CreateDeploySetResponse;

public class ExampleCreateDeploySet {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        CreateDeploySetRequest createDeploySetRequest = new CreateDeploySetRequest();
        createDeploySetRequest.setName("");
        createDeploySetRequest.setDesc("");
        createDeploySetRequest.setStrategy("");
        createDeploySetRequest.setConcurrency(0);
        try {
            CreateDeploySetResponse response = client.createDeploySet(createDeploySetRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
