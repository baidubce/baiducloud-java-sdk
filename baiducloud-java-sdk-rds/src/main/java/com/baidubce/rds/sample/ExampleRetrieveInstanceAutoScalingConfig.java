package com.baidubce.rds.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rds.RdsClient;
import com.baidubce.rds.models.RetrieveInstanceAutoScalingConfigRequest;
import com.baidubce.rds.models.RetrieveInstanceAutoScalingConfigResponse;

public class ExampleRetrieveInstanceAutoScalingConfig {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        RdsClient client = new RdsClient(bceClientConfig);
        RetrieveInstanceAutoScalingConfigRequest retrieveInstanceAutoScalingConfigRequest = new RetrieveInstanceAutoScalingConfigRequest();
        retrieveInstanceAutoScalingConfigRequest.setInstanceId("");
        try {
            RetrieveInstanceAutoScalingConfigResponse response = client.retrieveInstanceAutoScalingConfig(retrieveInstanceAutoScalingConfigRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
