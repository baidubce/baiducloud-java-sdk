package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeSpanFieldValuesV3Request;
import com.baidubce.bcm.models.DescribeSpanFieldValuesV3Response;
import java.util.ArrayList;

public class ExampleDescribeSpanFieldValuesV3 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BcmClient client = new BcmClient(config);
        DescribeSpanFieldValuesV3Request describeSpanFieldValuesV3Request = new DescribeSpanFieldValuesV3Request();
        describeSpanFieldValuesV3Request.setAction("");
        describeSpanFieldValuesV3Request.setBeginDatetime("");
        describeSpanFieldValuesV3Request.setEndDatetime("");
        describeSpanFieldValuesV3Request.setKey("");
        describeSpanFieldValuesV3Request.setFilters(new ArrayList<>());
        try {
            DescribeSpanFieldValuesV3Response response = client.describeSpanFieldValuesV3(describeSpanFieldValuesV3Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
