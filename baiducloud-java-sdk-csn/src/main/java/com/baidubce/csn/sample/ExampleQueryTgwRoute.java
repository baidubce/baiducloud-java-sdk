package com.baidubce.csn.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.csn.CsnClient;
import com.baidubce.csn.models.QueryTgwRouteRequest;
import com.baidubce.csn.models.QueryTgwRouteResponse;

public class ExampleQueryTgwRoute {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        CsnClient client = new CsnClient(config);
        QueryTgwRouteRequest queryTgwRouteRequest = new QueryTgwRouteRequest();
        queryTgwRouteRequest.setCsnId("");
        queryTgwRouteRequest.setTgwId("");
        queryTgwRouteRequest.setMarker("");
        queryTgwRouteRequest.setMaxKeys(0);
        try {
            QueryTgwRouteResponse response = client.queryTgwRoute(queryTgwRouteRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
