package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.InstanceListClientsRequest;
import com.baidubce.pfs.models.InstanceListClientsResponse;

public class ExampleInstanceListClients {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        InstanceListClientsRequest instanceListClientsRequest = new InstanceListClientsRequest();
        instanceListClientsRequest.setInstanceId("");
        instanceListClientsRequest.setMaxKeys(0);
        instanceListClientsRequest.setManner("");
        instanceListClientsRequest.setMarker("");
        try {
            InstanceListClientsResponse response = client.instanceListClients(instanceListClientsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
