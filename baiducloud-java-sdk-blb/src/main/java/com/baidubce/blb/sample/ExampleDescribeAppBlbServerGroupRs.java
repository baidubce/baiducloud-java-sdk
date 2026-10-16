package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.DescribeAppBlbServerGroupRsRequest;
import com.baidubce.blb.models.DescribeAppBlbServerGroupRsResponse;

public class ExampleDescribeAppBlbServerGroupRs {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        DescribeAppBlbServerGroupRsRequest describeAppBlbServerGroupRsRequest = new DescribeAppBlbServerGroupRsRequest();
        describeAppBlbServerGroupRsRequest.setBlbId("");
        describeAppBlbServerGroupRsRequest.setSgId("");
        describeAppBlbServerGroupRsRequest.setMarker("");
        describeAppBlbServerGroupRsRequest.setMaxKeys(0);
        try {
            DescribeAppBlbServerGroupRsResponse response = client.describeAppBlbServerGroupRs(describeAppBlbServerGroupRsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
