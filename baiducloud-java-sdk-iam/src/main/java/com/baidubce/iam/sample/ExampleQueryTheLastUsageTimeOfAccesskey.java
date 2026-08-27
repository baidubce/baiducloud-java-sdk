package com.baidubce.iam.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.iam.IamClient;
import com.baidubce.iam.models.QueryTheLastUsageTimeOfAccesskeyRequest;
import com.baidubce.iam.models.QueryTheLastUsageTimeOfAccesskeyResponse;

public class ExampleQueryTheLastUsageTimeOfAccesskey {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        IamClient client = new IamClient(bceClientConfig);
        QueryTheLastUsageTimeOfAccesskeyRequest queryTheLastUsageTimeOfAccesskeyRequest = new QueryTheLastUsageTimeOfAccesskeyRequest();
        queryTheLastUsageTimeOfAccesskeyRequest.setAccessKeyId("");
        try {
            QueryTheLastUsageTimeOfAccesskeyResponse response = client.queryTheLastUsageTimeOfAccesskey(queryTheLastUsageTimeOfAccesskeyRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
