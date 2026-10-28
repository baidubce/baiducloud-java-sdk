package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.DescribeAuthorizeRulesRequest;
import com.baidubce.bcc.models.DescribeAuthorizeRulesResponse;
import java.util.ArrayList;

public class ExampleDescribeAuthorizeRules {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        DescribeAuthorizeRulesRequest describeAuthorizeRulesRequest = new DescribeAuthorizeRulesRequest();
        describeAuthorizeRulesRequest.setAction("");
        describeAuthorizeRulesRequest.setMarker("");
        describeAuthorizeRulesRequest.setMaxKeys(0);
        describeAuthorizeRulesRequest.setRuleIds(new ArrayList<>());
        describeAuthorizeRulesRequest.setRuleNames(new ArrayList<>());
        try {
            DescribeAuthorizeRulesResponse response = client.describeAuthorizeRules(describeAuthorizeRulesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
