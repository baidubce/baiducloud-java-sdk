package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.UpdateFilesetRequest;
import com.baidubce.pfs.models.UpdateFilesetResponse;

public class ExampleUpdateFileset {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        UpdateFilesetRequest updateFilesetRequest = new UpdateFilesetRequest();
        updateFilesetRequest.setInstanceId("");
        updateFilesetRequest.setFilesetId("");
        updateFilesetRequest.setFilesetName("");
        updateFilesetRequest.setBlockQuota(0);
        updateFilesetRequest.setFilesQuota(0L);
        updateFilesetRequest.setQpsLimit(0);
        updateFilesetRequest.setBandwidthLimitMb(0);
        try {
            UpdateFilesetResponse response = client.updateFileset(updateFilesetRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
