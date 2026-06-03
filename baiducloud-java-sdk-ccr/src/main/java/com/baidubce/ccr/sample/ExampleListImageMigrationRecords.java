package com.baidubce.ccr.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.ccr.CcrClient;
import com.baidubce.ccr.models.ListImageMigrationRecordsRequest;
import com.baidubce.ccr.models.ListImageMigrationRecordsResponse;

public class ExampleListImageMigrationRecords {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        CcrClient client = new CcrClient(config);
        ListImageMigrationRecordsRequest listImageMigrationRecordsRequest = new ListImageMigrationRecordsRequest();
        listImageMigrationRecordsRequest.setInstanceId("");
        listImageMigrationRecordsRequest.setPolicyId("");
        listImageMigrationRecordsRequest.setPageNo(0);
        listImageMigrationRecordsRequest.setPageSize(0);
        try {
            ListImageMigrationRecordsResponse response = client.listImageMigrationRecords(listImageMigrationRecordsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
