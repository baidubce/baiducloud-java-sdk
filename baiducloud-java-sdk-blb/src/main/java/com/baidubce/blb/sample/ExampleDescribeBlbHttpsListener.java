package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.DescribeBlbHttpsListenerRequest;
import com.baidubce.blb.models.DescribeBlbHttpsListenerResponse;

public class ExampleDescribeBlbHttpsListener {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BlbClient client = new BlbClient(config);
        DescribeBlbHttpsListenerRequest describeBlbHttpsListenerRequest = new DescribeBlbHttpsListenerRequest();
        describeBlbHttpsListenerRequest.setBlbId("");
        describeBlbHttpsListenerRequest.setListenerPort(0);
        describeBlbHttpsListenerRequest.setMarker("");
        describeBlbHttpsListenerRequest.setMaxKeys(0);
        try {
            DescribeBlbHttpsListenerResponse response = client.describeBlbHttpsListener(describeBlbHttpsListenerRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
