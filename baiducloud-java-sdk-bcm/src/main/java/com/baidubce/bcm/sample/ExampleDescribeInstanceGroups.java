package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeInstanceGroupsRequest;
import com.baidubce.bcm.models.DescribeInstanceGroupsResponse;

public class ExampleDescribeInstanceGroups {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BcmClient client = new BcmClient(bceClientConfig);
        DescribeInstanceGroupsRequest describeInstanceGroupsRequest = new DescribeInstanceGroupsRequest();
        describeInstanceGroupsRequest.setScope("");
        describeInstanceGroupsRequest.setResourceType("");
        describeInstanceGroupsRequest.setName("");
        describeInstanceGroupsRequest.setOrder("");
        describeInstanceGroupsRequest.setOrderBy("");
        describeInstanceGroupsRequest.setPageNo(0);
        describeInstanceGroupsRequest.setPageSize(0);
        try {
            DescribeInstanceGroupsResponse response = client.describeInstanceGroups(describeInstanceGroupsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
