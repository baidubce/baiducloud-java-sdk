package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DeleteAlarmTemplatesRequest;
import com.baidubce.bcm.models.DeleteAlarmTemplatesResponse;
import java.util.ArrayList;

public class ExampleDeleteAlarmTemplates {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BcmClient client = new BcmClient(bceClientConfig);
        DeleteAlarmTemplatesRequest deleteAlarmTemplatesRequest = new DeleteAlarmTemplatesRequest();
        deleteAlarmTemplatesRequest.setIds(new ArrayList<>());
        try {
            DeleteAlarmTemplatesResponse response = client.deleteAlarmTemplates(deleteAlarmTemplatesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
