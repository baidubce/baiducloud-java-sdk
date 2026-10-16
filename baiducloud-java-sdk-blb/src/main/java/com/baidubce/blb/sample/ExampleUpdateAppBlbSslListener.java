package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.UpdateAppBlbSslListenerRequest;
import java.util.ArrayList;

public class ExampleUpdateAppBlbSslListener {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        UpdateAppBlbSslListenerRequest updateAppBlbSslListenerRequest = new UpdateAppBlbSslListenerRequest();
        updateAppBlbSslListenerRequest.setBlbId("");
        updateAppBlbSslListenerRequest.setListenerPort(0);
        updateAppBlbSslListenerRequest.setClientToken("");
        updateAppBlbSslListenerRequest.setScheduler("");
        updateAppBlbSslListenerRequest.setCertIds(new ArrayList<>());
        updateAppBlbSslListenerRequest.setEncryptionType("");
        updateAppBlbSslListenerRequest.setEncryptionProtocols(new ArrayList<>());
        updateAppBlbSslListenerRequest.setAppliedCiphers("");
        updateAppBlbSslListenerRequest.setDualAuth(false);
        updateAppBlbSslListenerRequest.setClientCertIds(new ArrayList<>());
        updateAppBlbSslListenerRequest.setDescription("");
        try {
            client.updateAppBlbSslListener(updateAppBlbSslListenerRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
