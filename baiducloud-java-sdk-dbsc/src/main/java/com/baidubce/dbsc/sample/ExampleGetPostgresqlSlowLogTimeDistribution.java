package com.baidubce.dbsc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dbsc.DbscClient;
import com.baidubce.dbsc.models.GetPostgresqlSlowLogTimeDistributionRequest;
import com.baidubce.dbsc.models.GetPostgresqlSlowLogTimeDistributionResponse;
import java.util.ArrayList;

public class ExampleGetPostgresqlSlowLogTimeDistribution {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DbscClient client = new DbscClient(bceClientConfig);
        GetPostgresqlSlowLogTimeDistributionRequest getPostgresqlSlowLogTimeDistributionRequest = new GetPostgresqlSlowLogTimeDistributionRequest();
        getPostgresqlSlowLogTimeDistributionRequest.setAppId("");
        getPostgresqlSlowLogTimeDistributionRequest.setNodeId("");
        getPostgresqlSlowLogTimeDistributionRequest.setStart("");
        getPostgresqlSlowLogTimeDistributionRequest.setEnd("");
        getPostgresqlSlowLogTimeDistributionRequest.setDbNames(new ArrayList<>());
        getPostgresqlSlowLogTimeDistributionRequest.setUsers(new ArrayList<>());
        getPostgresqlSlowLogTimeDistributionRequest.setClientIPs(new ArrayList<>());
        try {
            GetPostgresqlSlowLogTimeDistributionResponse response = client.getPostgresqlSlowLogTimeDistribution(getPostgresqlSlowLogTimeDistributionRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
