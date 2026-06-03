package com.baidubce.rapidfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rapidfs.RapidfsClient;
import com.baidubce.rapidfs.models.DescribeCacheNodeRequest;
import com.baidubce.rapidfs.models.DescribeCacheNodeResponse;

public class ExampleDescribeCacheNode {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        RapidfsClient client = new RapidfsClient(config);
        DescribeCacheNodeRequest describeCacheNodeRequest = new DescribeCacheNodeRequest();
        describeCacheNodeRequest.setInstanceId("");
        describeCacheNodeRequest.setCacheNodeId("");
        try {
            DescribeCacheNodeResponse response = client.describeCacheNode(describeCacheNodeRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
