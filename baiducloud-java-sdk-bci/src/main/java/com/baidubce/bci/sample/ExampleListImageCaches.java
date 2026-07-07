package com.baidubce.bci.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bci.BciClient;
import com.baidubce.bci.models.ListImageCachesRequest;
import com.baidubce.bci.models.ListImageCachesResponse;

public class ExampleListImageCaches {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BciClient client = new BciClient(bceClientConfig);
        ListImageCachesRequest listImageCachesRequest = new ListImageCachesRequest();
        listImageCachesRequest.setPageSize(0);
        listImageCachesRequest.setPageNo(0);
        try {
            ListImageCachesResponse response = client.listImageCaches(listImageCachesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
