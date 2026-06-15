package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.CreateAlarmTemplateRequest;
import com.baidubce.bcm.models.CreateAlarmTemplateResponse;
import java.util.ArrayList;

public class ExampleCreateAlarmTemplate {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BcmClient client = new BcmClient(bceClientConfig);
        CreateAlarmTemplateRequest createAlarmTemplateRequest = new CreateAlarmTemplateRequest();
        createAlarmTemplateRequest.setScope("");
        createAlarmTemplateRequest.setResourceType("");
        createAlarmTemplateRequest.setSubResourceType("");
        createAlarmTemplateRequest.setName("");
        createAlarmTemplateRequest.setComment("");
        createAlarmTemplateRequest.setRules(new ArrayList<>());
        try {
            CreateAlarmTemplateResponse response = client.createAlarmTemplate(createAlarmTemplateRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
