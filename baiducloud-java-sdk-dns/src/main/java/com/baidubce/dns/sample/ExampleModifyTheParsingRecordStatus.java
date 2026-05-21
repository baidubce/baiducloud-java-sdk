package com.baidubce.dns.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dns.DnsClient;
import com.baidubce.dns.models.ModifyTheParsingRecordStatusRequest;

public class ExampleModifyTheParsingRecordStatus {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        DnsClient client = new DnsClient(config);
        ModifyTheParsingRecordStatusRequest modifyTheParsingRecordStatusRequest = new ModifyTheParsingRecordStatusRequest();
        modifyTheParsingRecordStatusRequest.setZoneName("");
        modifyTheParsingRecordStatusRequest.setRecordId("");
        modifyTheParsingRecordStatusRequest.setAction("");
        modifyTheParsingRecordStatusRequest.setClientToken("");
        try {
            client.modifyTheParsingRecordStatus(modifyTheParsingRecordStatusRequest);
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
