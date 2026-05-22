package com.baidubce.cfw.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cfw.CfwClient;
import com.baidubce.cfw.models.ListProtectInstancesRequest;
import com.baidubce.cfw.models.ListProtectInstancesResponse;

public class ExampleListProtectInstances {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        CfwClient client = new CfwClient(config);
        ListProtectInstancesRequest listProtectInstancesRequest = new ListProtectInstancesRequest();
        listProtectInstancesRequest.setInstanceType("");
        listProtectInstancesRequest.setMarker("");
        listProtectInstancesRequest.setMaxKeys(0);
        listProtectInstancesRequest.setStatus("");
        listProtectInstancesRequest.setRegion("");
        try {
            ListProtectInstancesResponse response = client.listProtectInstances(listProtectInstancesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
