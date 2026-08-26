package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeMetricDataLatestRequest;
import com.baidubce.bcm.models.DescribeMetricDataLatestResponse;
import java.util.ArrayList;

public class ExampleDescribeMetricDataLatest {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BcmClient client = new BcmClient(bceClientConfig);
        DescribeMetricDataLatestRequest describeMetricDataLatestRequest = new DescribeMetricDataLatestRequest();
        describeMetricDataLatestRequest.setAction("");
        describeMetricDataLatestRequest.setScope("");
        describeMetricDataLatestRequest.setResourceType("");
        describeMetricDataLatestRequest.setRegion("");
        describeMetricDataLatestRequest.setEndDatetime("");
        describeMetricDataLatestRequest.setMetricName("");
        describeMetricDataLatestRequest.setFilters(new ArrayList<>());
        describeMetricDataLatestRequest.setLimit(0);
        describeMetricDataLatestRequest.setOffset(0);
        describeMetricDataLatestRequest.setPeriodSeconds(0);
        describeMetricDataLatestRequest.setAggregationOverTime(new ArrayList<>());
        try {
            DescribeMetricDataLatestResponse response = client.describeMetricDataLatest(describeMetricDataLatestRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
