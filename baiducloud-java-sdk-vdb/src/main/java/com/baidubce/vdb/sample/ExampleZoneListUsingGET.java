package com.baidubce.vdb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vdb.VdbClient;
import com.baidubce.vdb.models.ZoneListUsingGETRequest;
import com.baidubce.vdb.models.ZoneListUsingGETResponse;

public class ExampleZoneListUsingGET {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VdbClient client = new VdbClient(bceClientConfig);
        ZoneListUsingGETRequest zoneListUsingGETRequest = new ZoneListUsingGETRequest();
        zoneListUsingGETRequest.setFrom("");
        zoneListUsingGETRequest.setEngineType("");
        try {
            ZoneListUsingGETResponse response = client.zoneListUsingGET(zoneListUsingGETRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
