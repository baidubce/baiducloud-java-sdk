package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.UpdateBlbUdpListenerRequest;

public class ExampleUpdateBlbUdpListener {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        UpdateBlbUdpListenerRequest updateBlbUdpListenerRequest = new UpdateBlbUdpListenerRequest();
        updateBlbUdpListenerRequest.setBlbId("");
        updateBlbUdpListenerRequest.setListenerPort(0);
        updateBlbUdpListenerRequest.setClientToken("");
        updateBlbUdpListenerRequest.setBackendPort(0);
        updateBlbUdpListenerRequest.setScheduler("");
        updateBlbUdpListenerRequest.setHealthCheckType("");
        updateBlbUdpListenerRequest.setHealthCheckPort(0);
        updateBlbUdpListenerRequest.setHealthCheckTimeoutInSecond(0);
        updateBlbUdpListenerRequest.setHealthCheckInterval(0);
        updateBlbUdpListenerRequest.setUnhealthyThreshold(0);
        updateBlbUdpListenerRequest.setHealthyThreshold(0);
        updateBlbUdpListenerRequest.setHealthCheckString("");
        updateBlbUdpListenerRequest.setUdpSessionTimeout(0);
        try {
            client.updateBlbUdpListener(updateBlbUdpListenerRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
