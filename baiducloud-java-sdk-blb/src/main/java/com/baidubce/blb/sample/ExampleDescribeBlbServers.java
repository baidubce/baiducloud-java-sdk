package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.DescribeBlbServersRequest;
import com.baidubce.blb.models.DescribeBlbServersResponse;

public class ExampleDescribeBlbServers {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
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
