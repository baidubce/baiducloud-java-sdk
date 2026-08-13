package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.QueryIpGroupListRequest;
import com.baidubce.vpc.models.QueryIpGroupListResponse;

public class ExampleQueryIpGroupList {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        QueryIpGroupListRequest queryIpGroupListRequest = new QueryIpGroupListRequest();
        queryIpGroupListRequest.setIpVersion("");
        queryIpGroupListRequest.setMarker("");
        queryIpGroupListRequest.setMaxKeys(0);
        try {
            QueryIpGroupListResponse response = client.queryIpGroupList(queryIpGroupListRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
