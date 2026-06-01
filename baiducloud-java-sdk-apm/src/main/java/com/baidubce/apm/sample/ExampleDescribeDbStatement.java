package com.baidubce.apm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.apm.ApmClient;
import com.baidubce.apm.models.DescribeDbStatementRequest;
import com.baidubce.apm.models.DescribeDbStatementResponse;
import java.util.ArrayList;

public class ExampleDescribeDbStatement {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        ApmClient client = new ApmClient(config);
        DescribeDbStatementRequest describeDbStatementRequest = new DescribeDbStatementRequest();
        describeDbStatementRequest.setBeginDatetime("");
        describeDbStatementRequest.setEndDatetime("");
        describeDbStatementRequest.setService("");
        describeDbStatementRequest.setStatements(new ArrayList<>());
        try {
            DescribeDbStatementResponse response = client.describeDbStatement(describeDbStatementRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
