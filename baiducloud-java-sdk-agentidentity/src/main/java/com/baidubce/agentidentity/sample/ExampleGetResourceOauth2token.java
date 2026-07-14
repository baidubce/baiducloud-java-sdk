package com.baidubce.agentidentity.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.agentidentity.AgentidentityClient;
import com.baidubce.agentidentity.models.GetResourceOauth2tokenRequest;
import com.baidubce.agentidentity.models.GetResourceOauth2tokenResponse;
import java.util.ArrayList;

public class ExampleGetResourceOauth2token {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        AgentidentityClient client = new AgentidentityClient(bceClientConfig);
        GetResourceOauth2tokenRequest getResourceOauth2tokenRequest = new GetResourceOauth2tokenRequest();
        getResourceOauth2tokenRequest.setXBceWorkloadAccessToken("");
        getResourceOauth2tokenRequest.setResourceCredentialProviderName("");
        getResourceOauth2tokenRequest.setScopes(new ArrayList<>());
        getResourceOauth2tokenRequest.setOauth2Flow("");
        getResourceOauth2tokenRequest.setResourceOauth2ReturnUrl("");
        getResourceOauth2tokenRequest.setSessionUri("");
        getResourceOauth2tokenRequest.setForceAuthentication(false);
        getResourceOauth2tokenRequest.setWorkloadAccessToken("");
        try {
            GetResourceOauth2tokenResponse response = client.getResourceOauth2token(getResourceOauth2tokenRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
