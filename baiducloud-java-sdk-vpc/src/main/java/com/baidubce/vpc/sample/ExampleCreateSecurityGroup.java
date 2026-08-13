package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateSecurityGroupRequest;
import com.baidubce.vpc.models.CreateSecurityGroupResponse;
import java.util.ArrayList;

public class ExampleCreateSecurityGroup {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        CreateSecurityGroupRequest createSecurityGroupRequest = new CreateSecurityGroupRequest();
        createSecurityGroupRequest.setClientToken("");
        createSecurityGroupRequest.setName("");
        createSecurityGroupRequest.setVpcId("");
        createSecurityGroupRequest.setDesc("");
        createSecurityGroupRequest.setRules(new ArrayList<>());
        createSecurityGroupRequest.setTags(new ArrayList<>());
        try {
            CreateSecurityGroupResponse response = client.createSecurityGroup(createSecurityGroupRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
