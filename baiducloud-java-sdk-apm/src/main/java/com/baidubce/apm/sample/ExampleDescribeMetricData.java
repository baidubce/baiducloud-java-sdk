package com.baidubce.apm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.apm.ApmClient;
import com.baidubce.apm.models.DescribeMetricDataRequest;
import com.baidubce.apm.models.DescribeMetricDataResponse;
import java.util.ArrayList;

public class ExampleDescribeMetricData {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        ApmClient client = new ApmClient(config);
        DescribeMetricDataRequest describeMetricDataRequest = new DescribeMetricDataRequest();
        describeMetricDataRequest.setAction("");
        describeMetricDataRequest.setMetrics(new ArrayList<>());
        describeMetricDataRequest.setMetricsName("");
        describeMetricDataRequest.setMetricsCompareTo(new ArrayList<>());
        describeMetricDataRequest.setMetricsFilters(new ArrayList<>());
        describeMetricDataRequest.setBeginDatetime("");
        describeMetricDataRequest.setEndDatetime("");
        describeMetricDataRequest.setFilters(new ArrayList<>());
        describeMetricDataRequest.setGroupBy(new ArrayList<>());
        describeMetricDataRequest.setOrderBy("");
        describeMetricDataRequest.setOrder("");
        describeMetricDataRequest.setLimit(0);
        describeMetricDataRequest.setPeriodSeconds(0);
        describeMetricDataRequest.setReserveEmptyDimensions(false);
        try {
            DescribeMetricDataResponse response = client.describeMetricData(describeMetricDataRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
