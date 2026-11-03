package com.baidubce.privatezone.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.privatezone.PrivatezoneClient;
import com.baidubce.privatezone.models.ListRecordRequest;
import com.baidubce.privatezone.models.ListRecordResponse;

public class ExampleListRecord {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PrivatezoneClient client = new PrivatezoneClient(bceClientConfig);
        ListRecordRequest listRecordRequest = new ListRecordRequest();
        listRecordRequest.setZoneId("");
        listRecordRequest.setMarker("");
        listRecordRequest.setMaxKeys(0);
        listRecordRequest.setRr("");
        listRecordRequest.setSearchMode("");
        listRecordRequest.setType("");
        listRecordRequest.setValue("");
        try {
            ListRecordResponse response = client.listRecord(listRecordRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
