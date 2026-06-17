package com.baidubce.sts.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.sts.StsClient;
import com.baidubce.sts.models.AssumeRoleRequest;
import com.baidubce.sts.models.AssumeRoleResponse;

public class ExampleAssumeRole {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        StsClient client = new StsClient(bceClientConfig);
        AssumeRoleRequest assumeRoleRequest = new AssumeRoleRequest();
        assumeRoleRequest.setAccountId("");
        assumeRoleRequest.setRoleName("");
        assumeRoleRequest.setDurationSeconds("");
        assumeRoleRequest.setUserId("");
        assumeRoleRequest.setAccessControlList("");
        try {
            AssumeRoleResponse response = client.assumeRole(assumeRoleRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
