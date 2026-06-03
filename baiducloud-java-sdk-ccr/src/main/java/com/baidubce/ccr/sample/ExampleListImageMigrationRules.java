package com.baidubce.ccr.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.ccr.CcrClient;
import com.baidubce.ccr.models.ListImageMigrationRulesRequest;
import com.baidubce.ccr.models.ListImageMigrationRulesResponse;

public class ExampleListImageMigrationRules {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        CcrClient client = new CcrClient(config);
        ListImageMigrationRulesRequest listImageMigrationRulesRequest = new ListImageMigrationRulesRequest();
        listImageMigrationRulesRequest.setInstanceId("");
        listImageMigrationRulesRequest.setPolicyName("");
        listImageMigrationRulesRequest.setPageNo(0);
        listImageMigrationRulesRequest.setPageSize(0);
        try {
            ListImageMigrationRulesResponse response = client.listImageMigrationRules(listImageMigrationRulesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
