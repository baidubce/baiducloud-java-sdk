package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.CreateAlarmMaskingRequest;
import com.baidubce.bcm.models.CreateAlarmMaskingResponse;
import java.util.ArrayList;

public class ExampleCreateAlarmMasking {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BcmClient client = new BcmClient(bceClientConfig);
        CreateAlarmMaskingRequest createAlarmMaskingRequest = new CreateAlarmMaskingRequest();
        createAlarmMaskingRequest.setName("");
        createAlarmMaskingRequest.setScope("");
        createAlarmMaskingRequest.setResourceType("");
        createAlarmMaskingRequest.setPolicyId("");
        createAlarmMaskingRequest.setInstances(new ArrayList<>());
        createAlarmMaskingRequest.setRegion("");
        createAlarmMaskingRequest.setMetricNames(new ArrayList<>());
        createAlarmMaskingRequest.setPeriodType("");
        createAlarmMaskingRequest.setBeginTime("");
        createAlarmMaskingRequest.setEndTime("");
        createAlarmMaskingRequest.setTz("");
        createAlarmMaskingRequest.setDailyBeginTimestamp(0);
        createAlarmMaskingRequest.setDailyEndTimestamp(0);
        try {
            CreateAlarmMaskingResponse response = client.createAlarmMasking(createAlarmMaskingRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
