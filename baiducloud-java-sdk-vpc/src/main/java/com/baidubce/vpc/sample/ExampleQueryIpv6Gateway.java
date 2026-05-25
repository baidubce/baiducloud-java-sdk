package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.QueryIpv6GatewayRequest;
import com.baidubce.vpc.models.QueryIpv6GatewayResponse;

public class ExampleQueryIpv6Gateway {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        VpcClient client = new VpcClient(config);
        QueryIpv6GatewayRequest queryIpv6GatewayRequest = new QueryIpv6GatewayRequest();
        queryIpv6GatewayRequest.setVpcId("");
        try {
            QueryIpv6GatewayResponse response = client.queryIpv6Gateway(queryIpv6GatewayRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
