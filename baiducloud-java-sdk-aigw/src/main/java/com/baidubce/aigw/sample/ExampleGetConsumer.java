package com.baidubce.aigw.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.aigw.AigwClient;
import com.baidubce.aigw.models.GetConsumerRequest;
import com.baidubce.aigw.models.GetConsumerResponse;

public class ExampleGetConsumer {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        AigwClient client = new AigwClient(bceClientConfig);
        GetConsumerRequest getConsumerRequest = new GetConsumerRequest();
        getConsumerRequest.setInstanceId("");
        getConsumerRequest.setConsumerId("");
        getConsumerRequest.setXRegion("");
        getConsumerRequest.setKeyType("");
        try {
            GetConsumerResponse response = client.getConsumer(getConsumerRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
