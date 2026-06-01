package com.baidubce.apm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.apm.ApmClient;
import com.baidubce.apm.models.DescribeLLMSpansRequest;
import com.baidubce.apm.models.DescribeLLMSpansResponse;
import java.util.ArrayList;

public class ExampleDescribeLLMSpans {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        ApmClient client = new ApmClient(config);
        DescribeLLMSpansRequest describeLLMSpansRequest = new DescribeLLMSpansRequest();
        describeLLMSpansRequest.setBeginDatetime("");
        describeLLMSpansRequest.setEndDatetime("");
        describeLLMSpansRequest.setParseLLMInputOutput(false);
        describeLLMSpansRequest.setFilters(new ArrayList<>());
        describeLLMSpansRequest.setOrderBy("");
        describeLLMSpansRequest.setOrder("");
        describeLLMSpansRequest.setMarker("");
        try {
            DescribeLLMSpansResponse response = client.describeLLMSpans(describeLLMSpansRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
