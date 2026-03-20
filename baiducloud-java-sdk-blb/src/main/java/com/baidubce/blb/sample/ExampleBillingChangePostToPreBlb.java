package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.BillingChangePostToPreBlbRequest;
import com.baidubce.blb.models.BillingChangePostToPreBlbResponse;

public class ExampleBillingChangePostToPreBlb {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BlbClient client = new BlbClient(config);
        BillingChangePostToPreBlbRequest billingChangePostToPreBlbRequest = new BillingChangePostToPreBlbRequest();
        billingChangePostToPreBlbRequest.setBlbId("");
        billingChangePostToPreBlbRequest.setClientToken("");
        billingChangePostToPreBlbRequest.setBillingMethod("");
        billingChangePostToPreBlbRequest.setPerformanceLevel("");
        billingChangePostToPreBlbRequest.setReservationLength(0);
        try {
            BillingChangePostToPreBlbResponse response = client.billingChangePostToPreBlb(billingChangePostToPreBlbRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
