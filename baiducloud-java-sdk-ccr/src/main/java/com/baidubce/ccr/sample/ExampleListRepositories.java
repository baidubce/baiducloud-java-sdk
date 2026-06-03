package com.baidubce.ccr.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.ccr.CcrClient;
import com.baidubce.ccr.models.ListRepositoriesRequest;
import com.baidubce.ccr.models.ListRepositoriesResponse;

public class ExampleListRepositories {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        CcrClient client = new CcrClient(config);
        ListRepositoriesRequest listRepositoriesRequest = new ListRepositoriesRequest();
        listRepositoriesRequest.setInstanceId("");
        listRepositoriesRequest.setProjectName("");
        listRepositoriesRequest.setRepositoryName("");
        listRepositoriesRequest.setPageNo(0);
        listRepositoriesRequest.setPageSize(0);
        try {
            ListRepositoriesResponse response = client.listRepositories(listRepositoriesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
