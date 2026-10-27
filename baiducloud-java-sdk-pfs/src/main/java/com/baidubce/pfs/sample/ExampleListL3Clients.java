package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.ListL3ClientsRequest;
import com.baidubce.pfs.models.ListL3ClientsResponse;

public class ExampleListL3Clients {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        ListL3ClientsRequest listL3ClientsRequest = new ListL3ClientsRequest();
        listL3ClientsRequest.setInstanceId("");
        listL3ClientsRequest.setMarker("");
        listL3ClientsRequest.setMaxKeys(0);
        try {
            ListL3ClientsResponse response = client.listL3Clients(listL3ClientsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
