package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.BatchAddDnatRulesRequest;
import com.baidubce.vpc.models.BatchAddDnatRulesResponse;
import java.util.ArrayList;

public class ExampleBatchAddDnatRules {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        VpcClient client = new VpcClient(bceClientConfig);
        BatchAddDnatRulesRequest batchAddDnatRulesRequest = new BatchAddDnatRulesRequest();
        batchAddDnatRulesRequest.setNatId("");
        batchAddDnatRulesRequest.setClientToken("");
        batchAddDnatRulesRequest.setRules(new ArrayList<>());
        try {
            BatchAddDnatRulesResponse response = client.batchAddDnatRules(batchAddDnatRulesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
