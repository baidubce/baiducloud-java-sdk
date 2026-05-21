package com.baidubce.dns.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dns.DnsClient;
import com.baidubce.dns.models.ModifyParsingRecordsRequest;

public class ExampleModifyParsingRecords {
    public static void main(String[] args) {
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        DnsClient client = new DnsClient(config);
        ModifyParsingRecordsRequest modifyParsingRecordsRequest = new ModifyParsingRecordsRequest();
        modifyParsingRecordsRequest.setZoneName("");
        modifyParsingRecordsRequest.setRecordId("");
        modifyParsingRecordsRequest.setClientToken("");
        modifyParsingRecordsRequest.setRr("");
        modifyParsingRecordsRequest.setType("");
        modifyParsingRecordsRequest.setValue("");
        modifyParsingRecordsRequest.setTtl(0);
        modifyParsingRecordsRequest.setDescription("");
        modifyParsingRecordsRequest.setPriority(0);
        try {
            client.modifyParsingRecords(modifyParsingRecordsRequest);
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
