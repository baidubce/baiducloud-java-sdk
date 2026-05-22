package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.UpdateAppBlbHttpListenerRequest;
import com.baidubce.blb.models.AdditionalAttributesModel;

public class ExampleUpdateAppBlbHttpListener {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BlbClient client = new BlbClient(config);
        AdditionalAttributesModel additionalAttributes = new AdditionalAttributesModel();
        additionalAttributes.setGzipJson("");

        UpdateAppBlbHttpListenerRequest updateAppBlbHttpListenerRequest = new UpdateAppBlbHttpListenerRequest();
        updateAppBlbHttpListenerRequest.setBlbId("");
        updateAppBlbHttpListenerRequest.setClientToken("");
        updateAppBlbHttpListenerRequest.setListenerPort(0);
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
