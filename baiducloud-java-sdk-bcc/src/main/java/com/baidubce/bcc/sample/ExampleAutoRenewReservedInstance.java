package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.AutoRenewReservedInstanceRequest;
import com.baidubce.bcc.models.AutoRenewReservedInstanceResponse;
import java.util.ArrayList;

public class ExampleAutoRenewReservedInstance {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        AutoRenewReservedInstanceRequest autoRenewReservedInstanceRequest = new AutoRenewReservedInstanceRequest();
        autoRenewReservedInstanceRequest.setReservedInstanceIds(new ArrayList<>());
        autoRenewReservedInstanceRequest.setAutoRenewTimeUnit("");
        autoRenewReservedInstanceRequest.setAutoRenewTime(0);
        try {
            AutoRenewReservedInstanceResponse response = client.autoRenewReservedInstance(autoRenewReservedInstanceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
