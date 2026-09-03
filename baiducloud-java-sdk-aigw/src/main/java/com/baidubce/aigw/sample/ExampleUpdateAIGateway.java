package com.baidubce.aigw.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.aigw.AigwClient;
import com.baidubce.aigw.models.UpdateAIGatewayRequest;
import com.baidubce.aigw.models.UpdateAIGatewayResponse;
import java.util.ArrayList;

public class ExampleUpdateAIGateway {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        AigwClient client = new AigwClient(bceClientConfig);
        UpdateAIGatewayRequest updateAIGatewayRequest = new UpdateAIGatewayRequest();
        updateAIGatewayRequest.setInstanceId("");
        updateAIGatewayRequest.setXRegion("");
        updateAIGatewayRequest.setName("");
        updateAIGatewayRequest.setDescription("");
        updateAIGatewayRequest.setDeleteProtection(false);
        updateAIGatewayRequest.setPublicAccessible(false);
        updateAIGatewayRequest.setReplicas(0);
        updateAIGatewayRequest.setNetworkTypes(new ArrayList<>());
        updateAIGatewayRequest.setTags(new ArrayList<>());
        try {
            UpdateAIGatewayResponse response = client.updateAIGateway(updateAIGatewayRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
