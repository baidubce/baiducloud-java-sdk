package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeLLMSessionsV3Request;
import com.baidubce.bcm.models.DescribeLLMSessionsV3Response;
import java.util.ArrayList;

public class ExampleDescribeLLMSessionsV3 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BcmClient client = new BcmClient(config);
        DescribeLLMSessionsV3Request describeLLMSessionsV3Request = new DescribeLLMSessionsV3Request();
        describeLLMSessionsV3Request.setBeginDatetime("");
        describeLLMSessionsV3Request.setEndDatetime("");
        describeLLMSessionsV3Request.setFilters(new ArrayList<>());
        describeLLMSessionsV3Request.setOrderBy("");
        describeLLMSessionsV3Request.setOrder("");
        describeLLMSessionsV3Request.setPageNo(0);
        describeLLMSessionsV3Request.setPageSize(0);
        try {
            DescribeLLMSessionsV3Response response = client.describeLLMSessionsV3(describeLLMSessionsV3Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
