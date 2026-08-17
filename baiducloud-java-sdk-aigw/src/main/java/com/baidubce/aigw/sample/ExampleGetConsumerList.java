package com.baidubce.aigw.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.aigw.AigwClient;
import com.baidubce.aigw.models.GetConsumerListRequest;
import com.baidubce.aigw.models.GetConsumerListResponse;

public class ExampleGetConsumerList {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        AigwClient client = new AigwClient(bceClientConfig);
        GetConsumerListRequest getConsumerListRequest = new GetConsumerListRequest();
        getConsumerListRequest.setInstanceId("");
        getConsumerListRequest.setPageNo(0);
        getConsumerListRequest.setPageSize(0);
        getConsumerListRequest.setTagKey("");
        getConsumerListRequest.setTagValue("");
        try {
            GetConsumerListResponse response = client.getConsumerList(getConsumerListRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
