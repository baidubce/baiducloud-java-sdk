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
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
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
