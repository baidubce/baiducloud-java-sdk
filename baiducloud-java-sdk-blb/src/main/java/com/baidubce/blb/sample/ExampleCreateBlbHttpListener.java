package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.CreateBlbHttpListenerRequest;
import com.baidubce.blb.models.AdditionalAttributesModel;

public class ExampleCreateBlbHttpListener {
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

        CreateBlbHttpListenerRequest createBlbHttpListenerRequest = new CreateBlbHttpListenerRequest();
        createBlbHttpListenerRequest.setBlbId("");
        createBlbHttpListenerRequest.setClientToken("");
        createBlbHttpListenerRequest.setListenerPort(0);
        createBlbHttpListenerRequest.setBackendPort(0);
        createBlbHttpListenerRequest.setScheduler("");
        createBlbHttpListenerRequest.setKeepSession(false);
        createBlbHttpListenerRequest.setKeepSessionType("");
        createBlbHttpListenerRequest.setKeepSessionDuration(0);
        createBlbHttpListenerRequest.setKeepSessionCookieName("");
        createBlbHttpListenerRequest.setXForwardFor(false);
        createBlbHttpListenerRequest.setXForwardedProto(false);
        createBlbHttpListenerRequest.setAdditionalAttributes(additionalAttributes);
        createBlbHttpListenerRequest.setHealthCheckType("");
        createBlbHttpListenerRequest.setHealthCheckPort(0);
        createBlbHttpListenerRequest.setHealthCheckURI("");
        createBlbHttpListenerRequest.setHealthCheckTimeoutInSecond(0);
        createBlbHttpListenerRequest.setHealthCheckInterval(0);
        createBlbHttpListenerRequest.setUnhealthyThreshold(0);
        createBlbHttpListenerRequest.setHealthyThreshold(0);
        createBlbHttpListenerRequest.setHealthCheckNormalStatus("");
        createBlbHttpListenerRequest.setHealthCheckHost("");
        createBlbHttpListenerRequest.setServerTimeout(0);
        createBlbHttpListenerRequest.setRedirectPort(0);
        try {
            client.createBlbHttpListener(createBlbHttpListenerRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
