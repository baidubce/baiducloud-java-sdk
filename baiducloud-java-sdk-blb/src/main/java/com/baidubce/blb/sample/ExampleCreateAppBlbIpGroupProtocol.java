package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.CreateAppBlbIpGroupProtocolRequest;

public class ExampleCreateAppBlbIpGroupProtocol {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        CreateAppBlbIpGroupProtocolRequest createAppBlbIpGroupProtocolRequest = new CreateAppBlbIpGroupProtocolRequest();
        createAppBlbIpGroupProtocolRequest.setBlbId("");
        createAppBlbIpGroupProtocolRequest.setClientToken("");
        createAppBlbIpGroupProtocolRequest.setIpGroupId("");
        createAppBlbIpGroupProtocolRequest.setType("");
        createAppBlbIpGroupProtocolRequest.setHealthCheck("");
        createAppBlbIpGroupProtocolRequest.setHealthCheckHttpVersion("");
        createAppBlbIpGroupProtocolRequest.setHealthCheckMethod("");
        createAppBlbIpGroupProtocolRequest.setHealthCheckPort(0);
        createAppBlbIpGroupProtocolRequest.setHealthCheckUrlPath("");
        createAppBlbIpGroupProtocolRequest.setHealthCheckTimeoutInSecond(0);
        createAppBlbIpGroupProtocolRequest.setHealthCheckIntervalInSecond(0);
        createAppBlbIpGroupProtocolRequest.setHealthCheckDownRetry(0);
        createAppBlbIpGroupProtocolRequest.setHealthCheckUpRetry(0);
        createAppBlbIpGroupProtocolRequest.setHealthCheckNormalStatus("");
        createAppBlbIpGroupProtocolRequest.setHealthCheckHost("");
        createAppBlbIpGroupProtocolRequest.setUdpHealthCheckString("");
        try {
            client.createAppBlbIpGroupProtocol(createAppBlbIpGroupProtocolRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
