package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.HasInspectingTaskRequest;
import com.baidubce.cce.models.HasInspectingTaskResponse;

public class ExampleHasInspectingTask {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CceClient client = new CceClient(bceClientConfig);
        HasInspectingTaskRequest hasInspectingTaskRequest = new HasInspectingTaskRequest();
        hasInspectingTaskRequest.setClusterID("");
        try {
            HasInspectingTaskResponse response = client.hasInspectingTask(hasInspectingTaskRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
