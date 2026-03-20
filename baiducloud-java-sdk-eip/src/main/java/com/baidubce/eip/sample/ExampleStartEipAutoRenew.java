package com.baidubce.eip.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.eip.EipClient;
import com.baidubce.eip.models.StartEipAutoRenewRequest;

public class ExampleStartEipAutoRenew {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        EipClient client = new EipClient(config);
        StartEipAutoRenewRequest startEipAutoRenewRequest = new StartEipAutoRenewRequest();
        startEipAutoRenewRequest.setClientToken("");
        startEipAutoRenewRequest.setEip("");
        startEipAutoRenewRequest.setAutoRenewTimeUnit("");
        startEipAutoRenewRequest.setAutoRenewTime(0);
        try {
            client.startEipAutoRenew(startEipAutoRenewRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
