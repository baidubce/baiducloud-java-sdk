package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.DescribeL3AccessGroupRequest;
import com.baidubce.pfs.models.DescribeL3AccessGroupResponse;

public class ExampleDescribeL3AccessGroup {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        DescribeL3AccessGroupRequest describeL3AccessGroupRequest = new DescribeL3AccessGroupRequest();
        describeL3AccessGroupRequest.setAccessGroupName("");
        describeL3AccessGroupRequest.setZoneName("");
        try {
            DescribeL3AccessGroupResponse response = client.describeL3AccessGroup(describeL3AccessGroupRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
