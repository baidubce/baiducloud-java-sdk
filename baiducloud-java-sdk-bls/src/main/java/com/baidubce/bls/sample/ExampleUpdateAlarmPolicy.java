package com.baidubce.bls.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bls.BlsClient;
import com.baidubce.bls.models.UpdateAlarmPolicyRequest;
import com.baidubce.bls.models.Schedule;
import com.baidubce.bls.models.UpdateAlarmPolicyResponse;
import java.util.ArrayList;

public class ExampleUpdateAlarmPolicy {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BlsClient client = new BlsClient(bceClientConfig);
        Schedule schedule = new Schedule();
        schedule.setIntervalMinute(0);
        schedule.setFixTimeMinute(0);
        schedule.setDayOfWeek(0);

        UpdateAlarmPolicyRequest updateAlarmPolicyRequest = new UpdateAlarmPolicyRequest();
        updateAlarmPolicyRequest.setName("");
        updateAlarmPolicyRequest.setObjects(new ArrayList<>());
        updateAlarmPolicyRequest.setTargets(new ArrayList<>());
        updateAlarmPolicyRequest.setTriggerConditions(new ArrayList<>());
        updateAlarmPolicyRequest.setGroups(new ArrayList<>());
        updateAlarmPolicyRequest.setSchedule(schedule);
        updateAlarmPolicyRequest.setPendingCount(0);
        updateAlarmPolicyRequest.setRepeatIntervalMinute(0);
        updateAlarmPolicyRequest.setRecoverWithoutNotice(false);
        updateAlarmPolicyRequest.setState("");
        updateAlarmPolicyRequest.setNoticeState("");
        updateAlarmPolicyRequest.setNotices(new ArrayList<>());
        updateAlarmPolicyRequest.setNoticeRawLogs(new ArrayList<>());
        try {
            UpdateAlarmPolicyResponse response = client.updateAlarmPolicy(updateAlarmPolicyRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
