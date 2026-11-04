package com.baidubce.dns.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dns.DnsClient;
import com.baidubce.dns.models.UpdateRecordRequest;

public class ExampleUpdateRecord {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DnsClient client = new DnsClient(bceClientConfig);
        UpdateRecordRequest updateRecordRequest = new UpdateRecordRequest();
        updateRecordRequest.setZoneName("");
        updateRecordRequest.setRecordId("");
        updateRecordRequest.setClientToken("");
        updateRecordRequest.setRr("");
        updateRecordRequest.setType("");
        updateRecordRequest.setValue("");
        updateRecordRequest.setTtl(0);
        updateRecordRequest.setDescription("");
        updateRecordRequest.setPriority(0);
        try {
            client.updateRecord(updateRecordRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
