package com.baidubce.agentidentity.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.agentidentity.AgentidentityClient;
import com.baidubce.agentidentity.models.UpdateIdpConfigurationRequest;
import com.baidubce.agentidentity.models.UpdateIdpConfigurationResponse;
import java.util.ArrayList;

public class ExampleUpdateIdpConfiguration {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        AgentidentityClient client = new AgentidentityClient(bceClientConfig);
        UpdateIdpConfigurationRequest updateIdpConfigurationRequest = new UpdateIdpConfigurationRequest();
        updateIdpConfigurationRequest.setUserPoolId("");
        updateIdpConfigurationRequest.setId("");
        updateIdpConfigurationRequest.setName("");
        updateIdpConfigurationRequest.setClientId("");
        updateIdpConfigurationRequest.setClientSecret("");
        updateIdpConfigurationRequest.setAuthorizationEndpoint("");
        updateIdpConfigurationRequest.setTokenEndpoint("");
        updateIdpConfigurationRequest.setUserinfoEndpoint("");
        updateIdpConfigurationRequest.setScopes(new ArrayList<>());
        updateIdpConfigurationRequest.setUserIdClaim("");
        updateIdpConfigurationRequest.setDisplayNameClaim("");
        updateIdpConfigurationRequest.setAutoCreateUser(false);
        try {
            UpdateIdpConfigurationResponse response = client.updateIdpConfiguration(updateIdpConfigurationRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
