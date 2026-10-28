package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.ListRecycleInstanceRequest;
import com.baidubce.bcc.models.ListRecycleInstanceResponse;

public class ExampleListRecycleInstance {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        ListRecycleInstanceRequest listRecycleInstanceRequest = new ListRecycleInstanceRequest();
        listRecycleInstanceRequest.setMarker("");
        listRecycleInstanceRequest.setMaxKeys(0);
        listRecycleInstanceRequest.setInstanceId("");
        listRecycleInstanceRequest.setName("");
        listRecycleInstanceRequest.setPaymentTiming("");
        listRecycleInstanceRequest.setRecycleBegin("");
        listRecycleInstanceRequest.setRecycleEnd("");
        try {
            ListRecycleInstanceResponse response = client.listRecycleInstance(listRecycleInstanceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
