package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.CreateReservedInstancesRequest;
import com.baidubce.bcc.models.CreateReservedInstancesResponse;
import java.util.ArrayList;

public class ExampleCreateReservedInstances {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BccClient client = new BccClient(bceClientConfig);
        CreateReservedInstancesRequest createReservedInstancesRequest = new CreateReservedInstancesRequest();
        createReservedInstancesRequest.setReservedInstanceName("");
        createReservedInstancesRequest.setScope("");
        createReservedInstancesRequest.setZoneName("");
        createReservedInstancesRequest.setSpec("");
        createReservedInstancesRequest.setOfferingType("");
        createReservedInstancesRequest.setInstanceCount(0);
        createReservedInstancesRequest.setReservedInstanceCount(0);
        createReservedInstancesRequest.setReservedInstanceTime(0);
        createReservedInstancesRequest.setReservedInstanceTimeUnit("");
        createReservedInstancesRequest.setAutoRenew(false);
        createReservedInstancesRequest.setAutoRenewTimeUnit("");
        createReservedInstancesRequest.setAutoRenewTime(0);
        createReservedInstancesRequest.setEffectiveTime("");
        createReservedInstancesRequest.setTags(new ArrayList<>());
        createReservedInstancesRequest.setTicketId("");
        createReservedInstancesRequest.setEhcClusterId("");
        try {
            CreateReservedInstancesResponse response = client.createReservedInstances(createReservedInstancesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
