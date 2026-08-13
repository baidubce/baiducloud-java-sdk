package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.ListPeerConnRequest;
import com.baidubce.vpc.models.ListPeerConnResponse;

public class ExampleListPeerConn {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        ListPeerConnRequest listPeerConnRequest = new ListPeerConnRequest();
        listPeerConnRequest.setVpcId("");
        listPeerConnRequest.setMarker("");
        listPeerConnRequest.setMaxKeys(0);
        try {
            ListPeerConnResponse response = client.listPeerConn(listPeerConnRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
