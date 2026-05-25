package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeDbStatementV3Request;
import com.baidubce.bcm.models.DescribeDbStatementV3Response;
import java.util.ArrayList;

public class ExampleDescribeDbStatementV3 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BcmClient client = new BcmClient(config);
        DescribeDbStatementV3Request describeDbStatementV3Request = new DescribeDbStatementV3Request();
        describeDbStatementV3Request.setBeginDatetime("");
        describeDbStatementV3Request.setEndDatetime("");
        describeDbStatementV3Request.setService("");
        describeDbStatementV3Request.setStatements(new ArrayList<>());
        try {
            DescribeDbStatementV3Response response = client.describeDbStatementV3(describeDbStatementV3Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
