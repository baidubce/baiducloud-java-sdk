package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.RevokeSecurityGroupRuleRequest;
import com.baidubce.bcc.models.SecurityGroupRuleModel;

public class ExampleRevokeSecurityGroupRule {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BccClient client = new BccClient(bceClientConfig);
        SecurityGroupRuleModel rule = new SecurityGroupRuleModel();
        rule.setRemark("");
        rule.setDirection("");
        rule.setEthertype("");
        rule.setPortRange("");
        rule.setProtocol("");
        rule.setSourceGroupId("");
        rule.setSourceIp("");
        rule.setDestGroupId("");
        rule.setDestIp("");
        rule.setSecurityGroupId("");
        rule.setSecurityGroupRuleId("");
        rule.setCreatedTime("");
        rule.setUpdatedTime("");

        RevokeSecurityGroupRuleRequest revokeSecurityGroupRuleRequest = new RevokeSecurityGroupRuleRequest();
        revokeSecurityGroupRuleRequest.setSecurityGroupId("");
        revokeSecurityGroupRuleRequest.setSgVersion(0);
        revokeSecurityGroupRuleRequest.setRule(rule);
        try {
            client.revokeSecurityGroupRule(revokeSecurityGroupRuleRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
