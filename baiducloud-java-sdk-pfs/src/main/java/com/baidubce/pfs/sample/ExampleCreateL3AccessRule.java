package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.CreateL3AccessRuleRequest;
import com.baidubce.pfs.models.CreateL3AccessRuleResponse;
import java.util.ArrayList;

public class ExampleCreateL3AccessRule {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        CreateL3AccessRuleRequest createL3AccessRuleRequest = new CreateL3AccessRuleRequest();
        createL3AccessRuleRequest.setAccessGroupName("");
        createL3AccessRuleRequest.setZoneName("");
        createL3AccessRuleRequest.setAccessRules(new ArrayList<>());
        try {
            CreateL3AccessRuleResponse response = client.createL3AccessRule(createL3AccessRuleRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
