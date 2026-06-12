package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.UpdateAlarmMaskingRequest;
import com.baidubce.bcm.models.UpdateAlarmMaskingResponse;
import java.util.ArrayList;

public class ExampleUpdateAlarmMasking {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BcmClient client = new BcmClient(bceClientConfig);
        UpdateAlarmMaskingRequest updateAlarmMaskingRequest = new UpdateAlarmMaskingRequest();
        updateAlarmMaskingRequest.setId("");
        updateAlarmMaskingRequest.setState("");
        updateAlarmMaskingRequest.setName("");
        updateAlarmMaskingRequest.setScope("");
        updateAlarmMaskingRequest.setResourceType("");
        updateAlarmMaskingRequest.setPolicyId("");
        updateAlarmMaskingRequest.setInstances(new ArrayList<>());
        updateAlarmMaskingRequest.setRegion("");
        updateAlarmMaskingRequest.setMetricNames(new ArrayList<>());
        updateAlarmMaskingRequest.setPeriodType("");
        updateAlarmMaskingRequest.setBeginTime("");
        updateAlarmMaskingRequest.setEndTime("");
        updateAlarmMaskingRequest.setTz("");
        updateAlarmMaskingRequest.setDailyBeginTimestamp(0);
        updateAlarmMaskingRequest.setDailyEndTimestamp(0);
        try {
            UpdateAlarmMaskingResponse response = client.updateAlarmMasking(updateAlarmMaskingRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
