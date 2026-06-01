package com.baidubce.apm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.apm.ApmClient;
import com.baidubce.apm.models.DescribeExceptionsRequest;
import com.baidubce.apm.models.DescribeExceptionsResponse;
import java.util.ArrayList;

public class ExampleDescribeExceptions {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        ApmClient client = new ApmClient(config);
        DescribeExceptionsRequest describeExceptionsRequest = new DescribeExceptionsRequest();
        describeExceptionsRequest.setBeginDatetime("");
        describeExceptionsRequest.setEndDatetime("");
        describeExceptionsRequest.setService("");
        describeExceptionsRequest.setExceptions(new ArrayList<>());
        try {
            DescribeExceptionsResponse response = client.describeExceptions(describeExceptionsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
