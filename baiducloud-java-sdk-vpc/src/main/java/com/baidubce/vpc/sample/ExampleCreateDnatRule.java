package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateDnatRuleRequest;
import com.baidubce.vpc.models.CreateDnatRuleResponse;

public class ExampleCreateDnatRule {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

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
