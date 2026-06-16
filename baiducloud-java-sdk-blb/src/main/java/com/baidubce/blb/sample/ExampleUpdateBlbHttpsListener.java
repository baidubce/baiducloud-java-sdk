package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.UpdateBlbHttpsListenerRequest;
import com.baidubce.blb.models.AdditionalAttributesModel;
import java.util.ArrayList;

public class ExampleUpdateBlbHttpsListener {
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

        UpdateBlbHttpsListenerRequest updateBlbHttpsListenerRequest = new UpdateBlbHttpsListenerRequest();
        updateBlbHttpsListenerRequest.setBlbId("");
        updateBlbHttpsListenerRequest.setListenerPort(0);
        updateBlbHttpsListenerRequest.setBackendPort(0);
        updateBlbHttpsListenerRequest.setScheduler("");
        updateBlbHttpsListenerRequest.setKeepSession(false);
        updateBlbHttpsListenerRequest.setKeepSessionType("");
        updateBlbHttpsListenerRequest.setKeepSessionDuration(0);
        updateBlbHttpsListenerRequest.setKeepSessionCookieName("");
        updateBlbHttpsListenerRequest.setXForwardFor(false);
        updateBlbHttpsListenerRequest.setXForwardedProto(false);
        updateBlbHttpsListenerRequest.setAdditionalAttributes(additionalAttributes);
        updateBlbHttpsListenerRequest.setHealthCheckType("");
        updateBlbHttpsListenerRequest.setHealthCheckPort(0);
        updateBlbHttpsListenerRequest.setHealthCheckURI("");
        updateBlbHttpsListenerRequest.setHealthCheckTimeoutInSecond(0);
        updateBlbHttpsListenerRequest.setHealthCheckInterval(0);
        updateBlbHttpsListenerRequest.setUnhealthyThreshold(0);
        updateBlbHttpsListenerRequest.setHealthyThreshold(0);
        updateBlbHttpsListenerRequest.setHealthCheckNormalStatus("");
        updateBlbHttpsListenerRequest.setHealthCheckHost("");
        updateBlbHttpsListenerRequest.setServerTimeout(0);
        updateBlbHttpsListenerRequest.setCertIds(new ArrayList<>());
        updateBlbHttpsListenerRequest.setAdditionalCertDomains(new ArrayList<>());
        updateBlbHttpsListenerRequest.setEncryptionType("");
        updateBlbHttpsListenerRequest.setEncryptionProtocols(new ArrayList<>());
        updateBlbHttpsListenerRequest.setAppliedCiphers("");
        try {
            client.updateBlbHttpsListener(updateBlbHttpsListenerRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
