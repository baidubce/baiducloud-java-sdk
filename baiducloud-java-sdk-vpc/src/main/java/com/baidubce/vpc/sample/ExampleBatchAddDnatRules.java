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
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

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
