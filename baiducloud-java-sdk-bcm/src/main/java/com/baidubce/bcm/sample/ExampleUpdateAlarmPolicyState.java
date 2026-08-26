package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.UpdateAlarmPolicyStateRequest;
import com.baidubce.bcm.models.UpdateAlarmPolicyStateResponse;
import java.util.ArrayList;

public class ExampleUpdateAlarmPolicyState {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BcmClient client = new BcmClient(bceClientConfig);
        UpdateAlarmPolicyStateRequest updateAlarmPolicyStateRequest = new UpdateAlarmPolicyStateRequest();
        updateAlarmPolicyStateRequest.setIds(new ArrayList<>());
        updateAlarmPolicyStateRequest.setState("");
        try {
            UpdateAlarmPolicyStateResponse response = client.updateAlarmPolicyState(updateAlarmPolicyStateRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
