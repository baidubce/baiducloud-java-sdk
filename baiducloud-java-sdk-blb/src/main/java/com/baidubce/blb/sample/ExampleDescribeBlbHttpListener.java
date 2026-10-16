package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.DescribeBlbHttpListenerRequest;
import com.baidubce.blb.models.DescribeBlbHttpListenerResponse;

public class ExampleDescribeBlbHttpListener {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        DescribeBlbHttpListenerRequest describeBlbHttpListenerRequest = new DescribeBlbHttpListenerRequest();
        describeBlbHttpListenerRequest.setBlbId("");
        describeBlbHttpListenerRequest.setListenerPort(0);
        describeBlbHttpListenerRequest.setMarker("");
        describeBlbHttpListenerRequest.setMaxKeys(0);
        try {
            DescribeBlbHttpListenerResponse response = client.describeBlbHttpListener(describeBlbHttpListenerRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
