package com.baidubce.rds.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rds.RdsClient;
import com.baidubce.rds.models.QueryAndModifyHistoryRequest;
import com.baidubce.rds.models.QueryAndModifyHistoryResponse;

public class ExampleQueryAndModifyHistory {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        RdsClient client = new RdsClient(bceClientConfig);
        QueryAndModifyHistoryRequest queryAndModifyHistoryRequest = new QueryAndModifyHistoryRequest();
        queryAndModifyHistoryRequest.setInstanceId("");
        try {
            QueryAndModifyHistoryResponse response = client.queryAndModifyHistory(queryAndModifyHistoryRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
