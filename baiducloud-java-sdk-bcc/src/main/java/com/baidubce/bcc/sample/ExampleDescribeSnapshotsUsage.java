package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.DescribeSnapshotsUsageRequest;
import com.baidubce.bcc.models.DescribeSnapshotsUsageResponse;

public class ExampleDescribeSnapshotsUsage {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        DescribeSnapshotsUsageRequest describeSnapshotsUsageRequest = new DescribeSnapshotsUsageRequest();
        describeSnapshotsUsageRequest.setAction("");
        try {
            DescribeSnapshotsUsageResponse response = client.describeSnapshotsUsage(describeSnapshotsUsageRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
