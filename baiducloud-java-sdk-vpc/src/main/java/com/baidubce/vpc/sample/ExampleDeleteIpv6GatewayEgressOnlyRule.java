package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.DeleteIpv6GatewayEgressOnlyRuleRequest;

public class ExampleDeleteIpv6GatewayEgressOnlyRule {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        DeleteIpv6GatewayEgressOnlyRuleRequest deleteIpv6GatewayEgressOnlyRuleRequest = new DeleteIpv6GatewayEgressOnlyRuleRequest();
        deleteIpv6GatewayEgressOnlyRuleRequest.setGatewayId("");
        deleteIpv6GatewayEgressOnlyRuleRequest.setEgressOnlyRuleId("");
        deleteIpv6GatewayEgressOnlyRuleRequest.setClientToken("");
        try {
            client.deleteIpv6GatewayEgressOnlyRule(deleteIpv6GatewayEgressOnlyRuleRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
