package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.UpdPerL2BktLnkInfoRequest;
import com.baidubce.pfs.models.UpdPerL2BktLnkInfoResponse;

public class ExampleUpdPerL2BktLnkInfo {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        UpdPerL2BktLnkInfoRequest updPerL2BktLnkInfoRequest = new UpdPerL2BktLnkInfoRequest();
        updPerL2BktLnkInfoRequest.setInstanceId("");
        updPerL2BktLnkInfoRequest.setBucketLinkId("");
        updPerL2BktLnkInfoRequest.setNewCron("");
        updPerL2BktLnkInfoRequest.setNewBucketLinkName("");
        updPerL2BktLnkInfoRequest.setNewConflictPolicy(0);
        updPerL2BktLnkInfoRequest.setNewThroughputLimitBytes(0);
        updPerL2BktLnkInfoRequest.setNewScope(0);
        try {
            UpdPerL2BktLnkInfoResponse response = client.updPerL2BktLnkInfo(updPerL2BktLnkInfoRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
