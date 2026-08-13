package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.ResumeL2BucketLinkRequest;
import com.baidubce.pfs.models.ResumeL2BucketLinkResponse;

public class ExampleResumeL2BucketLink {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        ResumeL2BucketLinkRequest resumeL2BucketLinkRequest = new ResumeL2BucketLinkRequest();
        resumeL2BucketLinkRequest.setInstanceId("");
        resumeL2BucketLinkRequest.setBucketLinkId("");
        try {
            ResumeL2BucketLinkResponse response = client.resumeL2BucketLink(resumeL2BucketLinkRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
