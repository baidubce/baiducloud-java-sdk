package com.baidubce.bls.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bls.BlsClient;
import com.baidubce.bls.models.UpdateIndexRequest;
import com.baidubce.bls.models.UpdateIndexResponse;
import java.util.HashMap;

public class ExampleUpdateIndex {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BlsClient client = new BlsClient(bceClientConfig);
        UpdateIndexRequest updateIndexRequest = new UpdateIndexRequest();
        updateIndexRequest.setLogStoreName("");
        updateIndexRequest.setProject("");
        updateIndexRequest.setFulltext(false);
        updateIndexRequest.setCaseSensitive(false);
        updateIndexRequest.setIncludeChinese(false);
        updateIndexRequest.setSeparators("");
        updateIndexRequest.setFields(new HashMap<>());
        try {
            UpdateIndexResponse response = client.updateIndex(updateIndexRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
