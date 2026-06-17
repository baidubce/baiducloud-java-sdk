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
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
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
