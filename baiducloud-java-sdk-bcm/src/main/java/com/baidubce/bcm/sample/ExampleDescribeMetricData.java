package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeMetricDataRequest;
import com.baidubce.bcm.models.DescribeMetricDataResponse;
import java.util.ArrayList;

public class ExampleDescribeMetricData {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BcmClient client = new BcmClient(bceClientConfig);
        DescribeMetricDataRequest describeMetricDataRequest = new DescribeMetricDataRequest();
        describeMetricDataRequest.setAction("");
        describeMetricDataRequest.setScope("");
        describeMetricDataRequest.setResourceType("");
        describeMetricDataRequest.setRegion("");
        describeMetricDataRequest.setBeginDatetime("");
        describeMetricDataRequest.setEndDatetime("");
        describeMetricDataRequest.setMetricName("");
        describeMetricDataRequest.setFilters(new ArrayList<>());
        describeMetricDataRequest.setLimit(0);
        describeMetricDataRequest.setOffset(0);
        describeMetricDataRequest.setPeriodSeconds(0);
        describeMetricDataRequest.setAggregationOverTime(new ArrayList<>());
        try {
            DescribeMetricDataResponse response = client.describeMetricData(describeMetricDataRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
