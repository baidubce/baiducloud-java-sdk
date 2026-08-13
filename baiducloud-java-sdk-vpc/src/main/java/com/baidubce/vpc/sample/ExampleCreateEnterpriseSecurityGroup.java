package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateEnterpriseSecurityGroupRequest;
import com.baidubce.vpc.models.CreateEnterpriseSecurityGroupResponse;
import java.util.ArrayList;

public class ExampleCreateEnterpriseSecurityGroup {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        CreateEnterpriseSecurityGroupRequest createEnterpriseSecurityGroupRequest = new CreateEnterpriseSecurityGroupRequest();
        createEnterpriseSecurityGroupRequest.setClientToken("");
        createEnterpriseSecurityGroupRequest.setName("");
        createEnterpriseSecurityGroupRequest.setDesc("");
        createEnterpriseSecurityGroupRequest.setRules(new ArrayList<>());
        createEnterpriseSecurityGroupRequest.setTags(new ArrayList<>());
        try {
            CreateEnterpriseSecurityGroupResponse response = client.createEnterpriseSecurityGroup(createEnterpriseSecurityGroupRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
