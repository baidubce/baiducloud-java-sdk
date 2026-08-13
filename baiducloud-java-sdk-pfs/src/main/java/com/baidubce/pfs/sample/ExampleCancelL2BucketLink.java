package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.CancelL2BucketLinkRequest;
import com.baidubce.pfs.models.CancelL2BucketLinkResponse;

public class ExampleCancelL2BucketLink {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        CancelL2BucketLinkRequest cancelL2BucketLinkRequest = new CancelL2BucketLinkRequest();
        cancelL2BucketLinkRequest.setBucketLinkId("");
        cancelL2BucketLinkRequest.setInstanceId("");
        try {
            CancelL2BucketLinkResponse response = client.cancelL2BucketLink(cancelL2BucketLinkRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
