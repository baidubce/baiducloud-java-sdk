package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.ListL3AccessRuleRequest;
import com.baidubce.pfs.models.ListL3AccessRuleResponse;

public class ExampleListL3AccessRule {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        ListL3AccessRuleRequest listL3AccessRuleRequest = new ListL3AccessRuleRequest();
        listL3AccessRuleRequest.setAccessGroupName("");
        listL3AccessRuleRequest.setZoneName("");
        listL3AccessRuleRequest.setPageNo(0);
        listL3AccessRuleRequest.setPageSize(0);
        listL3AccessRuleRequest.setOrderBy("");
        listL3AccessRuleRequest.setOrder("");
        listL3AccessRuleRequest.setIpFilter("");
        try {
            ListL3AccessRuleResponse response = client.listL3AccessRule(listL3AccessRuleRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
