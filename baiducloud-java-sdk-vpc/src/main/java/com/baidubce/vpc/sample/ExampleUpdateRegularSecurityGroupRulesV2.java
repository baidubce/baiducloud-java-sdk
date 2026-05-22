package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.UpdateRegularSecurityGroupRulesV2Request;

public class ExampleUpdateRegularSecurityGroupRulesV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        VpcClient client = new VpcClient(config);
        UpdateRegularSecurityGroupRulesV2Request updateRegularSecurityGroupRulesV2Request = new UpdateRegularSecurityGroupRulesV2Request();
        updateRegularSecurityGroupRulesV2Request.setClientToken("");
        updateRegularSecurityGroupRulesV2Request.setSgVersion(0L);
        updateRegularSecurityGroupRulesV2Request.setSecurityGroupRuleId("");
        updateRegularSecurityGroupRulesV2Request.setRemark("");
        updateRegularSecurityGroupRulesV2Request.setPortRange("");
        updateRegularSecurityGroupRulesV2Request.setSourceIp("");
        updateRegularSecurityGroupRulesV2Request.setSourceGroupId("");
        updateRegularSecurityGroupRulesV2Request.setDestIp("");
        updateRegularSecurityGroupRulesV2Request.setDestGroupId("");
        updateRegularSecurityGroupRulesV2Request.setProtocol("");
        try {
            client.updateRegularSecurityGroupRulesV2(updateRegularSecurityGroupRulesV2Request);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
