package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.ResumeL2BucketLinkRequest;
import com.baidubce.pfs.models.ResumeL2BucketLinkResponse;

public class ExampleResumeL2BucketLink {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
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
