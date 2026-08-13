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
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
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
