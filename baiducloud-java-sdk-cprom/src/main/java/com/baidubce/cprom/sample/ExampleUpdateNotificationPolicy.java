package com.baidubce.cprom.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cprom.CpromClient;
import com.baidubce.cprom.models.UpdateNotificationPolicyRequest;
import com.baidubce.cprom.models.RepeatNotifyConfig;
import java.util.ArrayList;

public class ExampleUpdateNotificationPolicy {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        CpromClient client = new CpromClient(bceClientConfig);
        RepeatNotifyConfig repeatNotifyConfig = new RepeatNotifyConfig();
        repeatNotifyConfig.setEnabled(false);
        repeatNotifyConfig.setIntervalHour(0);
        repeatNotifyConfig.setIntervalMin(0);
        repeatNotifyConfig.setMaxCount(0);
        repeatNotifyConfig.setStrategy("");

        UpdateNotificationPolicyRequest updateNotificationPolicyRequest = new UpdateNotificationPolicyRequest();
        updateNotificationPolicyRequest.setNotifyRuleId("");
        updateNotificationPolicyRequest.setNotifyRuleName("");
        updateNotificationPolicyRequest.setStartTime("");
        updateNotificationPolicyRequest.setEndTime("");
        updateNotificationPolicyRequest.setChannel(new ArrayList<>());
        updateNotificationPolicyRequest.setReceiverType("");
        updateNotificationPolicyRequest.setUsers(new ArrayList<>());
        updateNotificationPolicyRequest.setUserGroups(new ArrayList<>());
        updateNotificationPolicyRequest.setWebhookConfigList(new ArrayList<>());
        updateNotificationPolicyRequest.setEscalateConfigList(new ArrayList<>());
        updateNotificationPolicyRequest.setRepeatNotifyConfig(repeatNotifyConfig);
        try {
            client.updateNotificationPolicy(updateNotificationPolicyRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
