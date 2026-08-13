package com.baidubce.cfw.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cfw.CfwClient;
import com.baidubce.cfw.models.ListProtectInstancesRequest;
import com.baidubce.cfw.models.ListProtectInstancesResponse;

public class ExampleListProtectInstances {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CfwClient client = new CfwClient(bceClientConfig);
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
