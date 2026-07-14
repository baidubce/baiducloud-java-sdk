package com.baidubce.agentidentity.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.agentidentity.AgentidentityClient;
import com.baidubce.agentidentity.models.UpdateAgentRequest;
import com.baidubce.agentidentity.models.UpdateAgentResponse;
import java.util.ArrayList;

public class ExampleUpdateAgent {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        AgentidentityClient client = new AgentidentityClient(bceClientConfig);
        UpdateAgentRequest updateAgentRequest = new UpdateAgentRequest();
        updateAgentRequest.setAgentId("");
        updateAgentRequest.setDescription("");
        updateAgentRequest.setAllowedResourceOauth2ReturnUrls(new ArrayList<>());
        try {
            UpdateAgentResponse response = client.updateAgent(updateAgentRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
