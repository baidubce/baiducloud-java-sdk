package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeSpansV3Request;
import com.baidubce.bcm.models.DescribeSpansV3Response;
import java.util.ArrayList;

public class ExampleDescribeSpansV3 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BcmClient client = new BcmClient(config);
        DescribeSpansV3Request describeSpansV3Request = new DescribeSpansV3Request();
        describeSpansV3Request.setAction("");
        describeSpansV3Request.setBeginDatetime("");
        describeSpansV3Request.setEndDatetime("");
        describeSpansV3Request.setFilters(new ArrayList<>());
        describeSpansV3Request.setOrderBy("");
        describeSpansV3Request.setOrder("");
        describeSpansV3Request.setMarker("");
        try {
            DescribeSpansV3Response response = client.describeSpansV3(describeSpansV3Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
