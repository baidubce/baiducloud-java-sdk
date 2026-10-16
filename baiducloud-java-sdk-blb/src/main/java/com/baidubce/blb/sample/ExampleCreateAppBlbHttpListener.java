package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.CreateAppBlbHttpListenerRequest;
import com.baidubce.blb.models.AdditionalAttributesModel;

public class ExampleCreateAppBlbHttpListener {
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

        CreateAppBlbHttpListenerRequest createAppBlbHttpListenerRequest = new CreateAppBlbHttpListenerRequest();
        createAppBlbHttpListenerRequest.setBlbId("");
        createAppBlbHttpListenerRequest.setClientToken("");
        createAppBlbHttpListenerRequest.setListenerPort(0);
        createAppBlbHttpListenerRequest.setScheduler("");
        createAppBlbHttpListenerRequest.setKeepSession(false);
        createAppBlbHttpListenerRequest.setKeepSessionType("");
        createAppBlbHttpListenerRequest.setKeepSessionTimeout(0);
        createAppBlbHttpListenerRequest.setKeepSessionCookieName("");
        createAppBlbHttpListenerRequest.setXForwardedFor(false);
        createAppBlbHttpListenerRequest.setXForwardedProto(false);
        createAppBlbHttpListenerRequest.setAdditionalAttributes(additionalAttributes);
        createAppBlbHttpListenerRequest.setServerTimeout(0);
        createAppBlbHttpListenerRequest.setRedirectPort(0);
        createAppBlbHttpListenerRequest.setDescription("");
        try {
            client.createAppBlbHttpListener(createAppBlbHttpListenerRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
