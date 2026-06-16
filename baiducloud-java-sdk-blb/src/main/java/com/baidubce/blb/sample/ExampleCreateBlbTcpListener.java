package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.CreateBlbTcpListenerRequest;

public class ExampleCreateBlbTcpListener {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BlbClient client = new BlbClient(bceClientConfig);
        CreateBlbTcpListenerRequest createBlbTcpListenerRequest = new CreateBlbTcpListenerRequest();
        createBlbTcpListenerRequest.setBlbId("");
        createBlbTcpListenerRequest.setListenerPort(0);
        createBlbTcpListenerRequest.setBackendPort(0);
        createBlbTcpListenerRequest.setScheduler("");
        createBlbTcpListenerRequest.setTcpSessionTimeout(0);
        createBlbTcpListenerRequest.setHealthCheckType("");
        createBlbTcpListenerRequest.setHealthCheckTimeoutInSecond(0);
        createBlbTcpListenerRequest.setHealthCheckInterval(0);
        createBlbTcpListenerRequest.setUnhealthyThreshold(0);
        createBlbTcpListenerRequest.setHealthyThreshold(0);
        try {
            client.createBlbTcpListener(createBlbTcpListenerRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
