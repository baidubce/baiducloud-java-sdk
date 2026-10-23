package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.DeleteL3AccessGroupRequest;
import com.baidubce.pfs.models.DeleteL3AccessGroupResponse;

public class ExampleDeleteL3AccessGroup {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        DeleteL3AccessGroupRequest deleteL3AccessGroupRequest = new DeleteL3AccessGroupRequest();
        deleteL3AccessGroupRequest.setAccessGroupName("");
        deleteL3AccessGroupRequest.setZoneName("");
        try {
            DeleteL3AccessGroupResponse response = client.deleteL3AccessGroup(deleteL3AccessGroupRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
