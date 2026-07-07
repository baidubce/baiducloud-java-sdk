package com.baidubce.bci.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bci.BciClient;
import com.baidubce.bci.models.BatchDeleteImageCachesRequest;
import java.util.ArrayList;

public class ExampleBatchDeleteImageCaches {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BciClient client = new BciClient(bceClientConfig);
        BatchDeleteImageCachesRequest batchDeleteImageCachesRequest = new BatchDeleteImageCachesRequest();
        batchDeleteImageCachesRequest.setImageCacheIds(new ArrayList<>());
        try {
            client.batchDeleteImageCaches(batchDeleteImageCachesRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
