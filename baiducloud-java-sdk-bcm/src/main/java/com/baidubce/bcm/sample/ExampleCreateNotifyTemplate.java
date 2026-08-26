package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.CreateNotifyTemplateRequest;
import com.baidubce.bcm.models.CreateNotifyTemplateResponse;
import java.util.ArrayList;

public class ExampleCreateNotifyTemplate {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BcmClient client = new BcmClient(bceClientConfig);
        CreateNotifyTemplateRequest createNotifyTemplateRequest = new CreateNotifyTemplateRequest();
        createNotifyTemplateRequest.setName("");
        createNotifyTemplateRequest.setSilencePeriods(new ArrayList<>());
        createNotifyTemplateRequest.setReceivers(new ArrayList<>());
        createNotifyTemplateRequest.setCallbacks(new ArrayList<>());
        try {
            CreateNotifyTemplateResponse response = client.createNotifyTemplate(createNotifyTemplateRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
