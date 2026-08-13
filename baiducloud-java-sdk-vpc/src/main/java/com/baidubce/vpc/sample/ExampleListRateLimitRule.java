package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.ListRateLimitRuleRequest;
import com.baidubce.vpc.models.ListRateLimitRuleResponse;

public class ExampleListRateLimitRule {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        ListRateLimitRuleRequest listRateLimitRuleRequest = new ListRateLimitRuleRequest();
        listRateLimitRuleRequest.setGatewayId("");
        listRateLimitRuleRequest.setMarker("");
        listRateLimitRuleRequest.setMaxKeys(0);
        try {
            ListRateLimitRuleResponse response = client.listRateLimitRule(listRateLimitRuleRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
