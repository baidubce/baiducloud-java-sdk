package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateRoutingRulesRequest;
import com.baidubce.vpc.models.CreateRoutingRulesResponse;
import java.util.ArrayList;

public class ExampleCreateRoutingRules {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        CreateRoutingRulesRequest createRoutingRulesRequest = new CreateRoutingRulesRequest();
        createRoutingRulesRequest.setClientToken("");
        createRoutingRulesRequest.setRouteTableId("");
        createRoutingRulesRequest.setSourceAddress("");
        createRoutingRulesRequest.setDestinationAddress("");
        createRoutingRulesRequest.setNexthopId("");
        createRoutingRulesRequest.setNexthopType("");
        createRoutingRulesRequest.setNextHopList(new ArrayList<>());
        createRoutingRulesRequest.setDescription("");
        try {
            CreateRoutingRulesResponse response = client.createRoutingRules(createRoutingRulesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
