package com.baidubce.aihc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.aihc.AihcClient;
import com.baidubce.aihc.models.DescribeModelVersionsRequest;
import com.baidubce.aihc.models.DescribeModelVersionsResponse;

public class ExampleDescribeModelVersions {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        AihcClient client = new AihcClient(bceClientConfig);
        DescribeModelVersionsRequest describeModelVersionsRequest = new DescribeModelVersionsRequest();
        describeModelVersionsRequest.setModelId("");
        describeModelVersionsRequest.setPageNumber(0);
        describeModelVersionsRequest.setPageSize(0);
        try {
            DescribeModelVersionsResponse response = client.describeModelVersions(describeModelVersionsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
