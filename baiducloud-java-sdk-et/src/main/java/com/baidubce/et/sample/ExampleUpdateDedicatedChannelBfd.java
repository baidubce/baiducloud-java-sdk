package com.baidubce.et.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.et.EtClient;
import com.baidubce.et.models.UpdateDedicatedChannelBfdRequest;

public class ExampleUpdateDedicatedChannelBfd {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        EtClient client = new EtClient(config);
        UpdateDedicatedChannelBfdRequest updateDedicatedChannelBfdRequest = new UpdateDedicatedChannelBfdRequest();
        updateDedicatedChannelBfdRequest.setEtId("");
        updateDedicatedChannelBfdRequest.setEtChannelId("");
        updateDedicatedChannelBfdRequest.setClientToken("");
        updateDedicatedChannelBfdRequest.setSendInterval(0);
        updateDedicatedChannelBfdRequest.setReceivInterval(0);
        updateDedicatedChannelBfdRequest.setDetectMultiplier(0);
        try {
            client.updateDedicatedChannelBfd(updateDedicatedChannelBfdRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
