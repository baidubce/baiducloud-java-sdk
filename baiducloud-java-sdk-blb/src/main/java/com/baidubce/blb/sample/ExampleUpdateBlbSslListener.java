package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.UpdateBlbSslListenerRequest;
import java.util.ArrayList;

public class ExampleUpdateBlbSslListener {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BlbClient client = new BlbClient(config);
        UpdateBlbSslListenerRequest updateBlbSslListenerRequest = new UpdateBlbSslListenerRequest();
        updateBlbSslListenerRequest.setBlbId("");
        updateBlbSslListenerRequest.setListenerPort(0);
        updateBlbSslListenerRequest.setBackendPort(0);
        updateBlbSslListenerRequest.setScheduler("");
        updateBlbSslListenerRequest.setHealthCheckType("");
        updateBlbSslListenerRequest.setHealthCheckTimeoutInSecond(0);
        updateBlbSslListenerRequest.setHealthCheckInterval(0);
        updateBlbSslListenerRequest.setUnhealthyThreshold(0);
        updateBlbSslListenerRequest.setHealthyThreshold(0);
        updateBlbSslListenerRequest.setCertIds(new ArrayList<>());
        updateBlbSslListenerRequest.setEncryptionType("");
        updateBlbSslListenerRequest.setEncryptionProtocols(new ArrayList<>());
        updateBlbSslListenerRequest.setAppliedCiphers("");
        updateBlbSslListenerRequest.setDualAuth(false);
        updateBlbSslListenerRequest.setClientCertIds(new ArrayList<>());
        try {
            client.updateBlbSslListener(updateBlbSslListenerRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
