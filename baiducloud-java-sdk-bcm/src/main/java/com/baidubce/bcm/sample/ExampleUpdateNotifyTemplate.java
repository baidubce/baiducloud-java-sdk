package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.UpdateNotifyTemplateRequest;
import com.baidubce.bcm.models.UpdateNotifyTemplateResponse;
import java.util.ArrayList;

public class ExampleUpdateNotifyTemplate {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BcmClient client = new BcmClient(bceClientConfig);
        UpdateNotifyTemplateRequest updateNotifyTemplateRequest = new UpdateNotifyTemplateRequest();
        updateNotifyTemplateRequest.setId("");
        updateNotifyTemplateRequest.setName("");
        updateNotifyTemplateRequest.setSilencePeriods(new ArrayList<>());
        updateNotifyTemplateRequest.setReceivers(new ArrayList<>());
        updateNotifyTemplateRequest.setCallbacks(new ArrayList<>());
        try {
            UpdateNotifyTemplateResponse response = client.updateNotifyTemplate(updateNotifyTemplateRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
