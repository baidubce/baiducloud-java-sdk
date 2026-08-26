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
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

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
