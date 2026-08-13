package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.ResizeIpv6GatewayRequest;

public class ExampleResizeIpv6Gateway {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        ResizeIpv6GatewayRequest resizeIpv6GatewayRequest = new ResizeIpv6GatewayRequest();
        resizeIpv6GatewayRequest.setGatewayId("");
        resizeIpv6GatewayRequest.setClientToken("");
        resizeIpv6GatewayRequest.setBandwidthInMbps(0);
        try {
            client.resizeIpv6Gateway(resizeIpv6GatewayRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
