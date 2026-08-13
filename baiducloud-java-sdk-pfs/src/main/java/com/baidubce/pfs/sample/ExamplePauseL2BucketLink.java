package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.PauseL2BucketLinkRequest;
import com.baidubce.pfs.models.PauseL2BucketLinkResponse;

public class ExamplePauseL2BucketLink {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        PauseL2BucketLinkRequest pauseL2BucketLinkRequest = new PauseL2BucketLinkRequest();
        pauseL2BucketLinkRequest.setInstanceId("");
        pauseL2BucketLinkRequest.setBucketLinkId("");
        try {
            PauseL2BucketLinkResponse response = client.pauseL2BucketLink(pauseL2BucketLinkRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
