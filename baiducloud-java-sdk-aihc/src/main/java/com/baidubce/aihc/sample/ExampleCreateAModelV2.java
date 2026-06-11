package com.baidubce.aihc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.aihc.AihcClient;
import com.baidubce.aihc.models.CreateAModelV2Request;
import com.baidubce.aihc.models.ModelVersionEntry;
import com.baidubce.aihc.models.CreateAModelV2Response;

public class ExampleCreateAModelV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        AihcClient client = new AihcClient(bceClientConfig);
        ModelVersionEntry initVersionEntry = new ModelVersionEntry();
        initVersionEntry.setId("");
        initVersionEntry.setVersion("");
        initVersionEntry.setSource("");
        initVersionEntry.setStorageBucket("");
        initVersionEntry.setStoragePath("");
        initVersionEntry.setModelMetrics("");
        initVersionEntry.setDescription("");

        CreateAModelV2Request createAModelV2Request = new CreateAModelV2Request();
        createAModelV2Request.setName("");
        createAModelV2Request.setDescription("");
        createAModelV2Request.setModelFormat("");
        createAModelV2Request.setOwner("");
        createAModelV2Request.setVisibilityScope("");
        createAModelV2Request.setInitVersionEntry(initVersionEntry);
        try {
            CreateAModelV2Response response = client.createAModelV2(createAModelV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
