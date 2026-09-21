package com.baidubce.dbsc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dbsc.DbscClient;
import com.baidubce.dbsc.models.GetMysqlSlowLogTimeDistributionRequest;
import com.baidubce.dbsc.models.GetMysqlSlowLogTimeDistributionResponse;

public class ExampleGetMysqlSlowLogTimeDistribution {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DbscClient client = new DbscClient(bceClientConfig);
        GetMysqlSlowLogTimeDistributionRequest getMysqlSlowLogTimeDistributionRequest = new GetMysqlSlowLogTimeDistributionRequest();
        getMysqlSlowLogTimeDistributionRequest.setStart("");
        getMysqlSlowLogTimeDistributionRequest.setEnd("");
        getMysqlSlowLogTimeDistributionRequest.setNodeId("");
        getMysqlSlowLogTimeDistributionRequest.setDbNames("");
        getMysqlSlowLogTimeDistributionRequest.setFingerprintMd5("");
        try {
            GetMysqlSlowLogTimeDistributionResponse response = client.getMysqlSlowLogTimeDistribution(getMysqlSlowLogTimeDistributionRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
