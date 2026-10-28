package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.CheckServerEventRequest;
import com.baidubce.bcc.models.CheckServerEventResponse;

public class ExampleCheckServerEvent {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        CheckServerEventRequest checkServerEventRequest = new CheckServerEventRequest();
        checkServerEventRequest.setAction("");
        checkServerEventRequest.setServerEventId("");
        checkServerEventRequest.setInstanceId("");
        checkServerEventRequest.setCheckResult("");
        checkServerEventRequest.setIssueEffect("");
        checkServerEventRequest.setIssueDescription("");
        checkServerEventRequest.setAuthorizeMaintenanceOperation("");
        try {
            CheckServerEventResponse response = client.checkServerEvent(checkServerEventRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
