package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.BatchAddIpRequest;
import java.util.ArrayList;

public class ExampleBatchAddIp {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        BatchAddIpRequest batchAddIpRequest = new BatchAddIpRequest();
        batchAddIpRequest.setInstanceId("");
        batchAddIpRequest.setSecondaryPrivateIpAddressCount(0);
        batchAddIpRequest.setPrivateIps(new ArrayList<>());
        batchAddIpRequest.setAllocateMultiIpv6Addr(false);
        try {
            client.batchAddIp(batchAddIpRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
