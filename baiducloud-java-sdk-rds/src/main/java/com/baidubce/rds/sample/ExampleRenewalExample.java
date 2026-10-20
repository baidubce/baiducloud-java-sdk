package com.baidubce.rds.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rds.RdsClient;
import com.baidubce.rds.models.RenewalExampleRequest;
import com.baidubce.rds.models.RenewalExampleResponse;
import java.util.ArrayList;

public class ExampleRenewalExample {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        RdsClient client = new RdsClient(bceClientConfig);
        RenewalExampleRequest renewalExampleRequest = new RenewalExampleRequest();
        renewalExampleRequest.setDuration(0);
        renewalExampleRequest.setInstanceIds(new ArrayList<>());
        try {
            RenewalExampleResponse response = client.renewalExample(renewalExampleRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
