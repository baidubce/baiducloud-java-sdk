package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.BillingChangePreToPostBlbRequest;
import com.baidubce.blb.models.BillingChangePreToPostBlbResponse;

public class ExampleBillingChangePreToPostBlb {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BlbClient client = new BlbClient(config);
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
