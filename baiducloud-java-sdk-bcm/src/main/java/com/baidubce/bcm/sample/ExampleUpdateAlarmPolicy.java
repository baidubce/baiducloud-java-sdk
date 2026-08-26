package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.UpdateAlarmPolicyRequest;
import com.baidubce.bcm.models.AlarmTarget;
import com.baidubce.bcm.models.UpdateAlarmPolicyResponse;
import java.util.ArrayList;

public class ExampleUpdateAlarmPolicy {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BcmClient client = new BcmClient(bceClientConfig);
        AlarmTarget target = new AlarmTarget();
        target.setType("");
        target.setInstances(new ArrayList<>());
        target.setRegion("");
        target.setTags(new ArrayList<>());
        target.setInstanceGroups(new ArrayList<>());
        target.setIncludingDimensions(new ArrayList<>());
        target.setExcludingDimensions(new ArrayList<>());

        UpdateAlarmPolicyRequest updateAlarmPolicyRequest = new UpdateAlarmPolicyRequest();
        updateAlarmPolicyRequest.setId("");
        updateAlarmPolicyRequest.setState("");
        updateAlarmPolicyRequest.setName("");
        updateAlarmPolicyRequest.setScope("");
        updateAlarmPolicyRequest.setResourceType("");
        updateAlarmPolicyRequest.setTarget(target);
        updateAlarmPolicyRequest.setRules(new ArrayList<>());
        updateAlarmPolicyRequest.setPendingCount(0);
        updateAlarmPolicyRequest.setOnMissingData("");
        updateAlarmPolicyRequest.setNoDataNotifyPendingMinutes(0);
        updateAlarmPolicyRequest.setType("");
        updateAlarmPolicyRequest.setLevel("");
        updateAlarmPolicyRequest.setActions(new ArrayList<>());
        updateAlarmPolicyRequest.setNotifyEnabled(false);
        updateAlarmPolicyRequest.setCallbacks(new ArrayList<>());
        updateAlarmPolicyRequest.setRenotifyCount(0);
        updateAlarmPolicyRequest.setRenotifyIntervalMinutes(0);
        updateAlarmPolicyRequest.setNotifyMergeWindowSeconds(0);
        try {
            UpdateAlarmPolicyResponse response = client.updateAlarmPolicy(updateAlarmPolicyRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
