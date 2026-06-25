package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateDedicatedGatewayRequest;
import com.baidubce.vpc.models.CreateDedicatedGatewayResponse;
import java.util.ArrayList;

public class ExampleCreateDedicatedGateway {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        VpcClient client = new VpcClient(bceClientConfig);
        CreateDedicatedGatewayRequest createDedicatedGatewayRequest = new CreateDedicatedGatewayRequest();
        createDedicatedGatewayRequest.setClientToken("");
        createDedicatedGatewayRequest.setName("");
        createDedicatedGatewayRequest.setVpcId("");
        createDedicatedGatewayRequest.setSpeed(0);
        createDedicatedGatewayRequest.setDescription("");
        createDedicatedGatewayRequest.setEtId("");
        createDedicatedGatewayRequest.setChannelId("");
        createDedicatedGatewayRequest.setLocalCidrs(new ArrayList<>());
        createDedicatedGatewayRequest.setTags(new ArrayList<>());
        createDedicatedGatewayRequest.setResourceGroupId("");
        try {
            CreateDedicatedGatewayResponse response = client.createDedicatedGateway(createDedicatedGatewayRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
