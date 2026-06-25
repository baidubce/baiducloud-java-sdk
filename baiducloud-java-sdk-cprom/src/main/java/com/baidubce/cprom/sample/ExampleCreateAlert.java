package com.baidubce.cprom.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cprom.CpromClient;
import com.baidubce.cprom.models.CreateAlertRequest;
import com.baidubce.cprom.models.CreateAlertResponse;
import java.util.HashMap;

public class ExampleCreateAlert {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        CpromClient client = new CpromClient(bceClientConfig);
        CreateAlertRequest createAlertRequest = new CreateAlertRequest();
        createAlertRequest.setInstanceId("");
        createAlertRequest.setAlertName("");
        createAlertRequest.setExpr("");
        createAlertRequest.setCpromFor("");
        createAlertRequest.setDescription("");
        createAlertRequest.setNotifyRuleId("");
        createAlertRequest.setEnable(false);
        createAlertRequest.setSeverity("");
        createAlertRequest.setLabels(new HashMap<>());
        createAlertRequest.setAnnotations(new HashMap<>());
        try {
            CreateAlertResponse response = client.createAlert(createAlertRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
