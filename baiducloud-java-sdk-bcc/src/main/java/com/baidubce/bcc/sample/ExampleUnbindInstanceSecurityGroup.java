package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.UnbindInstanceSecurityGroupRequest;
import com.baidubce.bcc.models.UnbindInstanceSecurityGroupResponse;
import java.util.ArrayList;

public class ExampleUnbindInstanceSecurityGroup {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        UnbindInstanceSecurityGroupRequest unbindInstanceSecurityGroupRequest = new UnbindInstanceSecurityGroupRequest();
        unbindInstanceSecurityGroupRequest.setInstanceIds(new ArrayList<>());
        unbindInstanceSecurityGroupRequest.setSecurityGroupIds(new ArrayList<>());
        unbindInstanceSecurityGroupRequest.setSecurityGroupType("");
        try {
            UnbindInstanceSecurityGroupResponse response = client.unbindInstanceSecurityGroup(unbindInstanceSecurityGroupRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
