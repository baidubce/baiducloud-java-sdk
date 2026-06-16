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
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
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
