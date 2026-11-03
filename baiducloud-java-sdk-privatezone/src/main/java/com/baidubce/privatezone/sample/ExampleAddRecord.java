package com.baidubce.privatezone.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.privatezone.PrivatezoneClient;
import com.baidubce.privatezone.models.AddRecordRequest;
import com.baidubce.privatezone.models.AddRecordResponse;

public class ExampleAddRecord {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PrivatezoneClient client = new PrivatezoneClient(bceClientConfig);
        AddRecordRequest addRecordRequest = new AddRecordRequest();
        addRecordRequest.setZoneId("");
        addRecordRequest.setClientToken("");
        addRecordRequest.setRr("");
        addRecordRequest.setValue("");
        addRecordRequest.setType("");
        addRecordRequest.setPriority(0);
        addRecordRequest.setTtl(0);
        addRecordRequest.setDescription("");
        try {
            AddRecordResponse response = client.addRecord(addRecordRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
