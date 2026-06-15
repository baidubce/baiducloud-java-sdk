package com.baidubce.rapidfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rapidfs.RapidfsClient;
import com.baidubce.rapidfs.models.DescribeDataSrcRequest;
import com.baidubce.rapidfs.models.DescribeDataSrcResponse;

public class ExampleDescribeDataSrc {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        RapidfsClient client = new RapidfsClient(bceClientConfig);
        DescribeDataSrcRequest describeDataSrcRequest = new DescribeDataSrcRequest();
        describeDataSrcRequest.setInstanceId("");
        describeDataSrcRequest.setDataSrcId("");
        try {
            DescribeDataSrcResponse response = client.describeDataSrc(describeDataSrcRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
