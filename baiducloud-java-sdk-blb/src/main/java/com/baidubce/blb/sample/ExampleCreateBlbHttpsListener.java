package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.CreateBlbHttpsListenerRequest;
import com.baidubce.blb.models.AdditionalAttributesModel;
import java.util.ArrayList;

public class ExampleCreateBlbHttpsListener {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        AdditionalAttributesModel additionalAttributes = new AdditionalAttributesModel();
        additionalAttributes.setGzipJson("");

        CreateBlbHttpsListenerRequest createBlbHttpsListenerRequest = new CreateBlbHttpsListenerRequest();
        createBlbHttpsListenerRequest.setBlbId("");
        createBlbHttpsListenerRequest.setClientToken("");
        createBlbHttpsListenerRequest.setListenerPort(0);
        createBlbHttpsListenerRequest.setBackendPort(0);
        createBlbHttpsListenerRequest.setScheduler("");
        createBlbHttpsListenerRequest.setKeepSession(false);
        createBlbHttpsListenerRequest.setKeepSessionType("");
        createBlbHttpsListenerRequest.setKeepSessionDuration(0);
        createBlbHttpsListenerRequest.setKeepSessionCookieName(0);
        createBlbHttpsListenerRequest.setXForwardFor(false);
        createBlbHttpsListenerRequest.setXForwardedProto(false);
        createBlbHttpsListenerRequest.setAdditionalAttributes(additionalAttributes);
        createBlbHttpsListenerRequest.setHealthCheckType("");
        createBlbHttpsListenerRequest.setHealthCheckHttpVersion("");
        createBlbHttpsListenerRequest.setHealthCheckMethod("");
        createBlbHttpsListenerRequest.setHealthCheckPort(0);
        createBlbHttpsListenerRequest.setHealthCheckURI("");
        createBlbHttpsListenerRequest.setHealthCheckTimeoutInSecond(0);
        createBlbHttpsListenerRequest.setHealthCheckInterval(0);
        createBlbHttpsListenerRequest.setUnhealthyThreshold(0);
        createBlbHttpsListenerRequest.setHealthyThreshold(0);
        createBlbHttpsListenerRequest.setHealthCheckNormalStatus("");
        createBlbHttpsListenerRequest.setHealthCheckHost("");
        createBlbHttpsListenerRequest.setServerTimeout(0);
        createBlbHttpsListenerRequest.setCertIds(new ArrayList<>());
        createBlbHttpsListenerRequest.setEncryptionType("");
        createBlbHttpsListenerRequest.setEncryptionProtocols(new ArrayList<>());
        createBlbHttpsListenerRequest.setAppliedCiphers("");
        createBlbHttpsListenerRequest.setDualAuth(false);
        createBlbHttpsListenerRequest.setClientCertIds(new ArrayList<>());
        createBlbHttpsListenerRequest.setAdditionalCertDomains(new ArrayList<>());
        try {
            client.createBlbHttpsListener(createBlbHttpsListenerRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
