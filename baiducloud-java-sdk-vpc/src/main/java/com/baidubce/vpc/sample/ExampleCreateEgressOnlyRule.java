package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateEgressOnlyRuleRequest;
import com.baidubce.vpc.models.CreateEgressOnlyRuleResponse;

public class ExampleCreateEgressOnlyRule {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        CreateEgressOnlyRuleRequest createEgressOnlyRuleRequest = new CreateEgressOnlyRuleRequest();
        createEgressOnlyRuleRequest.setGatewayId("");
        createEgressOnlyRuleRequest.setClientToken("");
        createEgressOnlyRuleRequest.setCidr("");
        try {
            CreateEgressOnlyRuleResponse response = client.createEgressOnlyRule(createEgressOnlyRuleRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
