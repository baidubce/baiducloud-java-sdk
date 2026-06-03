package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.CreateL2BucketLinkRequest;
import com.baidubce.pfs.models.CreateL2BucketLinkResponse;

public class ExampleCreateL2BucketLink {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        PfsClient client = new PfsClient(config);
        CreateL2BucketLinkRequest createL2BucketLinkRequest = new CreateL2BucketLinkRequest();
        createL2BucketLinkRequest.setInstanceId("");
        createL2BucketLinkRequest.setConflictPolicy("");
        createL2BucketLinkRequest.setBucketName("");
        createL2BucketLinkRequest.setBucketPrefix("");
        createL2BucketLinkRequest.setThroughputLimitBytes("");
        createL2BucketLinkRequest.setReportObjectName("");
        createL2BucketLinkRequest.setBucketLinkName("");
        createL2BucketLinkRequest.setTransferType(0);
        createL2BucketLinkRequest.setPfsPath("");
        createL2BucketLinkRequest.setCron("");
        createL2BucketLinkRequest.setBucketBelongUserId("");
        createL2BucketLinkRequest.setLccId("");
        createL2BucketLinkRequest.setScope(0);
        try {
            CreateL2BucketLinkResponse response = client.createL2BucketLink(createL2BucketLinkRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
