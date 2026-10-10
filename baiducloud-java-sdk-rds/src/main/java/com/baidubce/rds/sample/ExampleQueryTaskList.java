package com.baidubce.rds.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rds.RdsClient;
import com.baidubce.rds.models.QueryTaskListRequest;

public class ExampleQueryTaskList {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        RdsClient client = new RdsClient(bceClientConfig);
        QueryTaskListRequest queryTaskListRequest = new QueryTaskListRequest();
        queryTaskListRequest.setPageSize("");
        queryTaskListRequest.setPageNo("");
        queryTaskListRequest.setInstanceId("");
        queryTaskListRequest.setInstanceName("");
        queryTaskListRequest.setTaskId(0);
        queryTaskListRequest.setTaskType("");
        queryTaskListRequest.setTaskStatus("");
        queryTaskListRequest.setStartTime("");
        queryTaskListRequest.setEndTime("");
        try {
            client.queryTaskList(queryTaskListRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
