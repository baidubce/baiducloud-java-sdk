package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.UpdateBlbTcpListenerRequest;

public class ExampleUpdateBlbTcpListener {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        UpdateBlbTcpListenerRequest updateBlbTcpListenerRequest = new UpdateBlbTcpListenerRequest();
        updateBlbTcpListenerRequest.setBlbId("");
        updateBlbTcpListenerRequest.setListenerPort(0);
        updateBlbTcpListenerRequest.setClientToken("");
        updateBlbTcpListenerRequest.setBackendPort(0);
        updateBlbTcpListenerRequest.setScheduler("");
        updateBlbTcpListenerRequest.setHealthCheckType("");
        updateBlbTcpListenerRequest.setHealthCheckTimeoutInSecond(0);
        updateBlbTcpListenerRequest.setHealthCheckInterval(0);
        updateBlbTcpListenerRequest.setUnhealthyThreshold(0);
        updateBlbTcpListenerRequest.setHealthyThreshold(0);
        try {
            client.updateBlbTcpListener(updateBlbTcpListenerRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
