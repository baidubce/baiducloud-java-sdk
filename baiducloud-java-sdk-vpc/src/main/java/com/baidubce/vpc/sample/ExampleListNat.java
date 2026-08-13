package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.ListNatRequest;
import com.baidubce.vpc.models.ListNatResponse;

public class ExampleListNat {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        ListNatRequest listNatRequest = new ListNatRequest();
        listNatRequest.setVpcId("");
        listNatRequest.setNatId("");
        listNatRequest.setName("");
        listNatRequest.setIp("");
        listNatRequest.setMarker("");
        listNatRequest.setMaxKeys(0);
        try {
            ListNatResponse response = client.listNat(listNatRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
