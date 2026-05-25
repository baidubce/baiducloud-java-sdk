package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeLLMSessionV3Request;
import com.baidubce.bcm.models.DescribeLLMSessionV3Response;

public class ExampleDescribeLLMSessionV3 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BcmClient client = new BcmClient(config);
        DescribeLLMSessionV3Request describeLLMSessionV3Request = new DescribeLLMSessionV3Request();
        describeLLMSessionV3Request.setSessionID("");
        describeLLMSessionV3Request.setBeginDatetime("");
        describeLLMSessionV3Request.setEndDatetime("");
        try {
            DescribeLLMSessionV3Response response = client.describeLLMSessionV3(describeLLMSessionV3Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
