package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.UpdateAlarmMaskingStatesRequest;
import com.baidubce.bcm.models.UpdateAlarmMaskingStatesResponse;
import java.util.ArrayList;

public class ExampleUpdateAlarmMaskingStates {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BcmClient client = new BcmClient(bceClientConfig);
        UpdateAlarmMaskingStatesRequest updateAlarmMaskingStatesRequest = new UpdateAlarmMaskingStatesRequest();
        updateAlarmMaskingStatesRequest.setIds(new ArrayList<>());
        updateAlarmMaskingStatesRequest.setState("");
        try {
            UpdateAlarmMaskingStatesResponse response = client.updateAlarmMaskingStates(updateAlarmMaskingStatesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
