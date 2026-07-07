package com.baidubce.agentidentity.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.agentidentity.AgentidentityClient;
import com.baidubce.agentidentity.models.ListOauth2ClientsRequest;
import com.baidubce.agentidentity.models.ListOauth2ClientsResponse;

public class ExampleListOauth2Clients {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        AgentidentityClient client = new AgentidentityClient(bceClientConfig);
        ListOauth2ClientsRequest listOauth2ClientsRequest = new ListOauth2ClientsRequest();
        listOauth2ClientsRequest.setUserPoolId("");
        listOauth2ClientsRequest.setKeyword("");
        listOauth2ClientsRequest.setPageNo(0);
        listOauth2ClientsRequest.setPageSize(0);
        try {
            ListOauth2ClientsResponse response = client.listOauth2Clients(listOauth2ClientsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
