package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.ListTaskRequest;
import com.baidubce.bcc.models.ListTaskResponse;
import java.util.ArrayList;

public class ExampleListTask {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        ListTaskRequest listTaskRequest = new ListTaskRequest();
        listTaskRequest.setTaskIds(new ArrayList<>());
        listTaskRequest.setMarker("");
        listTaskRequest.setMaxKeys(0);
        listTaskRequest.setTaskAction("");
        listTaskRequest.setTaskStatus("");
        listTaskRequest.setStartTime("");
        listTaskRequest.setEndTime("");
        listTaskRequest.setResourceIds(new ArrayList<>());
        try {
            ListTaskResponse response = client.listTask(listTaskRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
