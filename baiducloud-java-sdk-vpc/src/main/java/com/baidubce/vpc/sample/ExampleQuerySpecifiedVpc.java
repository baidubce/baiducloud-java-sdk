package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.QuerySpecifiedVpcRequest;
import com.baidubce.vpc.models.QuerySpecifiedVpcResponse;

public class ExampleQuerySpecifiedVpc {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        QuerySpecifiedVpcRequest querySpecifiedVpcRequest = new QuerySpecifiedVpcRequest();
        querySpecifiedVpcRequest.setVpcId("");
        try {
            QuerySpecifiedVpcResponse response = client.querySpecifiedVpc(querySpecifiedVpcRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
