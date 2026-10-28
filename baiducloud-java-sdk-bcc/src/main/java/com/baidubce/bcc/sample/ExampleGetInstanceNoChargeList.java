package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.GetInstanceNoChargeListRequest;
import com.baidubce.bcc.models.GetInstanceNoChargeListResponse;

public class ExampleGetInstanceNoChargeList {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        GetInstanceNoChargeListRequest getInstanceNoChargeListRequest = new GetInstanceNoChargeListRequest();
        getInstanceNoChargeListRequest.setMarker("");
        getInstanceNoChargeListRequest.setMaxKeys(0);
        getInstanceNoChargeListRequest.setInternalIp("");
        getInstanceNoChargeListRequest.setKeypairId("");
        getInstanceNoChargeListRequest.setZoneName("");
        getInstanceNoChargeListRequest.setInstanceIds("");
        try {
            GetInstanceNoChargeListResponse response = client.getInstanceNoChargeList(getInstanceNoChargeListRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
