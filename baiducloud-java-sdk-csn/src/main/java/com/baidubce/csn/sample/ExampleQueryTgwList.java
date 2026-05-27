package com.baidubce.csn.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.csn.CsnClient;
import com.baidubce.csn.models.QueryTgwListRequest;
import com.baidubce.csn.models.QueryTgwListResponse;

public class ExampleQueryTgwList {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        CsnClient client = new CsnClient(config);
        QueryTgwListRequest queryTgwListRequest = new QueryTgwListRequest();
        queryTgwListRequest.setCsnId("");
        queryTgwListRequest.setMarker("");
        queryTgwListRequest.setMaxKeys(0);
        try {
            QueryTgwListResponse response = client.queryTgwList(queryTgwListRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
