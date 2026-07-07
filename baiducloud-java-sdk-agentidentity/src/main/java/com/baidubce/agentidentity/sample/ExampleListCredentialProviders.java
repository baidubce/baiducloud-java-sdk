package com.baidubce.agentidentity.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.agentidentity.AgentidentityClient;
import com.baidubce.agentidentity.models.ListCredentialProvidersRequest;
import com.baidubce.agentidentity.models.ListCredentialProvidersResponse;

public class ExampleListCredentialProviders {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        AgentidentityClient client = new AgentidentityClient(bceClientConfig);
        ListCredentialProvidersRequest listCredentialProvidersRequest = new ListCredentialProvidersRequest();
        listCredentialProvidersRequest.setPageNo(0);
        listCredentialProvidersRequest.setPageSize(0);
        listCredentialProvidersRequest.setType("");
        listCredentialProvidersRequest.setName("");
        try {
            ListCredentialProvidersResponse response = client.listCredentialProviders(listCredentialProvidersRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
