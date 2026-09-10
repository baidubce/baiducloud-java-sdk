package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.DeleteNodeGroupV2Request;
import com.baidubce.cce.models.DeleteNodeGroupV2Response;

public class ExampleDeleteNodeGroupV2 {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CceClient client = new CceClient(bceClientConfig);
        DeleteNodeGroupV2Request deleteNodeGroupV2Request = new DeleteNodeGroupV2Request();
        deleteNodeGroupV2Request.setClusterID("");
        deleteNodeGroupV2Request.setInstanceGroupID("");
        deleteNodeGroupV2Request.setDeleteInstances(false);
        deleteNodeGroupV2Request.setReleaseAllResource(false);
        try {
            DeleteNodeGroupV2Response response = client.deleteNodeGroupV2(deleteNodeGroupV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
