package com.baidubce.cfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cfs.CfsClient;
import com.baidubce.cfs.models.QueryMountedClientRequest;
import com.baidubce.cfs.models.QueryMountedClientResponse;

public class ExampleQueryMountedClient {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        CfsClient client = new CfsClient(config);
        QueryMountedClientRequest queryMountedClientRequest = new QueryMountedClientRequest();
        queryMountedClientRequest.setFsId("");
        queryMountedClientRequest.setMarker("");
        queryMountedClientRequest.setMaxKeys(0);
        try {
            QueryMountedClientResponse response = client.queryMountedClient(queryMountedClientRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
