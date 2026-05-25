package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeTraceMetricDataV3Request;
import com.baidubce.bcm.models.DescribeTraceMetricDataV3Response;
import java.util.ArrayList;

public class ExampleDescribeTraceMetricDataV3 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BcmClient client = new BcmClient(config);
        DescribeTraceMetricDataV3Request describeTraceMetricDataV3Request = new DescribeTraceMetricDataV3Request();
        describeTraceMetricDataV3Request.setAction("");
        describeTraceMetricDataV3Request.setBeginDatetime("");
        describeTraceMetricDataV3Request.setEndDatetime("");
        describeTraceMetricDataV3Request.setMetrics(new ArrayList<>());
        describeTraceMetricDataV3Request.setMetricsName("");
        describeTraceMetricDataV3Request.setFilters(new ArrayList<>());
        describeTraceMetricDataV3Request.setGroupBy(new ArrayList<>());
        describeTraceMetricDataV3Request.setPeriodSeconds(0);
        describeTraceMetricDataV3Request.setAggregate(new ArrayList<>());
        try {
            DescribeTraceMetricDataV3Response response = client.describeTraceMetricDataV3(describeTraceMetricDataV3Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
