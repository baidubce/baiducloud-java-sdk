package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.UpdateAppBlbIpGroupProtocolRequest;

public class ExampleUpdateAppBlbIpGroupProtocol {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        UpdateAppBlbIpGroupProtocolRequest updateAppBlbIpGroupProtocolRequest = new UpdateAppBlbIpGroupProtocolRequest();
        updateAppBlbIpGroupProtocolRequest.setBlbId("");
        updateAppBlbIpGroupProtocolRequest.setClientToken("");
        updateAppBlbIpGroupProtocolRequest.setIpGroupId("");
        updateAppBlbIpGroupProtocolRequest.setId("");
        updateAppBlbIpGroupProtocolRequest.setHealthCheck("");
        updateAppBlbIpGroupProtocolRequest.setHealthCheckHttpVersion("");
        updateAppBlbIpGroupProtocolRequest.setHealthCheckMethod("");
        updateAppBlbIpGroupProtocolRequest.setHealthCheckPort(0);
        updateAppBlbIpGroupProtocolRequest.setHealthCheckUrlPath("");
        updateAppBlbIpGroupProtocolRequest.setHealthCheckTimeoutInSecond(0);
        updateAppBlbIpGroupProtocolRequest.setHealthCheckIntervalInSecond(0);
        updateAppBlbIpGroupProtocolRequest.setHealthCheckDownRetry(0);
        updateAppBlbIpGroupProtocolRequest.setHealthCheckUpRetry(0);
        updateAppBlbIpGroupProtocolRequest.setHealthCheckNormalStatus("");
        updateAppBlbIpGroupProtocolRequest.setHealthCheckHost("");
        updateAppBlbIpGroupProtocolRequest.setUdpHealthCheckString("");
        try {
            client.updateAppBlbIpGroupProtocol(updateAppBlbIpGroupProtocolRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
