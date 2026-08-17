package com.baidubce.aigw.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.aigw.AigwClient;
import com.baidubce.aigw.models.DeleteConsumerRequest;
import com.baidubce.aigw.models.DeleteConsumerResponse;

public class ExampleDeleteConsumer {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        AigwClient client = new AigwClient(bceClientConfig);
        DeleteConsumerRequest deleteConsumerRequest = new DeleteConsumerRequest();
        deleteConsumerRequest.setInstanceId("");
        deleteConsumerRequest.setConsumerId("");
        deleteConsumerRequest.setKeyType("");
        try {
            DeleteConsumerResponse response = client.deleteConsumer(deleteConsumerRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
