package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.ListSnapshotsRequest;
import com.baidubce.bcc.models.ListSnapshotsResponse;

public class ExampleListSnapshots {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
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
