package com.baidubce.ccr.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.ccr.CcrClient;
import com.baidubce.ccr.models.ListInstanceSyncTaskRecordsRequest;
import com.baidubce.ccr.models.ListInstanceSyncTaskRecordsResponse;

public class ExampleListInstanceSyncTaskRecords {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        CcrClient client = new CcrClient(config);
        ListInstanceSyncTaskRecordsRequest listInstanceSyncTaskRecordsRequest = new ListInstanceSyncTaskRecordsRequest();
        listInstanceSyncTaskRecordsRequest.setInstanceId("");
        listInstanceSyncTaskRecordsRequest.setExecutionId("");
        listInstanceSyncTaskRecordsRequest.setPageNo(0);
        listInstanceSyncTaskRecordsRequest.setPageSize(0);
        try {
            ListInstanceSyncTaskRecordsResponse response = client.listInstanceSyncTaskRecords(listInstanceSyncTaskRecordsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
