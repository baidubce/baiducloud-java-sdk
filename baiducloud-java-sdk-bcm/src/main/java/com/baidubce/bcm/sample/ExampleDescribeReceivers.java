package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeReceiversRequest;
import com.baidubce.bcm.models.DescribeReceiversResponse;

public class ExampleDescribeReceivers {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BcmClient client = new BcmClient(bceClientConfig);
        DescribeReceiversRequest describeReceiversRequest = new DescribeReceiversRequest();
        describeReceiversRequest.setType("");
        describeReceiversRequest.setName("");
        describeReceiversRequest.setPageNo(0);
        describeReceiversRequest.setPageSize(0);
        try {
            DescribeReceiversResponse response = client.describeReceivers(describeReceiversRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
