package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeLLMMetricDataV3Request;
import com.baidubce.bcm.models.DescribeTraceMetricDataV3Response;
import java.util.ArrayList;

public class ExampleDescribeLLMMetricDataV3 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BcmClient client = new BcmClient(config);
        DescribeLLMMetricDataV3Request describeLLMMetricDataV3Request = new DescribeLLMMetricDataV3Request();
        describeLLMMetricDataV3Request.setBeginDatetime("");
        describeLLMMetricDataV3Request.setEndDatetime("");
        describeLLMMetricDataV3Request.setMetrics(new ArrayList<>());
        describeLLMMetricDataV3Request.setFilters(new ArrayList<>());
        describeLLMMetricDataV3Request.setGroupBy(new ArrayList<>());
        describeLLMMetricDataV3Request.setOrderBy("");
        describeLLMMetricDataV3Request.setOrder("");
        describeLLMMetricDataV3Request.setLimit(0);
        describeLLMMetricDataV3Request.setPeriodSeconds(0);
        describeLLMMetricDataV3Request.setAggregate(new ArrayList<>());
        try {
            DescribeTraceMetricDataV3Response response = client.describeLLMMetricDataV3(describeLLMMetricDataV3Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
