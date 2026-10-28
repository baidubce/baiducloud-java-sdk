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
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

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
