package com.baidubce.apm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.apm.ApmClient;
import com.baidubce.apm.models.DescribeLLMSessionsRequest;
import com.baidubce.apm.models.DescribeLLMSessionsResponse;
import java.util.ArrayList;

public class ExampleDescribeLLMSessions {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        ApmClient client = new ApmClient(config);
        DescribeLLMSessionsRequest describeLLMSessionsRequest = new DescribeLLMSessionsRequest();
        describeLLMSessionsRequest.setBeginDatetime("");
        describeLLMSessionsRequest.setEndDatetime("");
        describeLLMSessionsRequest.setFilters(new ArrayList<>());
        describeLLMSessionsRequest.setOrderBy("");
        describeLLMSessionsRequest.setOrder("");
        describeLLMSessionsRequest.setPageNo(0);
        describeLLMSessionsRequest.setPageSize(0);
        try {
            DescribeLLMSessionsResponse response = client.describeLLMSessions(describeLLMSessionsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
