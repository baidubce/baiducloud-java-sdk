package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.RenewReservedInstanceRequest;
import com.baidubce.bcc.models.RenewReservedInstanceResponse;
import java.util.ArrayList;

public class ExampleRenewReservedInstance {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BccClient client = new BccClient(bceClientConfig);
        RenewReservedInstanceRequest renewReservedInstanceRequest = new RenewReservedInstanceRequest();
        renewReservedInstanceRequest.setReservedInstanceIds(new ArrayList<>());
        renewReservedInstanceRequest.setReservedInstanceTime("");
        renewReservedInstanceRequest.setReservedInstanceTimeUnit("");
        renewReservedInstanceRequest.setAutoRenew(false);
        renewReservedInstanceRequest.setAutoRenewTimeUnit("");
        renewReservedInstanceRequest.setAutoRenewTime(0);
        try {
            RenewReservedInstanceResponse response = client.renewReservedInstance(renewReservedInstanceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
