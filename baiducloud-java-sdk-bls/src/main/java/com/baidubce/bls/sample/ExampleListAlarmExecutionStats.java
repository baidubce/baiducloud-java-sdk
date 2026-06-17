package com.baidubce.bls.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bls.BlsClient;
import com.baidubce.bls.models.ListAlarmExecutionStatsRequest;
import com.baidubce.bls.models.ListAlarmExecutionStatsResponse;
import java.util.ArrayList;

public class ExampleListAlarmExecutionStats {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BlsClient client = new BlsClient(bceClientConfig);
        ListAlarmExecutionStatsRequest listAlarmExecutionStatsRequest = new ListAlarmExecutionStatsRequest();
        listAlarmExecutionStatsRequest.setPolicyId("");
        listAlarmExecutionStatsRequest.setPolicyName("");
        listAlarmExecutionStatsRequest.setLogStoreName("");
        listAlarmExecutionStatsRequest.setStates(new ArrayList<>());
        listAlarmExecutionStatsRequest.setNoticeStates(new ArrayList<>());
        listAlarmExecutionStatsRequest.setStartDateTime("");
        listAlarmExecutionStatsRequest.setEndDateTime("");
        listAlarmExecutionStatsRequest.setOrderBy("");
        listAlarmExecutionStatsRequest.setOrder("");
        listAlarmExecutionStatsRequest.setPageNo(0);
        listAlarmExecutionStatsRequest.setPageSize(0);
        try {
            ListAlarmExecutionStatsResponse response = client.listAlarmExecutionStats(listAlarmExecutionStatsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
