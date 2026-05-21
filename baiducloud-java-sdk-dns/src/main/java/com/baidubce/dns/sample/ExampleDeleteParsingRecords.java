package com.baidubce.dns.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dns.DnsClient;
import com.baidubce.dns.models.DeleteParsingRecordsRequest;

public class ExampleDeleteParsingRecords {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        DnsClient client = new DnsClient(config);
        DeleteParsingRecordsRequest deleteParsingRecordsRequest = new DeleteParsingRecordsRequest();
        deleteParsingRecordsRequest.setZoneName("");
        deleteParsingRecordsRequest.setRecordId("");
        deleteParsingRecordsRequest.setClientToken("");
        try {
            client.deleteParsingRecords(deleteParsingRecordsRequest);
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
