package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.GetNodeGroupDetailsV2Request;
import com.baidubce.cce.models.GetNodeGroupDetailsV2Response;

public class ExampleGetNodeGroupDetailsV2 {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CceClient client = new CceClient(bceClientConfig);
        GetNodeGroupDetailsV2Request getNodeGroupDetailsV2Request = new GetNodeGroupDetailsV2Request();
        getNodeGroupDetailsV2Request.setClusterID("");
        getNodeGroupDetailsV2Request.setInstanceGroupID("");
        try {
            GetNodeGroupDetailsV2Response response = client.getNodeGroupDetailsV2(getNodeGroupDetailsV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
