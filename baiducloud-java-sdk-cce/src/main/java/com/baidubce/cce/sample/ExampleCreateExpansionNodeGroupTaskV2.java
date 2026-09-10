package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.CreateExpansionNodeGroupTaskV2Request;
import com.baidubce.cce.models.CreateExpansionNodeGroupTaskV2Response;

public class ExampleCreateExpansionNodeGroupTaskV2 {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CceClient client = new CceClient(bceClientConfig);
        CreateExpansionNodeGroupTaskV2Request createExpansionNodeGroupTaskV2Request = new CreateExpansionNodeGroupTaskV2Request();
        createExpansionNodeGroupTaskV2Request.setClusterID("");
        createExpansionNodeGroupTaskV2Request.setInstanceGroupID("");
        createExpansionNodeGroupTaskV2Request.setUpToReplicas(0);
        createExpansionNodeGroupTaskV2Request.setUpReplicas(0);
        try {
            CreateExpansionNodeGroupTaskV2Response response = client.createExpansionNodeGroupTaskV2(createExpansionNodeGroupTaskV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
