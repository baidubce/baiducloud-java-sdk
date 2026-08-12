package com.baidubce.ax.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.BceApiKeyCredentials;
import com.baidubce.ax.AxClient;
import com.baidubce.ax.models.BatchReleaseSandboxesRequest;
import com.baidubce.ax.models.BatchReleaseSandboxesResponse;
import java.util.ArrayList;

public class ExampleBatchReleaseSandboxes {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        // String ak = "Your Ak";
        // String sk = "Your Sk";
        // bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        // ==== API Key 鉴权 ====
        String apiKey = "Your ApiKey";
        bceClientConfig.setCredentials(new BceApiKeyCredentials(apiKey));

        AxClient client = new AxClient(bceClientConfig);
        BatchReleaseSandboxesRequest batchReleaseSandboxesRequest = new BatchReleaseSandboxesRequest();
        batchReleaseSandboxesRequest.setSandboxIds(new ArrayList<>());
        try {
            BatchReleaseSandboxesResponse response = client.batchReleaseSandboxes(batchReleaseSandboxesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
