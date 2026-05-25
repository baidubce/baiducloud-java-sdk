package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.AddIpv6OnlyOutboundAndNoInboundPolicyRequest;
import com.baidubce.vpc.models.AddIpv6OnlyOutboundAndNoInboundPolicyResponse;

public class ExampleAddIpv6OnlyOutboundAndNoInboundPolicy {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        VpcClient client = new VpcClient(config);
        AddIpv6OnlyOutboundAndNoInboundPolicyRequest addIpv6OnlyOutboundAndNoInboundPolicyRequest = new AddIpv6OnlyOutboundAndNoInboundPolicyRequest();
        addIpv6OnlyOutboundAndNoInboundPolicyRequest.setGatewayId("");
        addIpv6OnlyOutboundAndNoInboundPolicyRequest.setClientToken("");
        addIpv6OnlyOutboundAndNoInboundPolicyRequest.setCidr("");
        try {
            AddIpv6OnlyOutboundAndNoInboundPolicyResponse response = client.addIpv6OnlyOutboundAndNoInboundPolicy(addIpv6OnlyOutboundAndNoInboundPolicyRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
