package com.baidubce.rapidfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rapidfs.RapidfsClient;
import com.baidubce.rapidfs.models.DescribeMetaSyncJobsRequest;
import com.baidubce.rapidfs.models.DescribeMetaSyncJobsResponse;

public class ExampleDescribeMetaSyncJobs {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        RapidfsClient client = new RapidfsClient(bceClientConfig);
        DescribeMetaSyncJobsRequest describeMetaSyncJobsRequest = new DescribeMetaSyncJobsRequest();
        describeMetaSyncJobsRequest.setInstanceId("");
        describeMetaSyncJobsRequest.setDataSrcId("");
        describeMetaSyncJobsRequest.setMetaSyncRuleId("");
        describeMetaSyncJobsRequest.setMaxKeys(0);
        describeMetaSyncJobsRequest.setMarker("");
        try {
            DescribeMetaSyncJobsResponse response = client.describeMetaSyncJobs(describeMetaSyncJobsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
