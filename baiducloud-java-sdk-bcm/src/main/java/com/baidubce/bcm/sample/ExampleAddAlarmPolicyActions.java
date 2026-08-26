package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.AddAlarmPolicyActionsRequest;
import com.baidubce.bcm.models.AddAlarmPolicyActionsResponse;
import java.util.ArrayList;

public class ExampleAddAlarmPolicyActions {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BcmClient client = new BcmClient(bceClientConfig);
        AddAlarmPolicyActionsRequest addAlarmPolicyActionsRequest = new AddAlarmPolicyActionsRequest();
        addAlarmPolicyActionsRequest.setId("");
        addAlarmPolicyActionsRequest.setActions(new ArrayList<>());
        try {
            AddAlarmPolicyActionsResponse response = client.addAlarmPolicyActions(addAlarmPolicyActionsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
