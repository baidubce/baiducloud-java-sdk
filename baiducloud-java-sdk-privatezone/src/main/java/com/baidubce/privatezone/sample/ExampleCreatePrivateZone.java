package com.baidubce.privatezone.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.privatezone.PrivatezoneClient;
import com.baidubce.privatezone.models.CreatePrivateZoneRequest;
import com.baidubce.privatezone.models.CreatePrivateZoneResponse;

public class ExampleCreatePrivateZone {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PrivatezoneClient client = new PrivatezoneClient(bceClientConfig);
        CreatePrivateZoneRequest createPrivateZoneRequest = new CreatePrivateZoneRequest();
        createPrivateZoneRequest.setClientToken("");
        createPrivateZoneRequest.setZoneName("");
        try {
            CreatePrivateZoneResponse response = client.createPrivateZone(createPrivateZoneRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
