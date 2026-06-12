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
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
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
