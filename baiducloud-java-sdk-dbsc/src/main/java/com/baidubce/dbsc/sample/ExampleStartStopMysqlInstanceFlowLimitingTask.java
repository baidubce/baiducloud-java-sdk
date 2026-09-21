package com.baidubce.dbsc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dbsc.DbscClient;
import com.baidubce.dbsc.models.StartStopMysqlInstanceFlowLimitingTaskRequest;

public class ExampleStartStopMysqlInstanceFlowLimitingTask {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DbscClient client = new DbscClient(bceClientConfig);
        StartStopMysqlInstanceFlowLimitingTaskRequest startStopMysqlInstanceFlowLimitingTaskRequest = new StartStopMysqlInstanceFlowLimitingTaskRequest();
        startStopMysqlInstanceFlowLimitingTaskRequest.setFilterId(0);
        startStopMysqlInstanceFlowLimitingTaskRequest.setAction("");
        startStopMysqlInstanceFlowLimitingTaskRequest.setAppId("");
        startStopMysqlInstanceFlowLimitingTaskRequest.setNodeId("");
        try {
            client.startStopMysqlInstanceFlowLimitingTask(startStopMysqlInstanceFlowLimitingTaskRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
