package com.baidubce.rapidfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rapidfs.RapidfsClient;
import com.baidubce.rapidfs.models.DescribeCacheNodesRequest;
import com.baidubce.rapidfs.models.DescribeCacheNodesResponse;
import java.util.ArrayList;

public class ExampleDescribeCacheNodes {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        RapidfsClient client = new RapidfsClient(config);
        DescribeCacheNodesRequest describeCacheNodesRequest = new DescribeCacheNodesRequest();
        describeCacheNodesRequest.setInstanceId("");
        describeCacheNodesRequest.setFilters(new ArrayList<>());
        describeCacheNodesRequest.setMaxKeys(0);
        describeCacheNodesRequest.setMarker("");
        try {
            DescribeCacheNodesResponse response = client.describeCacheNodes(describeCacheNodesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
