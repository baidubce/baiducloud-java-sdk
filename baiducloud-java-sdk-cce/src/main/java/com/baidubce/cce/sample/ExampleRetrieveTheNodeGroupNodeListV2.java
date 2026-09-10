package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.RetrieveTheNodeGroupNodeListV2Request;
import com.baidubce.cce.models.RetrieveTheNodeGroupNodeListV2Response;

public class ExampleRetrieveTheNodeGroupNodeListV2 {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CceClient client = new CceClient(bceClientConfig);
        RetrieveTheNodeGroupNodeListV2Request retrieveTheNodeGroupNodeListV2Request = new RetrieveTheNodeGroupNodeListV2Request();
        retrieveTheNodeGroupNodeListV2Request.setClusterID("");
        retrieveTheNodeGroupNodeListV2Request.setInstanceGroupID("");
        retrieveTheNodeGroupNodeListV2Request.setPageNo(0);
        retrieveTheNodeGroupNodeListV2Request.setPageSize(0);
        try {
            RetrieveTheNodeGroupNodeListV2Response response = client.retrieveTheNodeGroupNodeListV2(retrieveTheNodeGroupNodeListV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
