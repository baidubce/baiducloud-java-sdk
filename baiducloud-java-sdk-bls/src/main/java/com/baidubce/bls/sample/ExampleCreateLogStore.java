package com.baidubce.bls.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bls.BlsClient;
import com.baidubce.bls.models.CreateLogStoreRequest;
import com.baidubce.bls.models.CreateLogStoreResponse;
import com.baidubce.bls.models.Index;
import java.util.HashMap;
import java.util.ArrayList;

public class ExampleCreateLogStore {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BlsClient client = new BlsClient(bceClientConfig);
        Index index = new Index();
        index.setFulltext(false);
        index.setCaseSensitive(false);
        index.setIncludeChinese(false);
        index.setSeparators("");
        index.setFields(new HashMap<>());

        CreateLogStoreRequest createLogStoreRequest = new CreateLogStoreRequest();
        createLogStoreRequest.setProject("");
        createLogStoreRequest.setLogStoreName("");
        createLogStoreRequest.setRetention(0);
        createLogStoreRequest.setTags(new ArrayList<>());
        createLogStoreRequest.setIndex(index);
        createLogStoreRequest.setShardCount(0);
        createLogStoreRequest.setMaxShardCount(0);
        createLogStoreRequest.setDisableShardAutoSplit(false);
        createLogStoreRequest.setIndexEnabled(false);
        createLogStoreRequest.setHotRetention(0);
        createLogStoreRequest.setEnableHotRetention(false);
        try {
            CreateLogStoreResponse response = client.createLogStore(createLogStoreRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
