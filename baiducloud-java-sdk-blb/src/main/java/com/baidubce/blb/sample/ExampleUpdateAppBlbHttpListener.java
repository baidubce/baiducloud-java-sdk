package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.UpdateAppBlbHttpListenerRequest;
import com.baidubce.blb.models.AdditionalAttributesModel;

public class ExampleUpdateAppBlbHttpListener {
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

        UpdateAppBlbHttpListenerRequest updateAppBlbHttpListenerRequest = new UpdateAppBlbHttpListenerRequest();
        updateAppBlbHttpListenerRequest.setBlbId("");
        updateAppBlbHttpListenerRequest.setListenerPort(0);
        updateAppBlbHttpListenerRequest.setClientToken("");
        updateAppBlbHttpListenerRequest.setScheduler("");
        updateAppBlbHttpListenerRequest.setKeepSession(false);
        updateAppBlbHttpListenerRequest.setKeepSessionType("");
        updateAppBlbHttpListenerRequest.setKeepSessionTimeout(0);
        updateAppBlbHttpListenerRequest.setKeepSessionCookieName("");
        updateAppBlbHttpListenerRequest.setXForwardedFor(false);
        updateAppBlbHttpListenerRequest.setXForwardedProto(false);
        updateAppBlbHttpListenerRequest.setAdditionalAttributes(additionalAttributes);
        updateAppBlbHttpListenerRequest.setServerTimeout(0);
        updateAppBlbHttpListenerRequest.setRedirectPort(0);
        updateAppBlbHttpListenerRequest.setDescription("");
        try {
            client.updateAppBlbHttpListener(updateAppBlbHttpListenerRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
