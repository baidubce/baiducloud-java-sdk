package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.BatchAddSnatRulesRequest;
import com.baidubce.vpc.models.BatchAddSnatRulesResponse;
import java.util.ArrayList;

public class ExampleBatchAddSnatRules {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        VpcClient client = new VpcClient(config);
        BatchAddSnatRulesRequest batchAddSnatRulesRequest = new BatchAddSnatRulesRequest();
        batchAddSnatRulesRequest.setClientToken("");
        batchAddSnatRulesRequest.setNatId("");
        batchAddSnatRulesRequest.setSnatRules(new ArrayList<>());
        try {
            BatchAddSnatRulesResponse response = client.batchAddSnatRules(batchAddSnatRulesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
