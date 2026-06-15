package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.ChangeToPrepaidRequest;
import com.baidubce.bcc.models.ChangeToPrepaidResponse;

public class ExampleChangeToPrepaid {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BccClient client = new BccClient(bceClientConfig);
        ChangeToPrepaidRequest changeToPrepaidRequest = new ChangeToPrepaidRequest();
        changeToPrepaidRequest.setInstanceId("");
        changeToPrepaidRequest.setDuration(0);
        changeToPrepaidRequest.setAutoRenew(false);
        changeToPrepaidRequest.setAutoRenewPeriod(0);
        changeToPrepaidRequest.setRelationCds(false);
        try {
            ChangeToPrepaidResponse response = client.changeToPrepaid(changeToPrepaidRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
