package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.QuerySecurityGroupsListRequest;
import com.baidubce.vpc.models.QuerySecurityGroupsListResponse;

public class ExampleQuerySecurityGroupsList {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        QuerySecurityGroupsListRequest querySecurityGroupsListRequest = new QuerySecurityGroupsListRequest();
        querySecurityGroupsListRequest.setMarker("");
        querySecurityGroupsListRequest.setMaxKeys(0);
        querySecurityGroupsListRequest.setInstanceId("");
        querySecurityGroupsListRequest.setVpcId("");
        querySecurityGroupsListRequest.setSecurityGroupId("");
        querySecurityGroupsListRequest.setSecurityGroupIds("");
        try {
            QuerySecurityGroupsListResponse response = client.querySecurityGroupsList(querySecurityGroupsListRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
