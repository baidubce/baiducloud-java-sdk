package com.baidubce.aihc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.aihc.AihcClient;
import com.baidubce.aihc.models.NewModelVersionV2Request;
import com.baidubce.aihc.models.NewModelVersionV2Response;

public class ExampleNewModelVersionV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        AihcClient client = new AihcClient(bceClientConfig);
        NewModelVersionV2Request newModelVersionV2Request = new NewModelVersionV2Request();
        newModelVersionV2Request.setStorageBucket("");
        newModelVersionV2Request.setStoragePath("");
        newModelVersionV2Request.setDescription("");
        newModelVersionV2Request.setSource("");
        newModelVersionV2Request.setModelMetrics("");
        try {
            NewModelVersionV2Response response = client.newModelVersionV2(newModelVersionV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
