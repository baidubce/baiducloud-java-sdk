package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.GetReservedInstanceRequest;
import com.baidubce.bcc.models.GetReservedInstanceResponse;
import java.util.ArrayList;

public class ExampleGetReservedInstance {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BccClient client = new BccClient(bceClientConfig);
        GetReservedInstanceRequest getReservedInstanceRequest = new GetReservedInstanceRequest();
        getReservedInstanceRequest.setMarker("");
        getReservedInstanceRequest.setMaxKeys(0);
        getReservedInstanceRequest.setReservedInstanceIds(new ArrayList<>());
        getReservedInstanceRequest.setReservedInstanceName("");
        getReservedInstanceRequest.setZoneName("");
        getReservedInstanceRequest.setReservedInstanceStatus("");
        getReservedInstanceRequest.setSpec("");
        getReservedInstanceRequest.setOfferingType("");
        getReservedInstanceRequest.setOsType("");
        getReservedInstanceRequest.setInstanceId("");
        getReservedInstanceRequest.setInstanceName("");
        getReservedInstanceRequest.setIsDeduct(false);
        getReservedInstanceRequest.setEhcClusterId("");
        getReservedInstanceRequest.setSortKey("");
        getReservedInstanceRequest.setSortDir("");
        getReservedInstanceRequest.setReservedInstanceSource("");
        getReservedInstanceRequest.setScope("");
        try {
            GetReservedInstanceResponse response = client.getReservedInstance(getReservedInstanceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
