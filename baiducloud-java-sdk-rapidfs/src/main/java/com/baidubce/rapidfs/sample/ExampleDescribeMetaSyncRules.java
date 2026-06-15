package com.baidubce.rapidfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rapidfs.RapidfsClient;
import com.baidubce.rapidfs.models.DescribeMetaSyncRulesRequest;
import com.baidubce.rapidfs.models.DescribeMetaSyncRulesResponse;
import java.util.ArrayList;

public class ExampleDescribeMetaSyncRules {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        RapidfsClient client = new RapidfsClient(bceClientConfig);
        DescribeMetaSyncRulesRequest describeMetaSyncRulesRequest = new DescribeMetaSyncRulesRequest();
        describeMetaSyncRulesRequest.setInstanceId("");
        describeMetaSyncRulesRequest.setFilters(new ArrayList<>());
        describeMetaSyncRulesRequest.setMaxKeys(0);
        describeMetaSyncRulesRequest.setMarker("");
        try {
            DescribeMetaSyncRulesResponse response = client.describeMetaSyncRules(describeMetaSyncRulesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
