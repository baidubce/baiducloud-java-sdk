package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.ViewGatewayLimitRulesRequest;
import com.baidubce.vpc.models.ViewGatewayLimitRulesResponse;

public class ExampleViewGatewayLimitRules {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        ViewGatewayLimitRulesRequest viewGatewayLimitRulesRequest = new ViewGatewayLimitRulesRequest();
        viewGatewayLimitRulesRequest.setServiceType("");
        viewGatewayLimitRulesRequest.setName("");
        viewGatewayLimitRulesRequest.setGlrId("");
        viewGatewayLimitRulesRequest.setResourceId("");
        viewGatewayLimitRulesRequest.setMarker("");
        viewGatewayLimitRulesRequest.setMaxKeys("");
        try {
            ViewGatewayLimitRulesResponse response = client.viewGatewayLimitRules(viewGatewayLimitRulesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
