package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.BillingChangePreToPostBlbRequest;
import com.baidubce.blb.models.BillingChangePreToPostBlbResponse;

public class ExampleBillingChangePreToPostBlb {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        BillingChangePreToPostBlbRequest billingChangePreToPostBlbRequest = new BillingChangePreToPostBlbRequest();
        billingChangePreToPostBlbRequest.setBlbId("");
        billingChangePreToPostBlbRequest.setClientToken("");
        billingChangePreToPostBlbRequest.setBillingMethod("");
        billingChangePreToPostBlbRequest.setPerformanceLevel("");
        billingChangePreToPostBlbRequest.setEffectiveImmediately(false);
        try {
            BillingChangePreToPostBlbResponse response = client.billingChangePreToPostBlb(billingChangePreToPostBlbRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
