package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeLLMSessionsStatisticsV3Request;
import com.baidubce.bcm.models.DescribeLLMSessionsStatisticsV3Response;
import java.util.ArrayList;

public class ExampleDescribeLLMSessionsStatisticsV3 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BcmClient client = new BcmClient(config);
        DescribeLLMSessionsStatisticsV3Request describeLLMSessionsStatisticsV3Request = new DescribeLLMSessionsStatisticsV3Request();
        describeLLMSessionsStatisticsV3Request.setBeginDatetime("");
        describeLLMSessionsStatisticsV3Request.setEndDatetime("");
        describeLLMSessionsStatisticsV3Request.setFilters(new ArrayList<>());
        try {
            DescribeLLMSessionsStatisticsV3Response response = client.describeLLMSessionsStatisticsV3(describeLLMSessionsStatisticsV3Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
