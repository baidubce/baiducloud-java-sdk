package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.DeleteRegularSecurityGroupRulesV2Request;

public class ExampleDeleteRegularSecurityGroupRulesV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        VpcClient client = new VpcClient(config);
        DeleteRegularSecurityGroupRulesV2Request deleteRegularSecurityGroupRulesV2Request = new DeleteRegularSecurityGroupRulesV2Request();
        deleteRegularSecurityGroupRulesV2Request.setSecurityGroupRuleId("");
        deleteRegularSecurityGroupRulesV2Request.setClientToken("");
        deleteRegularSecurityGroupRulesV2Request.setSgVersion(0L);
        try {
            client.deleteRegularSecurityGroupRulesV2(deleteRegularSecurityGroupRulesV2Request);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
