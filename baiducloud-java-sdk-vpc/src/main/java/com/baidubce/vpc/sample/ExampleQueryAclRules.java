package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.QueryAclRulesRequest;
import com.baidubce.vpc.models.QueryAclRulesResponse;

public class ExampleQueryAclRules {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        QueryAclRulesRequest queryAclRulesRequest = new QueryAclRulesRequest();
        queryAclRulesRequest.setSubnetId("");
        queryAclRulesRequest.setMarker("");
        queryAclRulesRequest.setMaxKeys(0);
        try {
            QueryAclRulesResponse response = client.queryAclRules(queryAclRulesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
