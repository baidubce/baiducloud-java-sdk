package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.UpdateL3AccessGroupRequest;
import com.baidubce.pfs.models.UpdateL3AccessGroupResponse;

public class ExampleUpdateL3AccessGroup {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        UpdateL3AccessGroupRequest updateL3AccessGroupRequest = new UpdateL3AccessGroupRequest();
        updateL3AccessGroupRequest.setAccessGroupName("");
        updateL3AccessGroupRequest.setZoneName("");
        updateL3AccessGroupRequest.setDescription("");
        try {
            UpdateL3AccessGroupResponse response = client.updateL3AccessGroup(updateL3AccessGroupRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
