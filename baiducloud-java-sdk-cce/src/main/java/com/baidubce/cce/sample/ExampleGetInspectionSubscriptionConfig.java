package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.GetInspectionSubscriptionConfigRequest;
import com.baidubce.cce.models.GetInspectionSubscriptionConfigResponse;

public class ExampleGetInspectionSubscriptionConfig {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CceClient client = new CceClient(bceClientConfig);
        GetInspectionSubscriptionConfigRequest getInspectionSubscriptionConfigRequest = new GetInspectionSubscriptionConfigRequest();
        getInspectionSubscriptionConfigRequest.setClusterID("");
        try {
            GetInspectionSubscriptionConfigResponse response = client.getInspectionSubscriptionConfig(getInspectionSubscriptionConfigRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
