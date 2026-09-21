package com.baidubce.vdb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vdb.VdbClient;
import com.baidubce.vdb.models.CreateInstanceUsingPOSTRequest;
import com.baidubce.vdb.models.CreateInstanceUsingPOSTResponse;

public class ExampleCreateInstanceUsingPOST {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VdbClient client = new VdbClient(bceClientConfig);
        CreateInstanceUsingPOSTRequest createInstanceUsingPOSTRequest = new CreateInstanceUsingPOSTRequest();
        createInstanceUsingPOSTRequest.setEngineType("");
        try {
            CreateInstanceUsingPOSTResponse response = client.createInstanceUsingPOST(createInstanceUsingPOSTRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
