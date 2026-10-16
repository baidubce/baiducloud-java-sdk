package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.DescribeAppBlbPolicyRequest;
import com.baidubce.blb.models.DescribeAppBlbPolicyResponse;

public class ExampleDescribeAppBlbPolicy {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        DescribeAppBlbPolicyRequest describeAppBlbPolicyRequest = new DescribeAppBlbPolicyRequest();
        describeAppBlbPolicyRequest.setBlbId("");
        describeAppBlbPolicyRequest.setPort(0);
        describeAppBlbPolicyRequest.setType("");
        describeAppBlbPolicyRequest.setMarker("");
        describeAppBlbPolicyRequest.setMaxKeys(0);
        try {
            DescribeAppBlbPolicyResponse response = client.describeAppBlbPolicy(describeAppBlbPolicyRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
