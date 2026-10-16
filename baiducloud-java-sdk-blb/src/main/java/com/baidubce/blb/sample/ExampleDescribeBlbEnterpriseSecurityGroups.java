package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.DescribeBlbEnterpriseSecurityGroupsRequest;
import com.baidubce.blb.models.DescribeBlbEnterpriseSecurityGroupsResponse;

public class ExampleDescribeBlbEnterpriseSecurityGroups {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        DescribeBlbEnterpriseSecurityGroupsRequest describeBlbEnterpriseSecurityGroupsRequest = new DescribeBlbEnterpriseSecurityGroupsRequest();
        describeBlbEnterpriseSecurityGroupsRequest.setBlbId("");
        try {
            DescribeBlbEnterpriseSecurityGroupsResponse response = client.describeBlbEnterpriseSecurityGroups(describeBlbEnterpriseSecurityGroupsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
