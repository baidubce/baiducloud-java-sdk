package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.AuthorizeServerEventRequest;
import com.baidubce.bcc.models.AuthorizeServerEventResponse;

public class ExampleAuthorizeServerEvent {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        AuthorizeServerEventRequest authorizeServerEventRequest = new AuthorizeServerEventRequest();
        authorizeServerEventRequest.setAction("");
        authorizeServerEventRequest.setServerEventId("");
        authorizeServerEventRequest.setInstanceId("");
        authorizeServerEventRequest.setAuthorizeMaintenanceOperation("");
        authorizeServerEventRequest.setExecuteTime("");
        try {
            AuthorizeServerEventResponse response = client.authorizeServerEvent(authorizeServerEventRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
