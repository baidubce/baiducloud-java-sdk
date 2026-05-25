package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeTopologyV3Request;
import com.baidubce.bcm.models.DescribeTopologyV3Response;

public class ExampleDescribeTopologyV3 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BcmClient client = new BcmClient(config);
        DescribeTopologyV3Request describeTopologyV3Request = new DescribeTopologyV3Request();
        describeTopologyV3Request.setAction("");
        describeTopologyV3Request.setServiceName("");
        describeTopologyV3Request.setEnv("");
        describeTopologyV3Request.setBeginDatetime("");
        describeTopologyV3Request.setEndDatetime("");
        try {
            DescribeTopologyV3Response response = client.describeTopologyV3(describeTopologyV3Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
