package com.baidubce.agentidentity.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.agentidentity.AgentidentityClient;
import com.baidubce.agentidentity.models.CreateIdpConfigurationRequest;
import java.util.ArrayList;

public class ExampleCreateIdpConfiguration {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        AgentidentityClient client = new AgentidentityClient(bceClientConfig);
        CreateIdpConfigurationRequest createIdpConfigurationRequest = new CreateIdpConfigurationRequest();
        createIdpConfigurationRequest.setUserPoolId("");
        createIdpConfigurationRequest.setName("");
        createIdpConfigurationRequest.setIdpType("");
        createIdpConfigurationRequest.setIdpProvider("");
        createIdpConfigurationRequest.setClientId("");
        createIdpConfigurationRequest.setClientSecret("");
        createIdpConfigurationRequest.setDiscoveryUrl("");
        createIdpConfigurationRequest.setAuthorizationEndpoint("");
        createIdpConfigurationRequest.setTokenEndpoint("");
        createIdpConfigurationRequest.setUserinfoEndpoint("");
        createIdpConfigurationRequest.setScopes(new ArrayList<>());
        createIdpConfigurationRequest.setUserIdClaim("");
        createIdpConfigurationRequest.setDisplayNameClaim("");
        createIdpConfigurationRequest.setAutoCreateUser(false);
        try {
            client.createIdpConfiguration(createIdpConfigurationRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
