package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.DescribeAppBlbTcpListenerRequest;
import com.baidubce.blb.models.DescribeAppBlbTcpListenerResponse;

public class ExampleDescribeAppBlbTcpListener {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        DescribeAppBlbTcpListenerRequest describeAppBlbTcpListenerRequest = new DescribeAppBlbTcpListenerRequest();
        describeAppBlbTcpListenerRequest.setBlbId("");
        describeAppBlbTcpListenerRequest.setListenerPort(0);
        describeAppBlbTcpListenerRequest.setMarker("");
        describeAppBlbTcpListenerRequest.setMaxKeys(0);
        try {
            DescribeAppBlbTcpListenerResponse response = client.describeAppBlbTcpListener(describeAppBlbTcpListenerRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
