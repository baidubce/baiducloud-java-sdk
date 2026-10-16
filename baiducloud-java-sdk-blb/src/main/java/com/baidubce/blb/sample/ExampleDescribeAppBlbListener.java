package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.DescribeAppBlbListenerRequest;
import com.baidubce.blb.models.DescribeAppBlbListenerResponse;

public class ExampleDescribeAppBlbListener {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        DescribeAppBlbListenerRequest describeAppBlbListenerRequest = new DescribeAppBlbListenerRequest();
        describeAppBlbListenerRequest.setBlbId("");
        describeAppBlbListenerRequest.setListenerPort(0);
        describeAppBlbListenerRequest.setMarker("");
        describeAppBlbListenerRequest.setMaxKeys(0);
        try {
            DescribeAppBlbListenerResponse response = client.describeAppBlbListener(describeAppBlbListenerRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
