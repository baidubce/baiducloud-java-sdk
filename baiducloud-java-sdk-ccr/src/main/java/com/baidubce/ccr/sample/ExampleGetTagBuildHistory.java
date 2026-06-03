package com.baidubce.ccr.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.ccr.CcrClient;
import com.baidubce.ccr.models.GetTagBuildHistoryRequest;
import com.baidubce.ccr.models.GetTagBuildHistoryResponse;

public class ExampleGetTagBuildHistory {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        CcrClient client = new CcrClient(config);
        GetTagBuildHistoryRequest getTagBuildHistoryRequest = new GetTagBuildHistoryRequest();
        getTagBuildHistoryRequest.setInstanceId("");
        getTagBuildHistoryRequest.setProjectName("");
        getTagBuildHistoryRequest.setRepositoryName("");
        getTagBuildHistoryRequest.setTagName("");
        try {
            GetTagBuildHistoryResponse response = client.getTagBuildHistory(getTagBuildHistoryRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
