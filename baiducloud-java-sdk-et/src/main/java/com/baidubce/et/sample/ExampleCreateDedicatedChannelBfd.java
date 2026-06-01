package com.baidubce.et.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.et.EtClient;
import com.baidubce.et.models.CreateDedicatedChannelBfdRequest;

public class ExampleCreateDedicatedChannelBfd {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        EtClient client = new EtClient(config);
        CreateDedicatedChannelBfdRequest createDedicatedChannelBfdRequest = new CreateDedicatedChannelBfdRequest();
        createDedicatedChannelBfdRequest.setEtId("");
        createDedicatedChannelBfdRequest.setEtChannelId("");
        createDedicatedChannelBfdRequest.setClientToken("");
        createDedicatedChannelBfdRequest.setSendInterval(0);
        createDedicatedChannelBfdRequest.setReceivInterval(0);
        createDedicatedChannelBfdRequest.setDetectMultiplier(0);
        try {
            client.createDedicatedChannelBfd(createDedicatedChannelBfdRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
