package com.baidubce.bls.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bls.BlsClient;
import com.baidubce.bls.models.UpdateLogStoreRequest;
import com.baidubce.bls.models.UpdateLogStoreResponse;
import java.util.ArrayList;

public class ExampleUpdateLogStore {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BlsClient client = new BlsClient(bceClientConfig);
        UpdateLogStoreRequest updateLogStoreRequest = new UpdateLogStoreRequest();
        updateLogStoreRequest.setLogStoreName("");
        updateLogStoreRequest.setProject("");
        updateLogStoreRequest.setRetention(0);
        updateLogStoreRequest.setTags(new ArrayList<>());
        updateLogStoreRequest.setShardCount(0);
        updateLogStoreRequest.setMaxShardCount(0);
        updateLogStoreRequest.setDisableShardAutoSplit(false);
        updateLogStoreRequest.setIndexEnabled(false);
        updateLogStoreRequest.setHotRetention(0);
        try {
            UpdateLogStoreResponse response = client.updateLogStore(updateLogStoreRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
