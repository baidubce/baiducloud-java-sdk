package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.BatchCreateDiagnosisTasksRequest;
import com.baidubce.cce.models.BatchCreateDiagnosisTasksResponse;
import java.util.ArrayList;

public class ExampleBatchCreateDiagnosisTasks {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CceClient client = new CceClient(bceClientConfig);
        BatchCreateDiagnosisTasksRequest batchCreateDiagnosisTasksRequest = new BatchCreateDiagnosisTasksRequest();
        batchCreateDiagnosisTasksRequest.setClusterID("");
        batchCreateDiagnosisTasksRequest.setType("");
        batchCreateDiagnosisTasksRequest.setTargets(new ArrayList<>());
        try {
            BatchCreateDiagnosisTasksResponse response = client.batchCreateDiagnosisTasks(batchCreateDiagnosisTasksRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
