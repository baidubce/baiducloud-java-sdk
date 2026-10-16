package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.UpdateAppBlbTcpListenerRequest;

public class ExampleUpdateAppBlbTcpListener {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        UpdateAppBlbTcpListenerRequest updateAppBlbTcpListenerRequest = new UpdateAppBlbTcpListenerRequest();
        updateAppBlbTcpListenerRequest.setBlbId("");
        updateAppBlbTcpListenerRequest.setListenerPort(0);
        updateAppBlbTcpListenerRequest.setClientToken("");
        updateAppBlbTcpListenerRequest.setScheduler("");
        updateAppBlbTcpListenerRequest.setTcpSessionTimeout(0);
        updateAppBlbTcpListenerRequest.setDescription("");
        try {
            client.updateAppBlbTcpListener(updateAppBlbTcpListenerRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
