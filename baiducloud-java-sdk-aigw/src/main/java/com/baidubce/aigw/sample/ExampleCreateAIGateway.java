package com.baidubce.aigw.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.aigw.AigwClient;
import com.baidubce.aigw.models.CreateAIGatewayRequest;
import com.baidubce.aigw.models.CreateAIGatewayResponse;
import com.baidubce.aigw.models.AihcArgs;
import java.util.ArrayList;

public class ExampleCreateAIGateway {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        AigwClient client = new AigwClient(bceClientConfig);
        AihcArgs aihcArgs = new AihcArgs();
        aihcArgs.setAccountId("");
        aihcArgs.setSubnetId("");
        aihcArgs.setSecurityGroupIds("");
        aihcArgs.setVpcCidr("");
        aihcArgs.setDomainPrefix("");

        CreateAIGatewayRequest createAIGatewayRequest = new CreateAIGatewayRequest();
        createAIGatewayRequest.setXRegion("");
        createAIGatewayRequest.setName("");
        createAIGatewayRequest.setVpcId("");
        createAIGatewayRequest.setVpcCidr("");
        createAIGatewayRequest.setSubnetId("");
        createAIGatewayRequest.setGatewayType("");
        createAIGatewayRequest.setIsInternal("");
        createAIGatewayRequest.setNetworkTypes(new ArrayList<>());
        createAIGatewayRequest.setReplicas(0);
        createAIGatewayRequest.setInstallMode("");
        createAIGatewayRequest.setDescription("");
        createAIGatewayRequest.setDeleteProtection(false);
        createAIGatewayRequest.setSrcProduct("");
        createAIGatewayRequest.setAccountId("");
        createAIGatewayRequest.setWorkspaceId("");
        createAIGatewayRequest.setWorkspaceName("");
        createAIGatewayRequest.setBlbId("");
        createAIGatewayRequest.setBlbIp("");
        createAIGatewayRequest.setClusters(new ArrayList<>());
        createAIGatewayRequest.setCpromInstanceId("");
        createAIGatewayRequest.setCpromBearerToken("");
        createAIGatewayRequest.setBlsEnabled(false);
        createAIGatewayRequest.setLogStoreName("");
        createAIGatewayRequest.setVersion("");
        createAIGatewayRequest.setTags(new ArrayList<>());
        createAIGatewayRequest.setResourceGroupId("");
        createAIGatewayRequest.setAihcArgs(aihcArgs);
        try {
            CreateAIGatewayResponse response = client.createAIGateway(createAIGatewayRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
