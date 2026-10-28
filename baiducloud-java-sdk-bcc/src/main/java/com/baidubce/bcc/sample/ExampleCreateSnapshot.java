package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.CreateSnapshotRequest;
import com.baidubce.bcc.models.CreateSnapshotResponse;
import java.util.ArrayList;

public class ExampleCreateSnapshot {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        CreateSnapshotRequest createSnapshotRequest = new CreateSnapshotRequest();
        createSnapshotRequest.setVolumeId("");
        createSnapshotRequest.setSnapshotName("");
        createSnapshotRequest.setDesc("");
        createSnapshotRequest.setTags(new ArrayList<>());
        createSnapshotRequest.setRetentionInDays(0);
        try {
            CreateSnapshotResponse response = client.createSnapshot(createSnapshotRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
