package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.CreateL2BucketLinkRequest;
import com.baidubce.pfs.models.CreateL2BucketLinkResponse;

public class ExampleCreateL2BucketLink {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
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
