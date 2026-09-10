package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.StepsToObtainNodeEventsV2Request;
import com.baidubce.cce.models.StepsToObtainNodeEventsV2Response;

public class ExampleStepsToObtainNodeEventsV2 {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CceClient client = new CceClient(bceClientConfig);
        StepsToObtainNodeEventsV2Request stepsToObtainNodeEventsV2Request = new StepsToObtainNodeEventsV2Request();
        stepsToObtainNodeEventsV2Request.setInstanceID("");
        try {
            StepsToObtainNodeEventsV2Response response = client.stepsToObtainNodeEventsV2(stepsToObtainNodeEventsV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
