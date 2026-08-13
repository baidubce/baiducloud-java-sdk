package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.DescL2PolicyRequest;
import com.baidubce.pfs.models.DescL2PolicyResponse;

public class ExampleDescL2Policy {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        DescL2PolicyRequest descL2PolicyRequest = new DescL2PolicyRequest();
        descL2PolicyRequest.setInstanceId("");
        descL2PolicyRequest.setPolicyId("");
        try {
            DescL2PolicyResponse response = client.descL2Policy(descL2PolicyRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
