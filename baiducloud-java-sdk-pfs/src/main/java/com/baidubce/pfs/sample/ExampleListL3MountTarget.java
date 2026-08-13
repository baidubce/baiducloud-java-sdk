package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.ListL3MountTargetRequest;
import com.baidubce.pfs.models.ListL3MountTargetResponse;

public class ExampleListL3MountTarget {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        ListL3MountTargetRequest listL3MountTargetRequest = new ListL3MountTargetRequest();
        listL3MountTargetRequest.setInstanceId("");
        listL3MountTargetRequest.setMaxKeys(0);
        listL3MountTargetRequest.setMarker("");
        try {
            ListL3MountTargetResponse response = client.listL3MountTarget(listL3MountTargetRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
