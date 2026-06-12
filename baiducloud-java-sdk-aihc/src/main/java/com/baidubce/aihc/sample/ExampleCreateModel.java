package com.baidubce.aihc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.aihc.AihcClient;
import com.baidubce.aihc.models.CreateModelRequest;
import com.baidubce.aihc.models.ModelVersionEntry;
import com.baidubce.aihc.models.CreateModelResponse;

public class ExampleCreateModel {
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

        CreateModelRequest createModelRequest = new CreateModelRequest();
        createModelRequest.setName("");
        createModelRequest.setDescription("");
        createModelRequest.setModelFormat("");
        createModelRequest.setOwner("");
        createModelRequest.setVisibilityScope("");
        createModelRequest.setInitVersionEntry(initVersionEntry);
        try {
            CreateModelResponse response = client.createModel(createModelRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
