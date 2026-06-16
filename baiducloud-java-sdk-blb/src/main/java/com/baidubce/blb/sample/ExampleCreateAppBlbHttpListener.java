package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.CreateAppBlbHttpListenerRequest;
import com.baidubce.blb.models.AdditionalAttributesModel;

public class ExampleCreateAppBlbHttpListener {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
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
