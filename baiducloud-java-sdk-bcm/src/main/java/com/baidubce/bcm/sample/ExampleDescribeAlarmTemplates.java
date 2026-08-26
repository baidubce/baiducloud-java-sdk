package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeAlarmTemplatesRequest;
import com.baidubce.bcm.models.DescribeAlarmTemplatesResponse;

public class ExampleDescribeAlarmTemplates {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BcmClient client = new BcmClient(bceClientConfig);
        DescribeAlarmTemplatesRequest describeAlarmTemplatesRequest = new DescribeAlarmTemplatesRequest();
        describeAlarmTemplatesRequest.setName("");
        describeAlarmTemplatesRequest.setScope("");
        describeAlarmTemplatesRequest.setResourceType("");
        describeAlarmTemplatesRequest.setSubResourceType("");
        describeAlarmTemplatesRequest.setOrder("");
        describeAlarmTemplatesRequest.setOrderBy("");
        describeAlarmTemplatesRequest.setPageNo(0);
        describeAlarmTemplatesRequest.setPageSize(0);
        try {
            DescribeAlarmTemplatesResponse response = client.describeAlarmTemplates(describeAlarmTemplatesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
