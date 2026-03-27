package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateGatewayLimitRulesRequest;
import com.baidubce.vpc.models.CreateGatewayLimitRulesResponse;

public class ExampleCreateGatewayLimitRules {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        VpcClient client = new VpcClient(config);
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
