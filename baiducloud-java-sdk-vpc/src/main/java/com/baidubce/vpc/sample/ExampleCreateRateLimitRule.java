package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateRateLimitRuleRequest;
import com.baidubce.vpc.models.CreateRateLimitRuleResponse;

public class ExampleCreateRateLimitRule {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        CreateRateLimitRuleRequest createRateLimitRuleRequest = new CreateRateLimitRuleRequest();
        createRateLimitRuleRequest.setGatewayId("");
        createRateLimitRuleRequest.setClientToken("");
        createRateLimitRuleRequest.setIpv6Address("");
        createRateLimitRuleRequest.setIngressBandwidthInMbps(0);
        createRateLimitRuleRequest.setEgressBandwidthInMbps(0);
        try {
            CreateRateLimitRuleResponse response = client.createRateLimitRule(createRateLimitRuleRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
