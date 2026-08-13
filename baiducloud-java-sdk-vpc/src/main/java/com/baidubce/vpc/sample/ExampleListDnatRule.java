package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.ListDnatRuleRequest;
import com.baidubce.vpc.models.ListDnatRuleResponse;

public class ExampleListDnatRule {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        ListDnatRuleRequest listDnatRuleRequest = new ListDnatRuleRequest();
        listDnatRuleRequest.setNatId("");
        listDnatRuleRequest.setMarker("");
        listDnatRuleRequest.setMaxKeys(0);
        try {
            ListDnatRuleResponse response = client.listDnatRule(listDnatRuleRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
