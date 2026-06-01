package com.baidubce.apm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.apm.ApmClient;
import com.baidubce.apm.models.DescribeLLMTracesStatisticsRequest;
import com.baidubce.apm.models.DescribeLLMTracesStatisticsResponse;
import java.util.ArrayList;

public class ExampleDescribeLLMTracesStatistics {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        ApmClient client = new ApmClient(config);
        DescribeLLMTracesStatisticsRequest describeLLMTracesStatisticsRequest = new DescribeLLMTracesStatisticsRequest();
        describeLLMTracesStatisticsRequest.setBeginDatetime("");
        describeLLMTracesStatisticsRequest.setEndDatetime("");
        describeLLMTracesStatisticsRequest.setFilters(new ArrayList<>());
        try {
            DescribeLLMTracesStatisticsResponse response = client.describeLLMTracesStatistics(describeLLMTracesStatisticsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
