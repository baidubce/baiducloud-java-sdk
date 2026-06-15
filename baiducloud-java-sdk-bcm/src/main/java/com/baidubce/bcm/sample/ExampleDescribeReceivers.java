package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeReceiversRequest;
import com.baidubce.bcm.models.DescribeReceiversResponse;

public class ExampleDescribeReceivers {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BcmClient client = new BcmClient(bceClientConfig);
        DescribeReceiversRequest describeReceiversRequest = new DescribeReceiversRequest();
        describeReceiversRequest.setType("");
        describeReceiversRequest.setName("");
        describeReceiversRequest.setPageNo(0);
        describeReceiversRequest.setPageSize(0);
        try {
            DescribeReceiversResponse response = client.describeReceivers(describeReceiversRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
