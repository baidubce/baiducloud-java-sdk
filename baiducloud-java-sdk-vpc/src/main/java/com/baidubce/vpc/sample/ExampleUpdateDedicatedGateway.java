package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.UpdateDedicatedGatewayRequest;
import java.util.ArrayList;

public class ExampleUpdateDedicatedGateway {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        UpdateDedicatedGatewayRequest updateDedicatedGatewayRequest = new UpdateDedicatedGatewayRequest();
        updateDedicatedGatewayRequest.setEtGatewayId("");
        updateDedicatedGatewayRequest.setClientToken("");
        updateDedicatedGatewayRequest.setName("");
        updateDedicatedGatewayRequest.setSpeed(0);
        updateDedicatedGatewayRequest.setDescription("");
        updateDedicatedGatewayRequest.setLocalCidrs(new ArrayList<>());
        updateDedicatedGatewayRequest.setEnableIpv6(0);
        updateDedicatedGatewayRequest.setIpv6LocalCidrs(new ArrayList<>());
        try {
            client.updateDedicatedGateway(updateDedicatedGatewayRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
