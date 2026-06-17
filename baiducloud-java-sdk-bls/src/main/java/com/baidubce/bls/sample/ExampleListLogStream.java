package com.baidubce.bls.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bls.BlsClient;
import com.baidubce.bls.models.ListLogStreamRequest;
import com.baidubce.bls.models.ListLogStreamResponse;

public class ExampleListLogStream {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BlsClient client = new BlsClient(bceClientConfig);
        ListLogStreamRequest listLogStreamRequest = new ListLogStreamRequest();
        listLogStreamRequest.setProject("");
        listLogStreamRequest.setLogStoreName("");
        listLogStreamRequest.setNamePattern("");
        listLogStreamRequest.setOrder("");
        listLogStreamRequest.setOrderBy("");
        listLogStreamRequest.setPageNo(0);
        listLogStreamRequest.setPageSize(0);
        try {
            ListLogStreamResponse response = client.listLogStream(listLogStreamRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
