package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.DescribeBlbServersRequest;
import com.baidubce.blb.models.DescribeBlbServersResponse;

public class ExampleDescribeBlbServers {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        DescribeBlbServersRequest describeBlbServersRequest = new DescribeBlbServersRequest();
        describeBlbServersRequest.setBlbId("");
        describeBlbServersRequest.setMarker("");
        describeBlbServersRequest.setMaxKeys(0);
        try {
            DescribeBlbServersResponse response = client.describeBlbServers(describeBlbServersRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
