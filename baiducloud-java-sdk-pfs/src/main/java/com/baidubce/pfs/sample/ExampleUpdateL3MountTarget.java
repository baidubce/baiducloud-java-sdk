package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.UpdateL3MountTargetRequest;
import com.baidubce.pfs.models.UpdateL3MountTargetResponse;

public class ExampleUpdateL3MountTarget {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        UpdateL3MountTargetRequest updateL3MountTargetRequest = new UpdateL3MountTargetRequest();
        updateL3MountTargetRequest.setInstanceId("");
        updateL3MountTargetRequest.setMountTargetId("");
        updateL3MountTargetRequest.setAdmissionStatus(0);
        updateL3MountTargetRequest.setName("");
        updateL3MountTargetRequest.setAccessGroupName("");
        try {
            UpdateL3MountTargetResponse response = client.updateL3MountTarget(updateL3MountTargetRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
