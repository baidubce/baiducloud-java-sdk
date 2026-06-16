package com.baidubce.bls.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bls.BlsClient;
import com.baidubce.bls.models.ListDownloadTaskRequest;
import com.baidubce.bls.models.ListDownloadTaskResponse;

public class ExampleListDownloadTask {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BlsClient client = new BlsClient(bceClientConfig);
        ListDownloadTaskRequest listDownloadTaskRequest = new ListDownloadTaskRequest();
        listDownloadTaskRequest.setProject("");
        listDownloadTaskRequest.setLogStoreName("");
        listDownloadTaskRequest.setOrderBy("");
        listDownloadTaskRequest.setOrder("");
        listDownloadTaskRequest.setPageNo(0);
        listDownloadTaskRequest.setPageSize(0);
        try {
            ListDownloadTaskResponse response = client.listDownloadTask(listDownloadTaskRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
