package com.baidubce.aigw.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.aigw.AigwClient;
import com.baidubce.aigw.models.QueryRoutingListRequest;
import com.baidubce.aigw.models.QueryRoutingListResponse;

public class ExampleQueryRoutingList {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        AigwClient client = new AigwClient(bceClientConfig);
        QueryRoutingListRequest queryRoutingListRequest = new QueryRoutingListRequest();
        queryRoutingListRequest.setInstanceId("");
        queryRoutingListRequest.setRouteName("");
        queryRoutingListRequest.setPageNo(0);
        queryRoutingListRequest.setPageSize(0);
        queryRoutingListRequest.setOrderBy("");
        queryRoutingListRequest.setOrder("");
        try {
            QueryRoutingListResponse response = client.queryRoutingList(queryRoutingListRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
