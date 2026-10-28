package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.CreateAuthorizationRuleRequest;
import com.baidubce.bcc.models.CreateAuthorizationRuleResponse;
import java.util.ArrayList;

public class ExampleCreateAuthorizationRule {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        CreateAuthorizationRuleRequest createAuthorizationRuleRequest = new CreateAuthorizationRuleRequest();
        createAuthorizationRuleRequest.setAction("");
        createAuthorizationRuleRequest.setEnableRule(0);
        createAuthorizationRuleRequest.setAuthorizeMaintenanceOperations(new ArrayList<>());
        createAuthorizationRuleRequest.setRuleName("");
        createAuthorizationRuleRequest.setServerEventCategory("");
        try {
            CreateAuthorizationRuleResponse response = client.createAuthorizationRule(createAuthorizationRuleRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
