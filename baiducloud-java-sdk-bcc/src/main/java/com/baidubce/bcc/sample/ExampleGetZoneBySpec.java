package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.GetZoneBySpecRequest;
import com.baidubce.bcc.models.GetZoneBySpecResponse;

public class ExampleGetZoneBySpec {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        GetZoneBySpecRequest getZoneBySpecRequest = new GetZoneBySpecRequest();
        getZoneBySpecRequest.setInstanceType("");
        getZoneBySpecRequest.setProductType("");
        getZoneBySpecRequest.setSpec("");
        getZoneBySpecRequest.setSpecId("");
        try {
            GetZoneBySpecResponse response = client.getZoneBySpec(getZoneBySpecRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
