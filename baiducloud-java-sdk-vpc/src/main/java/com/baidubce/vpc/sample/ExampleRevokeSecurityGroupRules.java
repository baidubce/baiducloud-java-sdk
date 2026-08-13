package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.RevokeSecurityGroupRulesRequest;
import com.baidubce.vpc.models.SecurityGroupRuleModel;

public class ExampleRevokeSecurityGroupRules {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
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

        RevokeSecurityGroupRulesRequest revokeSecurityGroupRulesRequest = new RevokeSecurityGroupRulesRequest();
        revokeSecurityGroupRulesRequest.setSecurityGroupId("");
        revokeSecurityGroupRulesRequest.setClientToken("");
        revokeSecurityGroupRulesRequest.setSgVersion(0L);
        revokeSecurityGroupRulesRequest.setRule(rule);
        try {
            client.revokeSecurityGroupRules(revokeSecurityGroupRulesRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
