package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeLLMTracesStatisticsV3Request;
import com.baidubce.bcm.models.DescribeLLMTracesStatisticsV3Response;
import java.util.ArrayList;

public class ExampleDescribeLLMTracesStatisticsV3 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BcmClient client = new BcmClient(config);
        DescribeLLMTracesStatisticsV3Request describeLLMTracesStatisticsV3Request = new DescribeLLMTracesStatisticsV3Request();
        describeLLMTracesStatisticsV3Request.setBeginDatetime("");
        describeLLMTracesStatisticsV3Request.setEndDatetime("");
        describeLLMTracesStatisticsV3Request.setFilters(new ArrayList<>());
        try {
            DescribeLLMTracesStatisticsV3Response response = client.describeLLMTracesStatisticsV3(describeLLMTracesStatisticsV3Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
