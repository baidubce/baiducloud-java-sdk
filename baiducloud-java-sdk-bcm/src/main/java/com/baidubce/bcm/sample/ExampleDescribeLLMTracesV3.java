package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeLLMTracesV3Request;
import com.baidubce.bcm.models.DescribeLLMTracesV3Response;
import java.util.ArrayList;

public class ExampleDescribeLLMTracesV3 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BcmClient client = new BcmClient(config);
        DescribeLLMTracesV3Request describeLLMTracesV3Request = new DescribeLLMTracesV3Request();
        describeLLMTracesV3Request.setBeginDatetime("");
        describeLLMTracesV3Request.setEndDatetime("");
        describeLLMTracesV3Request.setFilters(new ArrayList<>());
        describeLLMTracesV3Request.setOrderBy("");
        describeLLMTracesV3Request.setOrder("");
        describeLLMTracesV3Request.setPageNo(0);
        describeLLMTracesV3Request.setPageSize(0);
        try {
            DescribeLLMTracesV3Response response = client.describeLLMTracesV3(describeLLMTracesV3Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
