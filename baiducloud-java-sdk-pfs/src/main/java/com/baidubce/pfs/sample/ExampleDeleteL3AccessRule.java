package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.DeleteL3AccessRuleRequest;
import com.baidubce.pfs.models.DeleteL3AccessRuleResponse;

public class ExampleDeleteL3AccessRule {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        DeleteL3AccessRuleRequest deleteL3AccessRuleRequest = new DeleteL3AccessRuleRequest();
        deleteL3AccessRuleRequest.setAccessGroupName("");
        deleteL3AccessRuleRequest.setZoneName("");
        deleteL3AccessRuleRequest.setAccessRuleId(0);
        try {
            DeleteL3AccessRuleResponse response = client.deleteL3AccessRule(deleteL3AccessRuleRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
