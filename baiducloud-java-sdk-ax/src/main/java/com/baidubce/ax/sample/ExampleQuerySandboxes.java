package com.baidubce.ax.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.ax.AxClient;
import com.baidubce.ax.models.QuerySandboxesRequest;
import com.baidubce.ax.models.QuerySandboxesResponse;
import java.util.HashMap;
import java.util.ArrayList;

public class ExampleQuerySandboxes {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        AxClient client = new AxClient(bceClientConfig);
        QuerySandboxesRequest querySandboxesRequest = new QuerySandboxesRequest();
        querySandboxesRequest.setLimit(0);
        querySandboxesRequest.setNextToken("");
        querySandboxesRequest.setSandboxIds(new ArrayList<>());
        querySandboxesRequest.setImagePaths(new ArrayList<>());
        querySandboxesRequest.setMetadata(new HashMap<>());
        querySandboxesRequest.setState(new ArrayList<>());
        try {
            QuerySandboxesResponse response = client.querySandboxes(querySandboxesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
