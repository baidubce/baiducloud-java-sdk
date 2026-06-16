package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.CreateBlbSslListenerRequest;
import java.util.ArrayList;

public class ExampleCreateBlbSslListener {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BlbClient client = new BlbClient(bceClientConfig);
        CreateBlbSslListenerRequest createBlbSslListenerRequest = new CreateBlbSslListenerRequest();
        createBlbSslListenerRequest.setBlbId("");
        createBlbSslListenerRequest.setClientToken("");
        createBlbSslListenerRequest.setListenerPort(0);
        createBlbSslListenerRequest.setBackendPort(0);
        createBlbSslListenerRequest.setScheduler("");
        createBlbSslListenerRequest.setHealthCheckType("");
        createBlbSslListenerRequest.setServerTimeout(0);
        createBlbSslListenerRequest.setHealthCheckTimeoutInSecond(0);
        createBlbSslListenerRequest.setHealthCheckInterval(0);
        createBlbSslListenerRequest.setUnhealthyThreshold(0);
        createBlbSslListenerRequest.setHealthyThreshold(0);
        createBlbSslListenerRequest.setCertIds(new ArrayList<>());
        createBlbSslListenerRequest.setEncryptionType("");
        createBlbSslListenerRequest.setEncryptionProtocols(new ArrayList<>());
        createBlbSslListenerRequest.setAppliedCiphers("");
        createBlbSslListenerRequest.setDualAuth(false);
        createBlbSslListenerRequest.setClientCertIds(new ArrayList<>());
        try {
            client.createBlbSslListener(createBlbSslListenerRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
