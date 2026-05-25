package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateIpv6GatewaySpeedLimitPolicyRequest;
import com.baidubce.vpc.models.CreateIpv6GatewaySpeedLimitPolicyResponse;

public class ExampleCreateIpv6GatewaySpeedLimitPolicy {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        VpcClient client = new VpcClient(config);
        CreateIpv6GatewaySpeedLimitPolicyRequest createIpv6GatewaySpeedLimitPolicyRequest = new CreateIpv6GatewaySpeedLimitPolicyRequest();
        createIpv6GatewaySpeedLimitPolicyRequest.setGatewayId("");
        createIpv6GatewaySpeedLimitPolicyRequest.setClientToken("");
        createIpv6GatewaySpeedLimitPolicyRequest.setIpv6Address("");
        createIpv6GatewaySpeedLimitPolicyRequest.setIngressBandwidthInMbps(0);
        createIpv6GatewaySpeedLimitPolicyRequest.setEgressBandwidthInMbps(0);
        try {
            CreateIpv6GatewaySpeedLimitPolicyResponse response = client.createIpv6GatewaySpeedLimitPolicy(createIpv6GatewaySpeedLimitPolicyRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
