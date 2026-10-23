package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.UpdateL3AccessRuleRequest;
import com.baidubce.pfs.models.UpdateL3AccessRuleResponse;

public class ExampleUpdateL3AccessRule {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        UpdateL3AccessRuleRequest updateL3AccessRuleRequest = new UpdateL3AccessRuleRequest();
        updateL3AccessRuleRequest.setAccessGroupName("");
        updateL3AccessRuleRequest.setZoneName("");
        updateL3AccessRuleRequest.setAccessRuleId(0);
        updateL3AccessRuleRequest.setIp("");
        updateL3AccessRuleRequest.setMask(0);
        updateL3AccessRuleRequest.setWriteAccess("");
        updateL3AccessRuleRequest.setUserAccess("");
        updateL3AccessRuleRequest.setPriority(0);
        try {
            UpdateL3AccessRuleResponse response = client.updateL3AccessRule(updateL3AccessRuleRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
