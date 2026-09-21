package com.baidubce.dbsc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dbsc.DbscClient;
import com.baidubce.dbsc.models.GetMongodbCollectionSpaceTrendRequest;
import com.baidubce.dbsc.models.GetMongodbCollectionSpaceTrendResponse;

public class ExampleGetMongodbCollectionSpaceTrend {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DbscClient client = new DbscClient(bceClientConfig);
        GetMongodbCollectionSpaceTrendRequest getMongodbCollectionSpaceTrendRequest = new GetMongodbCollectionSpaceTrendRequest();
        getMongodbCollectionSpaceTrendRequest.setDatabase("");
        getMongodbCollectionSpaceTrendRequest.setCollection("");
        getMongodbCollectionSpaceTrendRequest.setPeriod(0);
        getMongodbCollectionSpaceTrendRequest.setNodeId("");
        getMongodbCollectionSpaceTrendRequest.setStart("");
        getMongodbCollectionSpaceTrendRequest.setEnd("");
        getMongodbCollectionSpaceTrendRequest.setMetrics("");
        getMongodbCollectionSpaceTrendRequest.setStatistics("");
        try {
            GetMongodbCollectionSpaceTrendResponse response = client.getMongodbCollectionSpaceTrend(getMongodbCollectionSpaceTrendRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
