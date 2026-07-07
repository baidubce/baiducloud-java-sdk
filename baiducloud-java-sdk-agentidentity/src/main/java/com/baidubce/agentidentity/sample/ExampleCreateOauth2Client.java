package com.baidubce.agentidentity.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.agentidentity.AgentidentityClient;
import com.baidubce.agentidentity.models.CreateOauth2ClientRequest;
import java.util.ArrayList;

public class ExampleCreateOauth2Client {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        AgentidentityClient client = new AgentidentityClient(bceClientConfig);
        CreateOauth2ClientRequest createOauth2ClientRequest = new CreateOauth2ClientRequest();
        createOauth2ClientRequest.setUserPoolId("");
        createOauth2ClientRequest.setName("");
        createOauth2ClientRequest.setDescription("");
        createOauth2ClientRequest.setClientType("");
        createOauth2ClientRequest.setRedirectUris(new ArrayList<>());
        createOauth2ClientRequest.setGrantTypes(new ArrayList<>());
        createOauth2ClientRequest.setScopes(new ArrayList<>());
        createOauth2ClientRequest.setAccessTokenTtl(0);
        createOauth2ClientRequest.setRefreshTokenTtl(0);
        try {
            client.createOauth2Client(createOauth2ClientRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
