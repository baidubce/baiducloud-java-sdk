package com.baidubce.dbsc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dbsc.DbscClient;
import com.baidubce.dbsc.models.GetMongodbSlowLogTimeDistributionRequest;
import com.baidubce.dbsc.models.GetMongodbSlowLogTimeDistributionResponse;

public class ExampleGetMongodbSlowLogTimeDistribution {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DbscClient client = new DbscClient(bceClientConfig);
        GetMongodbSlowLogTimeDistributionRequest getMongodbSlowLogTimeDistributionRequest = new GetMongodbSlowLogTimeDistributionRequest();
        getMongodbSlowLogTimeDistributionRequest.setStart("");
        getMongodbSlowLogTimeDistributionRequest.setEnd("");
        getMongodbSlowLogTimeDistributionRequest.setNodeId("");
        getMongodbSlowLogTimeDistributionRequest.setDbNames("");
        getMongodbSlowLogTimeDistributionRequest.setFingerprintMd5("");
        try {
            GetMongodbSlowLogTimeDistributionResponse response = client.getMongodbSlowLogTimeDistribution(getMongodbSlowLogTimeDistributionRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
