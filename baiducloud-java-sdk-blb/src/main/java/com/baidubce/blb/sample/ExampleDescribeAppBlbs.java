package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.DescribeAppBlbsRequest;
import com.baidubce.blb.models.DescribeAppBlbsResponse;

public class ExampleDescribeAppBlbs {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        DescribeAppBlbsRequest describeAppBlbsRequest = new DescribeAppBlbsRequest();
        describeAppBlbsRequest.setAddress("");
        describeAppBlbsRequest.setName("");
        describeAppBlbsRequest.setBlbId("");
        describeAppBlbsRequest.setBccId("");
        describeAppBlbsRequest.setExactlyMatch(false);
        describeAppBlbsRequest.setMarker("");
        describeAppBlbsRequest.setMaxKeys(0);
        describeAppBlbsRequest.setType("");
        try {
            DescribeAppBlbsResponse response = client.describeAppBlbs(describeAppBlbsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
