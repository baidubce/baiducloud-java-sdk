package com.baidubce.privatezone.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.privatezone.PrivatezoneClient;
import com.baidubce.privatezone.models.CreateResolverRuleRequest;
import com.baidubce.privatezone.models.CreateResolverRuleResponse;
import java.util.ArrayList;

public class ExampleCreateResolverRule {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PrivatezoneClient client = new PrivatezoneClient(bceClientConfig);
        CreateResolverRuleRequest createResolverRuleRequest = new CreateResolverRuleRequest();
        createResolverRuleRequest.setClientToken("");
        createResolverRuleRequest.setName("");
        createResolverRuleRequest.setDescription("");
        createResolverRuleRequest.setZone("");
        createResolverRuleRequest.setResolverId("");
        createResolverRuleRequest.setDnsServerConfigs(new ArrayList<>());
        try {
            CreateResolverRuleResponse response = client.createResolverRule(createResolverRuleRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
