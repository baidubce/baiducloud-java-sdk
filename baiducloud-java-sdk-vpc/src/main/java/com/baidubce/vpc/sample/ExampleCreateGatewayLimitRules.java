package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateGatewayLimitRulesRequest;
import com.baidubce.vpc.models.CreateGatewayLimitRulesResponse;

public class ExampleCreateGatewayLimitRules {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        CreateGatewayLimitRulesRequest createGatewayLimitRulesRequest = new CreateGatewayLimitRulesRequest();
        createGatewayLimitRulesRequest.setClientToken("");
        createGatewayLimitRulesRequest.setIpVersion("");
        createGatewayLimitRulesRequest.setName("");
        createGatewayLimitRulesRequest.setDescription("");
        createGatewayLimitRulesRequest.setServiceType("");
        createGatewayLimitRulesRequest.setSubServiceType("");
        createGatewayLimitRulesRequest.setPeerRegion("");
        createGatewayLimitRulesRequest.setResourceId("");
        createGatewayLimitRulesRequest.setDirection("");
        createGatewayLimitRulesRequest.setCidr("");
        createGatewayLimitRulesRequest.setBandwidth(0);
        try {
            CreateGatewayLimitRulesResponse response = client.createGatewayLimitRules(createGatewayLimitRulesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
