package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.ListSecurityGroupsRequest;
import com.baidubce.bcc.models.ListSecurityGroupsResponse;

public class ExampleListSecurityGroups {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        ListSecurityGroupsRequest listSecurityGroupsRequest = new ListSecurityGroupsRequest();
        listSecurityGroupsRequest.setMarker("");
        listSecurityGroupsRequest.setMaxKeys(0);
        listSecurityGroupsRequest.setInstanceId("");
        listSecurityGroupsRequest.setVpcId("");
        listSecurityGroupsRequest.setSecurityGroupId("");
        listSecurityGroupsRequest.setSecurityGroupIds("");
        try {
            ListSecurityGroupsResponse response = client.listSecurityGroups(listSecurityGroupsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
