package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.UpdateAppBlbHttpsListenerRequest;
import java.util.ArrayList;

public class ExampleUpdateAppBlbHttpsListener {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        UpdateAppBlbHttpsListenerRequest updateAppBlbHttpsListenerRequest = new UpdateAppBlbHttpsListenerRequest();
        updateAppBlbHttpsListenerRequest.setBlbId("");
        updateAppBlbHttpsListenerRequest.setListenerPort(0);
        updateAppBlbHttpsListenerRequest.setClientToken("");
        updateAppBlbHttpsListenerRequest.setScheduler("");
        updateAppBlbHttpsListenerRequest.setKeepSession(false);
        updateAppBlbHttpsListenerRequest.setKeepSessionType("");
        updateAppBlbHttpsListenerRequest.setKeepSessionTimeout(0);
        updateAppBlbHttpsListenerRequest.setKeepSessionCookieName("");
        updateAppBlbHttpsListenerRequest.setXForwardedFor(false);
        updateAppBlbHttpsListenerRequest.setXForwardedProto(false);
        updateAppBlbHttpsListenerRequest.setServerTimeout(0);
        updateAppBlbHttpsListenerRequest.setCertIds(new ArrayList<>());
        updateAppBlbHttpsListenerRequest.setEncryptionType("");
        updateAppBlbHttpsListenerRequest.setEncryptionProtocols(new ArrayList<>());
        updateAppBlbHttpsListenerRequest.setAppliedCiphers("");
        updateAppBlbHttpsListenerRequest.setDualAuth(false);
        updateAppBlbHttpsListenerRequest.setClientCertIds(new ArrayList<>());
        updateAppBlbHttpsListenerRequest.setAdditionalCertDomains(new ArrayList<>());
        updateAppBlbHttpsListenerRequest.setDescription("");
        try {
            client.updateAppBlbHttpsListener(updateAppBlbHttpsListenerRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
