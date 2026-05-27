package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.QuerySecurityGroupsListRequest;
import com.baidubce.vpc.models.QuerySecurityGroupsListResponse;

public class ExampleQuerySecurityGroupsList {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        VpcClient client = new VpcClient(config);
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
