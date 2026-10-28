package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.ListSnapshotsRequest;
import com.baidubce.bcc.models.ListSnapshotsResponse;

public class ExampleListSnapshots {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        ListSnapshotsRequest listSnapshotsRequest = new ListSnapshotsRequest();
        listSnapshotsRequest.setMarker("");
        listSnapshotsRequest.setMaxKeys(0);
        listSnapshotsRequest.setVolumeId("");
        try {
            ListSnapshotsResponse response = client.listSnapshots(listSnapshotsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
