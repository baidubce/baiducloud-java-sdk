package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.UpdateSecurityGroupRulesRequest;

public class ExampleUpdateSecurityGroupRules {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        UpdateSecurityGroupRulesRequest updateSecurityGroupRulesRequest = new UpdateSecurityGroupRulesRequest();
        updateSecurityGroupRulesRequest.setClientToken("");
        updateSecurityGroupRulesRequest.setSgVersion(0L);
        updateSecurityGroupRulesRequest.setSecurityGroupRuleId("");
        updateSecurityGroupRulesRequest.setRemark("");
        updateSecurityGroupRulesRequest.setPortRange("");
        updateSecurityGroupRulesRequest.setSourceIp("");
        updateSecurityGroupRulesRequest.setSourceGroupId("");
        updateSecurityGroupRulesRequest.setDestIp("");
        updateSecurityGroupRulesRequest.setDestGroupId("");
        updateSecurityGroupRulesRequest.setProtocol("");
        try {
            client.updateSecurityGroupRules(updateSecurityGroupRulesRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
