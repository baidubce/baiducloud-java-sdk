package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.CreatePfsRequest;
import com.baidubce.pfs.models.CreatePfsResponse;
import java.util.ArrayList;

public class ExampleCreatePfs {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        CreatePfsRequest createPfsRequest = new CreatePfsRequest();
        createPfsRequest.setName("");
        createPfsRequest.setInstanceType("");
        createPfsRequest.setCapacity(0);
        createPfsRequest.setZone("");
        createPfsRequest.setSubnetId("");
        createPfsRequest.setDescription("");
        createPfsRequest.setTags(new ArrayList<>());
        try {
            CreatePfsResponse response = client.createPfs(createPfsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
