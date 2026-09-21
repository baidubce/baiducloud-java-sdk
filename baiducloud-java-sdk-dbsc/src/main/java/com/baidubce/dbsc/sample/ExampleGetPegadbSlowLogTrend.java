package com.baidubce.dbsc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dbsc.DbscClient;
import com.baidubce.dbsc.models.GetPegadbSlowLogTrendRequest;
import com.baidubce.dbsc.models.GetPegadbSlowLogTrendResponse;

public class ExampleGetPegadbSlowLogTrend {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DbscClient client = new DbscClient(bceClientConfig);
        GetPegadbSlowLogTrendRequest getPegadbSlowLogTrendRequest = new GetPegadbSlowLogTrendRequest();
        getPegadbSlowLogTrendRequest.setNodeId("");
        getPegadbSlowLogTrendRequest.setStart("");
        getPegadbSlowLogTrendRequest.setEnd("");
        getPegadbSlowLogTrendRequest.setDbEngine("");
        getPegadbSlowLogTrendRequest.setPeriod(0);
        try {
            GetPegadbSlowLogTrendResponse response = client.getPegadbSlowLogTrend(getPegadbSlowLogTrendRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
