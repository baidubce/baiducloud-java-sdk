package com.baidubce.ax.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.BceApiKeyCredentials;
import com.baidubce.ax.AxClient;
import com.baidubce.ax.models.GetSandboxSnapshotRequest;
import com.baidubce.ax.models.GetSandboxSnapshotResponse;

public class ExampleGetSandboxSnapshot {
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
        GetSandboxSnapshotRequest getSandboxSnapshotRequest = new GetSandboxSnapshotRequest();
        getSandboxSnapshotRequest.setSandboxID("");
        getSandboxSnapshotRequest.setSnapshotID("");
        try {
            GetSandboxSnapshotResponse response = client.getSandboxSnapshot(getSandboxSnapshotRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
