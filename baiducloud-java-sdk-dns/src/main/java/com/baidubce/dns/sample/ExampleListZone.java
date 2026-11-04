package com.baidubce.dns.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dns.DnsClient;
import com.baidubce.dns.models.ListZoneRequest;
import com.baidubce.dns.models.ListZoneResponse;

public class ExampleListZone {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DnsClient client = new DnsClient(bceClientConfig);
        ListZoneRequest listZoneRequest = new ListZoneRequest();
        listZoneRequest.setName("");
        listZoneRequest.setMarker("");
        listZoneRequest.setMaxKeys(0);
        try {
            ListZoneResponse response = client.listZone(listZoneRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
