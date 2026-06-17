package com.baidubce.bls.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bls.BlsClient;
import com.baidubce.bls.models.CreateFastQueryRequest;
import com.baidubce.bls.models.CreateFastQueryResponse;

public class ExampleCreateFastQuery {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BlsClient client = new BlsClient(bceClientConfig);
        CreateFastQueryRequest createFastQueryRequest = new CreateFastQueryRequest();
        createFastQueryRequest.setFastQueryName("");
        createFastQueryRequest.setQuery("");
        createFastQueryRequest.setDescription("");
        createFastQueryRequest.setProject("");
        createFastQueryRequest.setLogStoreName("");
        createFastQueryRequest.setLogStreamName("");
        try {
            CreateFastQueryResponse response = client.createFastQuery(createFastQueryRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
