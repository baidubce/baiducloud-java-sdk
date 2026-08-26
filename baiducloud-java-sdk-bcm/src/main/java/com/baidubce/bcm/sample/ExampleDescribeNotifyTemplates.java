package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeNotifyTemplatesRequest;
import com.baidubce.bcm.models.DescribeNotifyTemplatesResponse;

public class ExampleDescribeNotifyTemplates {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BcmClient client = new BcmClient(bceClientConfig);
        DescribeNotifyTemplatesRequest describeNotifyTemplatesRequest = new DescribeNotifyTemplatesRequest();
        describeNotifyTemplatesRequest.setName("");
        describeNotifyTemplatesRequest.setPolicyId("");
        describeNotifyTemplatesRequest.setOrder("");
        describeNotifyTemplatesRequest.setOrderBy("");
        describeNotifyTemplatesRequest.setPageNo(0);
        describeNotifyTemplatesRequest.setPageSize(0);
        try {
            DescribeNotifyTemplatesResponse response = client.describeNotifyTemplates(describeNotifyTemplatesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
