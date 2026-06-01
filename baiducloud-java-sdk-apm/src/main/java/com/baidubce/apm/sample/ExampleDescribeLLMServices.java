package com.baidubce.apm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.apm.ApmClient;
import com.baidubce.apm.models.DescribeLLMServicesRequest;
import com.baidubce.apm.models.DescribeLLMServicesResponse;
import com.baidubce.apm.models.Tag;

public class ExampleDescribeLLMServices {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        ApmClient client = new ApmClient(config);
        Tag tag = new Tag();
        tag.setKey("");
        tag.setValue("");

        DescribeLLMServicesRequest describeLLMServicesRequest = new DescribeLLMServicesRequest();
        describeLLMServicesRequest.setBeginDatetime("");
        describeLLMServicesRequest.setEndDatetime("");
        describeLLMServicesRequest.setServiceName("");
        describeLLMServicesRequest.setServiceId("");
        describeLLMServicesRequest.setEnv("");
        describeLLMServicesRequest.setTag(tag);
        describeLLMServicesRequest.setOrderBy("");
        describeLLMServicesRequest.setOrder("");
        try {
            DescribeLLMServicesResponse response = client.describeLLMServices(describeLLMServicesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
