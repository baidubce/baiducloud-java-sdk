package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.UpdateAlarmTemplateRequest;
import com.baidubce.bcm.models.UpdateAlarmTemplateResponse;
import java.util.ArrayList;

public class ExampleUpdateAlarmTemplate {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BcmClient client = new BcmClient(bceClientConfig);
        UpdateAlarmTemplateRequest updateAlarmTemplateRequest = new UpdateAlarmTemplateRequest();
        updateAlarmTemplateRequest.setId("");
        updateAlarmTemplateRequest.setScope("");
        updateAlarmTemplateRequest.setResourceType("");
        updateAlarmTemplateRequest.setSubResourceType("");
        updateAlarmTemplateRequest.setName("");
        updateAlarmTemplateRequest.setComment("");
        updateAlarmTemplateRequest.setRules(new ArrayList<>());
        try {
            UpdateAlarmTemplateResponse response = client.updateAlarmTemplate(updateAlarmTemplateRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
