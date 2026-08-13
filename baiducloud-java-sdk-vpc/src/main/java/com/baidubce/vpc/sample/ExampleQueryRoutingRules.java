package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.QueryRoutingRulesRequest;
import com.baidubce.vpc.models.QueryRoutingRulesResponse;

public class ExampleQueryRoutingRules {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        QueryRoutingRulesRequest queryRoutingRulesRequest = new QueryRoutingRulesRequest();
        queryRoutingRulesRequest.setRouteTableId("");
        queryRoutingRulesRequest.setVpcId("");
        queryRoutingRulesRequest.setMarker("");
        queryRoutingRulesRequest.setMaxKeys(0);
        try {
            QueryRoutingRulesResponse response = client.queryRoutingRules(queryRoutingRulesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
