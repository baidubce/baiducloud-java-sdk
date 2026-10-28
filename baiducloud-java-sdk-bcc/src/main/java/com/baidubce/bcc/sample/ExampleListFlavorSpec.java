package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.ListFlavorSpecRequest;
import com.baidubce.bcc.models.ListFlavorSpecResponse;

public class ExampleListFlavorSpec {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        ListFlavorSpecRequest listFlavorSpecRequest = new ListFlavorSpecRequest();
        listFlavorSpecRequest.setZoneName("");
        listFlavorSpecRequest.setSpecs("");
        listFlavorSpecRequest.setSpecIds("");
        try {
            ListFlavorSpecResponse response = client.listFlavorSpec(listFlavorSpecRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
