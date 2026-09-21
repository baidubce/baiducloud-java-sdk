package com.baidubce.dbsc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dbsc.DbscClient;
import com.baidubce.dbsc.models.GetRedisSlowLogTrendRequest;
import com.baidubce.dbsc.models.GetRedisSlowLogTrendResponse;

public class ExampleGetRedisSlowLogTrend {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DbscClient client = new DbscClient(bceClientConfig);
        GetRedisSlowLogTrendRequest getRedisSlowLogTrendRequest = new GetRedisSlowLogTrendRequest();
        getRedisSlowLogTrendRequest.setNodeId("");
        getRedisSlowLogTrendRequest.setStart("");
        getRedisSlowLogTrendRequest.setEnd("");
        getRedisSlowLogTrendRequest.setDbEngine("");
        getRedisSlowLogTrendRequest.setPeriod(0);
        try {
            GetRedisSlowLogTrendResponse response = client.getRedisSlowLogTrend(getRedisSlowLogTrendRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
