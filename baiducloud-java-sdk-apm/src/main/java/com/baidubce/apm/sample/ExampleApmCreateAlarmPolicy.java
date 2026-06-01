package com.baidubce.apm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.apm.ApmClient;
import com.baidubce.apm.models.ApmCreateAlarmPolicyRequest;
import com.baidubce.apm.models.ApmCreateAlarmPolicyResponse;
import com.baidubce.apm.models.AlarmRule;
import com.baidubce.apm.models.AlarmTarget;
import com.baidubce.apm.models.Tag;
import java.util.ArrayList;

public class ExampleApmCreateAlarmPolicy {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        ApmClient client = new ApmClient(config);
        AlarmTarget target = new AlarmTarget();
        target.setType("");
        target.setTags(java.util.Arrays.asList(new Tag()));
        target.setServices(java.util.Arrays.asList(""));

        AlarmRule rule = new AlarmRule();
        rule.setOperator("");
        rule.setRules(java.util.Arrays.asList(new AlarmRule()));
        rule.setMetric("");
        rule.setWindowInSeconds(0);
        rule.setAggregate("");
        rule.setDisplayValue(0.0f);
        rule.setDisplayUnit("");

        ApmCreateAlarmPolicyRequest apmCreateAlarmPolicyRequest = new ApmCreateAlarmPolicyRequest();
        apmCreateAlarmPolicyRequest.setName("");
        apmCreateAlarmPolicyRequest.setState("");
        apmCreateAlarmPolicyRequest.setTarget(target);
        apmCreateAlarmPolicyRequest.setMetricKind("");
        apmCreateAlarmPolicyRequest.setRule(rule);
        apmCreateAlarmPolicyRequest.setFilters(new ArrayList<>());
        apmCreateAlarmPolicyRequest.setPendingCount(0);
        apmCreateAlarmPolicyRequest.setRenotifyIntervalInMinutes(0);
        apmCreateAlarmPolicyRequest.setRenotifyCount(0);
        apmCreateAlarmPolicyRequest.setNotifyRecovery(false);
        apmCreateAlarmPolicyRequest.setOnMissingData("");
        apmCreateAlarmPolicyRequest.setNoDataNotifyPendingIntervalInMinutes(0);
        apmCreateAlarmPolicyRequest.setLevel("");
        apmCreateAlarmPolicyRequest.setActions(new ArrayList<>());
        try {
            ApmCreateAlarmPolicyResponse response = client.apmCreateAlarmPolicy(apmCreateAlarmPolicyRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
