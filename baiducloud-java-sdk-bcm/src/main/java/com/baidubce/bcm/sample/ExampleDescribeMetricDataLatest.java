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
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
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
