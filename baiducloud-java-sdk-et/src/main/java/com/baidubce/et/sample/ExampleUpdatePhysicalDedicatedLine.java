package com.baidubce.et.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.et.EtClient;
import com.baidubce.et.models.UpdatePhysicalDedicatedLineRequest;

public class ExampleUpdatePhysicalDedicatedLine {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        EtClient client = new EtClient(config);
        UpdatePhysicalDedicatedLineRequest updatePhysicalDedicatedLineRequest = new UpdatePhysicalDedicatedLineRequest();
        updatePhysicalDedicatedLineRequest.setDcphyId("");
        updatePhysicalDedicatedLineRequest.setClientToken("");
        updatePhysicalDedicatedLineRequest.setName("");
        updatePhysicalDedicatedLineRequest.setDescription("");
        updatePhysicalDedicatedLineRequest.setUserName("");
        updatePhysicalDedicatedLineRequest.setUserPhone("");
        updatePhysicalDedicatedLineRequest.setUserEmail("");
        updatePhysicalDedicatedLineRequest.setLinkDelay(0);
        try {
            client.updatePhysicalDedicatedLine(updatePhysicalDedicatedLineRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
