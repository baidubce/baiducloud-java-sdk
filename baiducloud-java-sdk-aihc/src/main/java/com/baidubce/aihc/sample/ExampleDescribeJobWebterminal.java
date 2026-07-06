package com.baidubce.aihc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.aihc.AihcClient;
import com.baidubce.aihc.models.DescribeJobWebterminalRequest;
import com.baidubce.aihc.models.DescribeJobWebterminalResponse;

public class ExampleDescribeJobWebterminal {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        AihcClient client = new AihcClient(bceClientConfig);
        DescribeJobWebterminalRequest describeJobWebterminalRequest = new DescribeJobWebterminalRequest();
        describeJobWebterminalRequest.setJobId("");
        describeJobWebterminalRequest.setPodName("");
        describeJobWebterminalRequest.setHandshakeTimeoutSecond("");
        describeJobWebterminalRequest.setPingTimeoutSecond("");
        try {
            DescribeJobWebterminalResponse response = client.describeJobWebterminal(describeJobWebterminalRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
