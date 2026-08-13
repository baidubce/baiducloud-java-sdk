package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.DeleteFilesetRequest;
import com.baidubce.pfs.models.DeleteFilesetResponse;

public class ExampleDeleteFileset {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        DeleteFilesetRequest deleteFilesetRequest = new DeleteFilesetRequest();
        deleteFilesetRequest.setInstanceId("");
        deleteFilesetRequest.setFilesetId("");
        try {
            DeleteFilesetResponse response = client.deleteFileset(deleteFilesetRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
