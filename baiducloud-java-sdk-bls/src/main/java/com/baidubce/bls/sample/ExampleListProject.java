package com.baidubce.bls.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bls.BlsClient;
import com.baidubce.bls.models.ListProjectRequest;
import com.baidubce.bls.models.ListProjectResponse;

public class ExampleListProject {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BlsClient client = new BlsClient(config);
        ListProjectRequest listProjectRequest = new ListProjectRequest();
        listProjectRequest.setName("");
        listProjectRequest.setDescription("");
        listProjectRequest.setOrderBy("");
        listProjectRequest.setOrder("");
        listProjectRequest.setPageNo(0);
        listProjectRequest.setPageSize(0);
        try {
            ListProjectResponse response = client.listProject(listProjectRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
