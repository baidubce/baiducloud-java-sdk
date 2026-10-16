package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.CreateAppBlbSslListenerRequest;
import java.util.ArrayList;

public class ExampleCreateAppBlbSslListener {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        CreateAppBlbSslListenerRequest createAppBlbSslListenerRequest = new CreateAppBlbSslListenerRequest();
        createAppBlbSslListenerRequest.setBlbId("");
        createAppBlbSslListenerRequest.setClientToken("");
        createAppBlbSslListenerRequest.setListenerPort(0);
        createAppBlbSslListenerRequest.setScheduler("");
        createAppBlbSslListenerRequest.setCertIds(new ArrayList<>());
        createAppBlbSslListenerRequest.setEncryptionType("");
        createAppBlbSslListenerRequest.setEncryptionProtocols(new ArrayList<>());
        createAppBlbSslListenerRequest.setAppliedCiphers("");
        createAppBlbSslListenerRequest.setDualAuth(false);
        createAppBlbSslListenerRequest.setClientCertIds(new ArrayList<>());
        createAppBlbSslListenerRequest.setDescription("");
        try {
            client.createAppBlbSslListener(createAppBlbSslListenerRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
