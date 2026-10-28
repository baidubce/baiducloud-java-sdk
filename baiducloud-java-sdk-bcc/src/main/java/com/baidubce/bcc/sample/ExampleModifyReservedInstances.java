package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.ModifyReservedInstancesRequest;
import com.baidubce.bcc.models.ModifyReservedInstancesResponse;
import java.util.ArrayList;

public class ExampleModifyReservedInstances {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        ModifyReservedInstancesRequest modifyReservedInstancesRequest = new ModifyReservedInstancesRequest();
        modifyReservedInstancesRequest.setReservedInstances(new ArrayList<>());
        try {
            ModifyReservedInstancesResponse response = client.modifyReservedInstances(modifyReservedInstancesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
