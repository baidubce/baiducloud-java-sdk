package com.baidubce.ccr.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.ccr.CcrClient;
import com.baidubce.ccr.models.ListImageMigrationTaskRecordsRequest;
import com.baidubce.ccr.models.ListImageMigrationTaskRecordsResponse;

public class ExampleListImageMigrationTaskRecords {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        CcrClient client = new CcrClient(config);
        ListImageMigrationTaskRecordsRequest listImageMigrationTaskRecordsRequest = new ListImageMigrationTaskRecordsRequest();
        listImageMigrationTaskRecordsRequest.setInstanceId("");
        listImageMigrationTaskRecordsRequest.setExecutionId("");
        listImageMigrationTaskRecordsRequest.setPageNo(0);
        listImageMigrationTaskRecordsRequest.setPageSize(0);
        try {
            ListImageMigrationTaskRecordsResponse response = client.listImageMigrationTaskRecords(listImageMigrationTaskRecordsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
