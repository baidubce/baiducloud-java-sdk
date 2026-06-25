package com.baidubce.cprom.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cprom.CpromClient;
import com.baidubce.cprom.models.CreateNotificationPolicyRequest;
import com.baidubce.cprom.models.CreateNotificationPolicyResponse;
import com.baidubce.cprom.models.RepeatNotifyConfig;
import java.util.ArrayList;

public class ExampleCreateNotificationPolicy {
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

        CreateNotificationPolicyRequest createNotificationPolicyRequest = new CreateNotificationPolicyRequest();
        createNotificationPolicyRequest.setNotifyRuleName("");
        createNotificationPolicyRequest.setStartTime("");
        createNotificationPolicyRequest.setEndTime("");
        createNotificationPolicyRequest.setChannel(new ArrayList<>());
        createNotificationPolicyRequest.setReceiverType("");
        createNotificationPolicyRequest.setUsers(new ArrayList<>());
        createNotificationPolicyRequest.setUserGroups(new ArrayList<>());
        createNotificationPolicyRequest.setWebhookConfigList(new ArrayList<>());
        createNotificationPolicyRequest.setEscalateConfigList(new ArrayList<>());
        createNotificationPolicyRequest.setRepeatNotifyConfig(repeatNotifyConfig);
        try {
            CreateNotificationPolicyResponse response = client.createNotificationPolicy(createNotificationPolicyRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
