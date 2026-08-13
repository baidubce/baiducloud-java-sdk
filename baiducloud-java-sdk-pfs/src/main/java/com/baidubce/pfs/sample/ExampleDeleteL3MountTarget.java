package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.DeleteL3MountTargetRequest;
import com.baidubce.pfs.models.DeleteL3MountTargetResponse;

public class ExampleDeleteL3MountTarget {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        DeleteL3MountTargetRequest deleteL3MountTargetRequest = new DeleteL3MountTargetRequest();
        deleteL3MountTargetRequest.setInstanceId("");
        deleteL3MountTargetRequest.setMountTargetId("");
        try {
            DeleteL3MountTargetResponse response = client.deleteL3MountTarget(deleteL3MountTargetRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
