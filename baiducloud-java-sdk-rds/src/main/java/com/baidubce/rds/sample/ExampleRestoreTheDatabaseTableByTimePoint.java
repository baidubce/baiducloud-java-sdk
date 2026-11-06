package com.baidubce.rds.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rds.RdsClient;
import com.baidubce.rds.models.RestoreTheDatabaseTableByTimePointRequest;
import java.util.ArrayList;

public class ExampleRestoreTheDatabaseTableByTimePoint {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        RdsClient client = new RdsClient(bceClientConfig);
        RestoreTheDatabaseTableByTimePointRequest restoreTheDatabaseTableByTimePointRequest = new RestoreTheDatabaseTableByTimePointRequest();
        restoreTheDatabaseTableByTimePointRequest.setInstanceId("");
        restoreTheDatabaseTableByTimePointRequest.setSourceInstanceId("");
        restoreTheDatabaseTableByTimePointRequest.setTargetInstanceId("");
        restoreTheDatabaseTableByTimePointRequest.setDatetime("");
        restoreTheDatabaseTableByTimePointRequest.setData(new ArrayList<>());
        restoreTheDatabaseTableByTimePointRequest.setDbName("");
        restoreTheDatabaseTableByTimePointRequest.setNewDbname("");
        restoreTheDatabaseTableByTimePointRequest.setRestoreMode("");
        restoreTheDatabaseTableByTimePointRequest.setTables(new ArrayList<>());
        restoreTheDatabaseTableByTimePointRequest.setTableName("");
        restoreTheDatabaseTableByTimePointRequest.setNewTablename("");
        try {
            client.restoreTheDatabaseTableByTimePoint(restoreTheDatabaseTableByTimePointRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
