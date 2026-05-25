package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeLLMSpansV3Request;
import com.baidubce.bcm.models.DescribeLLMSpansV3Response;
import java.util.ArrayList;

public class ExampleDescribeLLMSpansV3 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BcmClient client = new BcmClient(config);
        DescribeLLMSpansV3Request describeLLMSpansV3Request = new DescribeLLMSpansV3Request();
        describeLLMSpansV3Request.setBeginDatetime("");
        describeLLMSpansV3Request.setEndDatetime("");
        describeLLMSpansV3Request.setParseLLMInputOutput(false);
        describeLLMSpansV3Request.setFilters(new ArrayList<>());
        describeLLMSpansV3Request.setOrderBy("");
        describeLLMSpansV3Request.setOrder("");
        describeLLMSpansV3Request.setMarker("");
        try {
            DescribeLLMSpansV3Response response = client.describeLLMSpansV3(describeLLMSpansV3Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
