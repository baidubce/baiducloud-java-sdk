package com.baidubce.rapidfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rapidfs.RapidfsClient;
import com.baidubce.rapidfs.models.AddCacheNodesRequest;
import com.baidubce.rapidfs.models.AddCacheNodesResponse;
import java.util.ArrayList;

public class ExampleAddCacheNodes {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        RapidfsClient client = new RapidfsClient(config);
        AddCacheNodesRequest addCacheNodesRequest = new AddCacheNodesRequest();
        addCacheNodesRequest.setClientToken("");
        addCacheNodesRequest.setInstanceId("");
        addCacheNodesRequest.setType("");
        addCacheNodesRequest.setCacheNodes(new ArrayList<>());
        try {
            AddCacheNodesResponse response = client.addCacheNodes(addCacheNodesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
