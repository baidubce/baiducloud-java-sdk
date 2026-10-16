package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.UpdateBlbSslListenerRequest;
import java.util.ArrayList;

public class ExampleUpdateBlbSslListener {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        UpdateBlbSslListenerRequest updateBlbSslListenerRequest = new UpdateBlbSslListenerRequest();
        updateBlbSslListenerRequest.setBlbId("");
        updateBlbSslListenerRequest.setListenerPort(0);
        updateBlbSslListenerRequest.setClientToken("");
        updateBlbSslListenerRequest.setBackendPort(0);
        updateBlbSslListenerRequest.setScheduler("");
        updateBlbSslListenerRequest.setHealthCheckType("");
        updateBlbSslListenerRequest.setHealthCheckTimeoutInSecond(0);
        updateBlbSslListenerRequest.setHealthCheckInterval(0);
        updateBlbSslListenerRequest.setUnhealthyThreshold(0);
        updateBlbSslListenerRequest.setHealthyThreshold(0);
        updateBlbSslListenerRequest.setCertIds(new ArrayList<>());
        updateBlbSslListenerRequest.setEncryptionType("");
        updateBlbSslListenerRequest.setEncryptionProtocols(new ArrayList<>());
        updateBlbSslListenerRequest.setAppliedCiphers("");
        updateBlbSslListenerRequest.setDualAuth(false);
        updateBlbSslListenerRequest.setClientCertIds(new ArrayList<>());
        try {
            client.updateBlbSslListener(updateBlbSslListenerRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
