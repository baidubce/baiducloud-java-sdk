package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.ListL2BucketLinkRequest;
import com.baidubce.pfs.models.ListL2BucketLinkResponse;

public class ExampleListL2BucketLink {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        ListL2BucketLinkRequest listL2BucketLinkRequest = new ListL2BucketLinkRequest();
        listL2BucketLinkRequest.setInstanceId("");
        listL2BucketLinkRequest.setMaxKeys(0);
        listL2BucketLinkRequest.setManner("");
        listL2BucketLinkRequest.setMarker("");
        try {
            ListL2BucketLinkResponse response = client.listL2BucketLink(listL2BucketLinkRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
