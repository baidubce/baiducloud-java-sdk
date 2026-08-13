package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.DescribeL3MountTargetRequest;
import com.baidubce.pfs.models.DescribeL3MountTargetResponse;

public class ExampleDescribeL3MountTarget {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        DescribeL3MountTargetRequest describeL3MountTargetRequest = new DescribeL3MountTargetRequest();
        describeL3MountTargetRequest.setInstanceId("");
        describeL3MountTargetRequest.setMountTargetId("");
        try {
            DescribeL3MountTargetResponse response = client.describeL3MountTarget(describeL3MountTargetRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
