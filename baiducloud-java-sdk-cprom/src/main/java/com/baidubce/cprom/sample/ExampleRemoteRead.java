package com.baidubce.cprom.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cprom.CpromClient;
import com.baidubce.cprom.models.RemoteReadRequest;
import com.baidubce.cprom.models.RemoteReadResponse;

public class ExampleRemoteRead {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        CpromClient client = new CpromClient(bceClientConfig);
        RemoteReadRequest remoteReadRequest = new RemoteReadRequest();
        remoteReadRequest.setRemoteReadUrl("");
        remoteReadRequest.setQuery("");
        remoteReadRequest.setStep(0);
        remoteReadRequest.setStart(0L);
        remoteReadRequest.setEnd(0L);
        try {
            RemoteReadResponse response = client.remoteRead(remoteReadRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
