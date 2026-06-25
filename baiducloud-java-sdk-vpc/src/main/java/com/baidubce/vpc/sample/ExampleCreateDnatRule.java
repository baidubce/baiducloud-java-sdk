package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateDnatRuleRequest;
import com.baidubce.vpc.models.CreateDnatRuleResponse;

public class ExampleCreateDnatRule {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        VpcClient client = new VpcClient(bceClientConfig);
        CreateDnatRuleRequest createDnatRuleRequest = new CreateDnatRuleRequest();
        createDnatRuleRequest.setNatId("");
        createDnatRuleRequest.setClientToken("");
        createDnatRuleRequest.setRuleName("");
        createDnatRuleRequest.setPublicIpAddress("");
        createDnatRuleRequest.setPrivateIpAddress("");
        createDnatRuleRequest.setProtocol("");
        createDnatRuleRequest.setPublicPort(0);
        createDnatRuleRequest.setPrivatePort(0);
        createDnatRuleRequest.setPublicPortRange("");
        createDnatRuleRequest.setPrivatePortRange("");
        try {
            CreateDnatRuleResponse response = client.createDnatRule(createDnatRuleRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
