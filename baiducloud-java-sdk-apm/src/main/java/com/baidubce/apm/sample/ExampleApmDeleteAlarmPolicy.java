package com.baidubce.apm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.apm.ApmClient;
import com.baidubce.apm.models.ApmDeleteAlarmPolicyRequest;
import com.baidubce.apm.models.ApmDeleteAlarmPolicyResponse;
import java.util.ArrayList;

public class ExampleApmDeleteAlarmPolicy {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        ApmClient client = new ApmClient(config);
        ApmDeleteAlarmPolicyRequest apmDeleteAlarmPolicyRequest = new ApmDeleteAlarmPolicyRequest();
        apmDeleteAlarmPolicyRequest.setIds(new ArrayList<>());
        try {
            ApmDeleteAlarmPolicyResponse response = client.apmDeleteAlarmPolicy(apmDeleteAlarmPolicyRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
