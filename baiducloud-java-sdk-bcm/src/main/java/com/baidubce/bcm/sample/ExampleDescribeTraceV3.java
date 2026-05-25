package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeTraceV3Request;
import com.baidubce.bcm.models.DescribeTraceV3Response;
import java.util.ArrayList;

public class ExampleDescribeTraceV3 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BcmClient client = new BcmClient(config);
        DescribeTraceV3Request describeTraceV3Request = new DescribeTraceV3Request();
        describeTraceV3Request.setAction("");
        describeTraceV3Request.setSpanDatetime("");
        describeTraceV3Request.setBeginDatetime("");
        describeTraceV3Request.setEndDatetime("");
        describeTraceV3Request.setTraceId("");
        describeTraceV3Request.setFilters(new ArrayList<>());
        describeTraceV3Request.setReturnHeight(false);
        try {
            DescribeTraceV3Response response = client.describeTraceV3(describeTraceV3Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
