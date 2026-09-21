package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.CreateDiagnosisTaskRequest;
import com.baidubce.cce.models.Target;
import com.baidubce.cce.models.ExistedOption;
import com.baidubce.cce.models.CreateDiagnosisTaskResponse;

public class ExampleCreateDiagnosisTask {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CceClient client = new CceClient(bceClientConfig);
        Target target = new Target();
        target.setNodeName("");
        target.setNamespace("");
        target.setPodName("");

        ExistedOption existedOption = new ExistedOption();
        existedOption.setExistedTask(false);
        existedOption.setTaskId("");

        CreateDiagnosisTaskRequest createDiagnosisTaskRequest = new CreateDiagnosisTaskRequest();
        createDiagnosisTaskRequest.setClusterID("");
        createDiagnosisTaskRequest.setType("");
        createDiagnosisTaskRequest.setTarget(target);
        createDiagnosisTaskRequest.setExistedOption(existedOption);
        try {
            CreateDiagnosisTaskResponse response = client.createDiagnosisTask(createDiagnosisTaskRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
