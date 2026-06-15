package com.baidubce.rapidfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rapidfs.RapidfsClient;
import com.baidubce.rapidfs.models.DescribeCacheRuleJobsRequest;
import com.baidubce.rapidfs.models.DescribeCacheRuleJobsResponse;

public class ExampleDescribeCacheRuleJobs {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        RapidfsClient client = new RapidfsClient(bceClientConfig);
        DescribeCacheRuleJobsRequest describeCacheRuleJobsRequest = new DescribeCacheRuleJobsRequest();
        describeCacheRuleJobsRequest.setInstanceId("");
        describeCacheRuleJobsRequest.setDataSrcId("");
        describeCacheRuleJobsRequest.setCacheRuleId("");
        describeCacheRuleJobsRequest.setMaxKeys(0);
        describeCacheRuleJobsRequest.setMarker("");
        try {
            DescribeCacheRuleJobsResponse response = client.describeCacheRuleJobs(describeCacheRuleJobsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
