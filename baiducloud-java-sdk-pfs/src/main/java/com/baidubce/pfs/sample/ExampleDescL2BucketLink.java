package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.DescL2BucketLinkRequest;
import com.baidubce.pfs.models.DescL2BucketLinkResponse;

public class ExampleDescL2BucketLink {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        DescL2BucketLinkRequest descL2BucketLinkRequest = new DescL2BucketLinkRequest();
        descL2BucketLinkRequest.setInstanceId("");
        descL2BucketLinkRequest.setBucketLinkId("");
        try {
            DescL2BucketLinkResponse response = client.descL2BucketLink(descL2BucketLinkRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
