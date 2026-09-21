package com.baidubce.dbsc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dbsc.DbscClient;
import com.baidubce.dbsc.models.GetMongodbDatabaseSpaceTrendRequest;
import com.baidubce.dbsc.models.GetMongodbDatabaseSpaceTrendResponse;

public class ExampleGetMongodbDatabaseSpaceTrend {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DbscClient client = new DbscClient(bceClientConfig);
        GetMongodbDatabaseSpaceTrendRequest getMongodbDatabaseSpaceTrendRequest = new GetMongodbDatabaseSpaceTrendRequest();
        getMongodbDatabaseSpaceTrendRequest.setDatabase("");
        getMongodbDatabaseSpaceTrendRequest.setPeriod(0);
        getMongodbDatabaseSpaceTrendRequest.setNodeId("");
        getMongodbDatabaseSpaceTrendRequest.setStart("");
        getMongodbDatabaseSpaceTrendRequest.setEnd("");
        getMongodbDatabaseSpaceTrendRequest.setMetrics("");
        getMongodbDatabaseSpaceTrendRequest.setStatistics("");
        try {
            GetMongodbDatabaseSpaceTrendResponse response = client.getMongodbDatabaseSpaceTrend(getMongodbDatabaseSpaceTrendRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
