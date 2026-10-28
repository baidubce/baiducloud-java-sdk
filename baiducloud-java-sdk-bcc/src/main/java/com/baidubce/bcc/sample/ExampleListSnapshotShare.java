package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.ListSnapshotShareRequest;
import com.baidubce.bcc.models.ListSnapshotShareResponse;

public class ExampleListSnapshotShare {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        ListSnapshotShareRequest listSnapshotShareRequest = new ListSnapshotShareRequest();
        listSnapshotShareRequest.setMarker("");
        listSnapshotShareRequest.setMaxKeys(0);
        try {
            ListSnapshotShareResponse response = client.listSnapshotShare(listSnapshotShareRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
