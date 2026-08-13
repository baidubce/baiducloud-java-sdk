package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.QuerySubnetListRequest;
import com.baidubce.vpc.models.QuerySubnetListResponse;

public class ExampleQuerySubnetList {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        QuerySubnetListRequest querySubnetListRequest = new QuerySubnetListRequest();
        querySubnetListRequest.setMarker("");
        querySubnetListRequest.setMaxKeys(0);
        querySubnetListRequest.setVpcId("");
        querySubnetListRequest.setZoneName("");
        querySubnetListRequest.setSubnetType("");
        querySubnetListRequest.setSubnetIds("");
        try {
            QuerySubnetListResponse response = client.querySubnetList(querySubnetListRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
