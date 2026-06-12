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
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
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
