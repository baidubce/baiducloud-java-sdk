package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeLLMDimensionValuesV3Request;
import com.baidubce.bcm.models.DescribeLLMDimensionValuesV3Response;
import java.util.ArrayList;

public class ExampleDescribeLLMDimensionValuesV3 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BcmClient client = new BcmClient(config);
        DescribeLLMDimensionValuesV3Request describeLLMDimensionValuesV3Request = new DescribeLLMDimensionValuesV3Request();
        describeLLMDimensionValuesV3Request.setBeginDatetime("");
        describeLLMDimensionValuesV3Request.setEndDatetime("");
        describeLLMDimensionValuesV3Request.setKey("");
        describeLLMDimensionValuesV3Request.setFilters(new ArrayList<>());
        try {
            DescribeLLMDimensionValuesV3Response response = client.describeLLMDimensionValuesV3(describeLLMDimensionValuesV3Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
