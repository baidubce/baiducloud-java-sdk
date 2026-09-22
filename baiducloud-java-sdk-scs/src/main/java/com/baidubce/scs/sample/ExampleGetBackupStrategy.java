package com.baidubce.scs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.scs.ScsClient;
import com.baidubce.scs.models.GetBackupStrategyRequest;
import com.baidubce.scs.models.GetBackupStrategyResponse;

public class ExampleGetBackupStrategy {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        ScsClient client = new ScsClient(bceClientConfig);
        GetBackupStrategyRequest getBackupStrategyRequest = new GetBackupStrategyRequest();
        getBackupStrategyRequest.setInstanceId("");
        try {
            GetBackupStrategyResponse response = client.getBackupStrategy(getBackupStrategyRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
