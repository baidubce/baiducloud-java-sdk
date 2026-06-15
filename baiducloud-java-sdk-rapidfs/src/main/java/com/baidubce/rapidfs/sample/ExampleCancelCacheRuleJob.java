package com.baidubce.rapidfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rapidfs.RapidfsClient;
import com.baidubce.rapidfs.models.CancelCacheRuleJobRequest;

public class ExampleCancelCacheRuleJob {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        RapidfsClient client = new RapidfsClient(bceClientConfig);
        CancelCacheRuleJobRequest cancelCacheRuleJobRequest = new CancelCacheRuleJobRequest();
        cancelCacheRuleJobRequest.setClientToken("");
        cancelCacheRuleJobRequest.setInstanceId("");
        cancelCacheRuleJobRequest.setDataSrcId("");
        cancelCacheRuleJobRequest.setCacheRuleId("");
        try {
            client.cancelCacheRuleJob(cancelCacheRuleJobRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
