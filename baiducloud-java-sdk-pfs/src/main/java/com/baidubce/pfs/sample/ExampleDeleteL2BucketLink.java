package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.DeleteL2BucketLinkRequest;
import com.baidubce.pfs.models.DeleteL2BucketLinkResponse;

public class ExampleDeleteL2BucketLink {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        DeleteL2BucketLinkRequest deleteL2BucketLinkRequest = new DeleteL2BucketLinkRequest();
        deleteL2BucketLinkRequest.setInstanceId("");
        deleteL2BucketLinkRequest.setBucketLinkId("");
        try {
            DeleteL2BucketLinkResponse response = client.deleteL2BucketLink(deleteL2BucketLinkRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
