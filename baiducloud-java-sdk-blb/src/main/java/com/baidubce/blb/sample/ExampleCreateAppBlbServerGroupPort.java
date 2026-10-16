package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.CreateAppBlbServerGroupPortRequest;
import com.baidubce.blb.models.CreateAppBlbServerGroupPortResponse;

public class ExampleCreateAppBlbServerGroupPort {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        CreateAppBlbServerGroupPortRequest createAppBlbServerGroupPortRequest = new CreateAppBlbServerGroupPortRequest();
        createAppBlbServerGroupPortRequest.setBlbId("");
        createAppBlbServerGroupPortRequest.setClientToken("");
        createAppBlbServerGroupPortRequest.setSgId("");
        createAppBlbServerGroupPortRequest.setPort(0);
        createAppBlbServerGroupPortRequest.setType("");
        createAppBlbServerGroupPortRequest.setEnableHealthCheck(false);
        createAppBlbServerGroupPortRequest.setHealthCheck("");
        createAppBlbServerGroupPortRequest.setHealthCheckHttpVersion("");
        createAppBlbServerGroupPortRequest.setHealthCheckMethod("");
        createAppBlbServerGroupPortRequest.setHealthCheckPort(0);
        createAppBlbServerGroupPortRequest.setHealthCheckUrlPath("");
        createAppBlbServerGroupPortRequest.setHealthCheckTimeoutInSecond(0);
        createAppBlbServerGroupPortRequest.setHealthCheckIntervalInSecond(0);
        createAppBlbServerGroupPortRequest.setHealthCheckDownRetry(0);
        createAppBlbServerGroupPortRequest.setHealthCheckUpRetry(0);
        createAppBlbServerGroupPortRequest.setHealthCheckNormalStatus("");
        createAppBlbServerGroupPortRequest.setHealthCheckHost("");
        createAppBlbServerGroupPortRequest.setUdpHealthCheckString("");
        try {
            CreateAppBlbServerGroupPortResponse response = client.createAppBlbServerGroupPort(createAppBlbServerGroupPortRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
