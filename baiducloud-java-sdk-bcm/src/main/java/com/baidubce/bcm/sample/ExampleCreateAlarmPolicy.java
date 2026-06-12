package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.CreateAlarmPolicyRequest;
import com.baidubce.bcm.models.AlarmTarget;
import com.baidubce.bcm.models.CreateAlarmPolicyResponse;
import java.util.ArrayList;

public class ExampleCreateAlarmPolicy {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BcmClient client = new BcmClient(bceClientConfig);
        AlarmTarget target = new AlarmTarget();
        target.setType("");
        target.setInstances(new ArrayList<>());
        target.setRegion("");
        target.setTags(new ArrayList<>());
        target.setInstanceGroups(new ArrayList<>());
        target.setIncludingDimensions(new ArrayList<>());
        target.setExcludingDimensions(new ArrayList<>());

        CreateAlarmPolicyRequest createAlarmPolicyRequest = new CreateAlarmPolicyRequest();
        createAlarmPolicyRequest.setName("");
        createAlarmPolicyRequest.setScope("");
        createAlarmPolicyRequest.setResourceType("");
        createAlarmPolicyRequest.setTarget(target);
        createAlarmPolicyRequest.setRules(new ArrayList<>());
        createAlarmPolicyRequest.setPendingCount(0);
        createAlarmPolicyRequest.setOnMissingData("");
        createAlarmPolicyRequest.setNoDataNotifyPendingMinutes(0);
        createAlarmPolicyRequest.setType("");
        createAlarmPolicyRequest.setLevel("");
        createAlarmPolicyRequest.setActions(new ArrayList<>());
        createAlarmPolicyRequest.setNotifyEnabled(false);
        createAlarmPolicyRequest.setCallbacks(new ArrayList<>());
        createAlarmPolicyRequest.setRenotifyCount(0);
        createAlarmPolicyRequest.setRenotifyIntervalMinutes(0);
        createAlarmPolicyRequest.setNotifyMergeWindowSeconds(0);
        try {
            CreateAlarmPolicyResponse response = client.createAlarmPolicy(createAlarmPolicyRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
