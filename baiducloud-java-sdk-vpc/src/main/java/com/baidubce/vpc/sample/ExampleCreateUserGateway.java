package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateUserGatewayRequest;
import com.baidubce.vpc.models.CreateUserGatewayResponse;

public class ExampleCreateUserGateway {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        CreateUserGatewayRequest createUserGatewayRequest = new CreateUserGatewayRequest();
        createUserGatewayRequest.setClientToken("");
        createUserGatewayRequest.setName("");
        createUserGatewayRequest.setIp("");
        createUserGatewayRequest.setDescription("");
        try {
            CreateUserGatewayResponse response = client.createUserGateway(createUserGatewayRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
