package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.UpdateBlbHttpListenerRequest;
import com.baidubce.blb.models.AdditionalAttributesModel;

public class ExampleUpdateBlbHttpListener {
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

        UpdateBlbHttpListenerRequest updateBlbHttpListenerRequest = new UpdateBlbHttpListenerRequest();
        updateBlbHttpListenerRequest.setBlbId("");
        updateBlbHttpListenerRequest.setListenerPort(0);
        updateBlbHttpListenerRequest.setClientToken("");
        updateBlbHttpListenerRequest.setBackendPort(0);
        updateBlbHttpListenerRequest.setScheduler("");
        updateBlbHttpListenerRequest.setKeepSession(false);
        updateBlbHttpListenerRequest.setKeepSessionType("");
        updateBlbHttpListenerRequest.setKeepSessionDuration(0);
        updateBlbHttpListenerRequest.setKeepSessionCookieName("");
        updateBlbHttpListenerRequest.setXForwardFor(false);
        updateBlbHttpListenerRequest.setXForwardedProto(false);
        updateBlbHttpListenerRequest.setAdditionalAttributes(additionalAttributes);
        updateBlbHttpListenerRequest.setHealthCheckType("");
        updateBlbHttpListenerRequest.setHealthCheckHttpVersion("");
        updateBlbHttpListenerRequest.setHealthCheckMethod("");
        updateBlbHttpListenerRequest.setHealthCheckPort(0);
        updateBlbHttpListenerRequest.setHealthCheckURI("");
        updateBlbHttpListenerRequest.setHealthCheckTimeoutInSecond(0);
        updateBlbHttpListenerRequest.setHealthCheckInterval(0);
        updateBlbHttpListenerRequest.setUnhealthyThreshold(0);
        updateBlbHttpListenerRequest.setHealthyThreshold(0);
        updateBlbHttpListenerRequest.setHealthCheckNormalStatus("");
        updateBlbHttpListenerRequest.setHealthCheckHost("");
        updateBlbHttpListenerRequest.setServerTimeout(0);
        updateBlbHttpListenerRequest.setRedirectPort(0);
        try {
            client.updateBlbHttpListener(updateBlbHttpListenerRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
