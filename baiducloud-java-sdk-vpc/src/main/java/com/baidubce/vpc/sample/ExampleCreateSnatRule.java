package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateSnatRuleRequest;
import com.baidubce.vpc.models.CreateSnatRuleResponse;
import java.util.ArrayList;

public class ExampleCreateSnatRule {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        CreateSnatRuleRequest createSnatRuleRequest = new CreateSnatRuleRequest();
        createSnatRuleRequest.setNatId("");
        createSnatRuleRequest.setClientToken("");
        createSnatRuleRequest.setRuleName("");
        createSnatRuleRequest.setPublicIpsAddress(new ArrayList<>());
        createSnatRuleRequest.setSourceCIDR("");
        try {
            CreateSnatRuleResponse response = client.createSnatRule(createSnatRuleRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
