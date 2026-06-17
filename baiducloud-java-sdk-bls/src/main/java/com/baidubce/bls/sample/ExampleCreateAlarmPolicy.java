package com.baidubce.bls.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bls.BlsClient;
import com.baidubce.bls.models.CreateAlarmPolicyRequest;
import com.baidubce.bls.models.Schedule;
import com.baidubce.bls.models.CreateAlarmPolicyResponse;
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
        BlsClient client = new BlsClient(bceClientConfig);
        Schedule schedule = new Schedule();
        schedule.setIntervalMinute(0);
        schedule.setFixTimeMinute(0);
        schedule.setDayOfWeek(0);

        CreateAlarmPolicyRequest createAlarmPolicyRequest = new CreateAlarmPolicyRequest();
        createAlarmPolicyRequest.setName("");
        createAlarmPolicyRequest.setObjects(new ArrayList<>());
        createAlarmPolicyRequest.setTargets(new ArrayList<>());
        createAlarmPolicyRequest.setTriggerConditions(new ArrayList<>());
        createAlarmPolicyRequest.setGroups(new ArrayList<>());
        createAlarmPolicyRequest.setSchedule(schedule);
        createAlarmPolicyRequest.setPendingCount(0);
        createAlarmPolicyRequest.setRepeatIntervalMinute(0);
        createAlarmPolicyRequest.setRecoverWithoutNotice(false);
        createAlarmPolicyRequest.setState("");
        createAlarmPolicyRequest.setNoticeState("");
        createAlarmPolicyRequest.setNotices(new ArrayList<>());
        createAlarmPolicyRequest.setNoticeRawLogs(new ArrayList<>());
        try {
            CreateAlarmPolicyResponse response = client.createAlarmPolicy(createAlarmPolicyRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
