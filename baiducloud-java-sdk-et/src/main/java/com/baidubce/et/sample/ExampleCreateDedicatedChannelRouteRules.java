package com.baidubce.et.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.et.EtClient;
import com.baidubce.et.models.CreateDedicatedChannelRouteRulesRequest;
import com.baidubce.et.models.CreateDedicatedChannelRouteRulesResponse;

public class ExampleCreateDedicatedChannelRouteRules {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        EtClient client = new EtClient(config);
        CreateDedicatedChannelRouteRulesRequest createDedicatedChannelRouteRulesRequest = new CreateDedicatedChannelRouteRulesRequest();
        createDedicatedChannelRouteRulesRequest.setEtId("");
        createDedicatedChannelRouteRulesRequest.setEtChannelId("");
        createDedicatedChannelRouteRulesRequest.setClientToken("");
        createDedicatedChannelRouteRulesRequest.setIpVersion(0);
        createDedicatedChannelRouteRulesRequest.setDestAddress("");
        createDedicatedChannelRouteRulesRequest.setNexthopType("");
        createDedicatedChannelRouteRulesRequest.setNexthopId("");
        createDedicatedChannelRouteRulesRequest.setDescription("");
        try {
            CreateDedicatedChannelRouteRulesResponse response = client.createDedicatedChannelRouteRules(createDedicatedChannelRouteRulesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
