package com.baidubce.oos.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.oos.OosClient;
import com.baidubce.oos.models.GetExecutionDetailV2Request;
import com.baidubce.oos.models.GetExecutionDetailV2Response;

public class ExampleGetExecutionDetailV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        OosClient client = new OosClient(bceClientConfig);
        GetExecutionDetailV2Request getExecutionDetailV2Request = new GetExecutionDetailV2Request();
        getExecutionDetailV2Request.setId("");
        getExecutionDetailV2Request.setNamespace("");
        getExecutionDetailV2Request.setWithLog("");
        getExecutionDetailV2Request.setLocale("");
        try {
            GetExecutionDetailV2Response response = client.getExecutionDetailV2(getExecutionDetailV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
