package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.BindInstanceSecurityGroupRequest;
import com.baidubce.bcc.models.BindInstanceSecurityGroupResponse;
import java.util.ArrayList;

public class ExampleBindInstanceSecurityGroup {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        BindInstanceSecurityGroupRequest bindInstanceSecurityGroupRequest = new BindInstanceSecurityGroupRequest();
        bindInstanceSecurityGroupRequest.setInstanceIds(new ArrayList<>());
        bindInstanceSecurityGroupRequest.setSecurityGroupIds(new ArrayList<>());
        bindInstanceSecurityGroupRequest.setSecurityGroupType("");
        try {
            BindInstanceSecurityGroupResponse response = client.bindInstanceSecurityGroup(bindInstanceSecurityGroupRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
