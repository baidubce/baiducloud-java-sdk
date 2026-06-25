package com.baidubce.cprom.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cprom.CpromClient;
import com.baidubce.cprom.models.UpdateAlertRequest;
import java.util.HashMap;

public class ExampleUpdateAlert {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        CpromClient client = new CpromClient(bceClientConfig);
        UpdateAlertRequest updateAlertRequest = new UpdateAlertRequest();
        updateAlertRequest.setAlertingRuleId("");
        updateAlertRequest.setInstanceId("");
        updateAlertRequest.setAlertName("");
        updateAlertRequest.setExpr("");
        updateAlertRequest.setCpromFor("");
        updateAlertRequest.setDescription("");
        updateAlertRequest.setNotifyRuleId("");
        updateAlertRequest.setSeverity("");
        updateAlertRequest.setEnable(false);
        updateAlertRequest.setLabels(new HashMap<>());
        updateAlertRequest.setAnnotations(new HashMap<>());
        try {
            client.updateAlert(updateAlertRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
