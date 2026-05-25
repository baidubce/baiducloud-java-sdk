package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeLLMServicesV3Request;
import com.baidubce.bcm.models.DescribeLLMServicesV3Response;
import com.baidubce.bcm.models.Tag;

public class ExampleDescribeLLMServicesV3 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BcmClient client = new BcmClient(config);
        Tag tag = new Tag();
        tag.setKey("");
        tag.setValue("");

        DescribeLLMServicesV3Request describeLLMServicesV3Request = new DescribeLLMServicesV3Request();
        describeLLMServicesV3Request.setBeginDatetime("");
        describeLLMServicesV3Request.setEndDatetime("");
        describeLLMServicesV3Request.setServiceName("");
        describeLLMServicesV3Request.setServiceId("");
        describeLLMServicesV3Request.setEnv("");
        describeLLMServicesV3Request.setTag(tag);
        describeLLMServicesV3Request.setOrderBy("");
        describeLLMServicesV3Request.setOrder("");
        try {
            DescribeLLMServicesV3Response response = client.describeLLMServicesV3(describeLLMServicesV3Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
