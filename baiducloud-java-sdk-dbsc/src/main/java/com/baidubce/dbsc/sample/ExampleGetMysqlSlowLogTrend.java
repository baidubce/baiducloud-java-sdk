package com.baidubce.dbsc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dbsc.DbscClient;
import com.baidubce.dbsc.models.GetMysqlSlowLogTrendRequest;
import com.baidubce.dbsc.models.GetMysqlSlowLogTrendResponse;

public class ExampleGetMysqlSlowLogTrend {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DbscClient client = new DbscClient(bceClientConfig);
        GetMysqlSlowLogTrendRequest getMysqlSlowLogTrendRequest = new GetMysqlSlowLogTrendRequest();
        getMysqlSlowLogTrendRequest.setStart("");
        getMysqlSlowLogTrendRequest.setEnd("");
        getMysqlSlowLogTrendRequest.setPeriod("");
        getMysqlSlowLogTrendRequest.setNodeId("");
        try {
            GetMysqlSlowLogTrendResponse response = client.getMysqlSlowLogTrend(getMysqlSlowLogTrendRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
