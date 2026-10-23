package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.CreateL3AccessGroupRequest;
import com.baidubce.pfs.models.CreateL3AccessGroupResponse;

public class ExampleCreateL3AccessGroup {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        CreateL3AccessGroupRequest createL3AccessGroupRequest = new CreateL3AccessGroupRequest();
        createL3AccessGroupRequest.setAccessGroupName("");
        createL3AccessGroupRequest.setZoneName("");
        createL3AccessGroupRequest.setDescription("");
        createL3AccessGroupRequest.setSourceZoneName("");
        createL3AccessGroupRequest.setSourceAccessGroupName("");
        try {
            CreateL3AccessGroupResponse response = client.createL3AccessGroup(createL3AccessGroupRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
