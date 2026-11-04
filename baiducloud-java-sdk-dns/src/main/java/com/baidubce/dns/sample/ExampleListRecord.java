package com.baidubce.dns.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dns.DnsClient;
import com.baidubce.dns.models.ListRecordRequest;
import com.baidubce.dns.models.ListRecordResponse;

public class ExampleListRecord {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DnsClient client = new DnsClient(bceClientConfig);
        ListRecordRequest listRecordRequest = new ListRecordRequest();
        listRecordRequest.setZoneName("");
        listRecordRequest.setRr("");
        listRecordRequest.setId("");
        listRecordRequest.setMarker("");
        listRecordRequest.setMaxKeys(0);
        try {
            ListRecordResponse response = client.listRecord(listRecordRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
