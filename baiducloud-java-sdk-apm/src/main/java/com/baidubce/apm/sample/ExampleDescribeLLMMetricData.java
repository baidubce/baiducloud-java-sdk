package com.baidubce.apm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.apm.ApmClient;
import com.baidubce.apm.models.DescribeLLMMetricDataRequest;
import com.baidubce.apm.models.DescribeLLMMetricDataResponse;
import java.util.ArrayList;

public class ExampleDescribeLLMMetricData {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        ApmClient client = new ApmClient(config);
        DescribeLLMMetricDataRequest describeLLMMetricDataRequest = new DescribeLLMMetricDataRequest();
        describeLLMMetricDataRequest.setBeginDatetime("");
        describeLLMMetricDataRequest.setEndDatetime("");
        describeLLMMetricDataRequest.setMetrics(new ArrayList<>());
        describeLLMMetricDataRequest.setFilters(new ArrayList<>());
        describeLLMMetricDataRequest.setGroupBy(new ArrayList<>());
        describeLLMMetricDataRequest.setOrderBy("");
        describeLLMMetricDataRequest.setOrder("");
        describeLLMMetricDataRequest.setLimit(0);
        describeLLMMetricDataRequest.setPeriodSeconds(0);
        describeLLMMetricDataRequest.setAggregate(new ArrayList<>());
        try {
            DescribeLLMMetricDataResponse response = client.describeLLMMetricData(describeLLMMetricDataRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
