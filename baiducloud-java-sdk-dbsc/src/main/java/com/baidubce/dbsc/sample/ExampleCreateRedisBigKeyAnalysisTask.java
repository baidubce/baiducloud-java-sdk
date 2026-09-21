package com.baidubce.dbsc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dbsc.DbscClient;
import com.baidubce.dbsc.models.CreateRedisBigKeyAnalysisTaskRequest;
import com.baidubce.dbsc.models.CreateRedisBigKeyAnalysisTaskResponse;

public class ExampleCreateRedisBigKeyAnalysisTask {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DbscClient client = new DbscClient(bceClientConfig);
        CreateRedisBigKeyAnalysisTaskRequest createRedisBigKeyAnalysisTaskRequest = new CreateRedisBigKeyAnalysisTaskRequest();
        createRedisBigKeyAnalysisTaskRequest.setAppId("");
        createRedisBigKeyAnalysisTaskRequest.setClusterId("");
        createRedisBigKeyAnalysisTaskRequest.setBackupType(0);
        createRedisBigKeyAnalysisTaskRequest.setBackupId("");
        try {
            CreateRedisBigKeyAnalysisTaskResponse response = client.createRedisBigKeyAnalysisTask(createRedisBigKeyAnalysisTaskRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
