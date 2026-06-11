package com.baidubce.aihc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.aihc.AihcClient;
import com.baidubce.aihc.models.CreateDatasetVersionV2Request;
import com.baidubce.aihc.models.CreateDatasetVersionV2Response;

public class ExampleCreateDatasetVersionV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        AihcClient client = new AihcClient(bceClientConfig);
        CreateDatasetVersionV2Request createDatasetVersionV2Request = new CreateDatasetVersionV2Request();
        createDatasetVersionV2Request.setDescription("");
        createDatasetVersionV2Request.setStoragePath("");
        createDatasetVersionV2Request.setMountPath("");
        try {
            CreateDatasetVersionV2Response response = client.createDatasetVersionV2(createDatasetVersionV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
