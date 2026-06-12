package com.baidubce.bcm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcm.BcmClient;
import com.baidubce.bcm.models.DescribeMetricDataLatestTopRequest;
import com.baidubce.bcm.models.DescribeMetricDataLatestTopResponse;
import java.util.ArrayList;

public class ExampleDescribeMetricDataLatestTop {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BcmClient client = new BcmClient(bceClientConfig);
        DescribeMetricDataLatestTopRequest describeMetricDataLatestTopRequest = new DescribeMetricDataLatestTopRequest();
        describeMetricDataLatestTopRequest.setAction("");
        describeMetricDataLatestTopRequest.setScope("");
        describeMetricDataLatestTopRequest.setRegion("");
        describeMetricDataLatestTopRequest.setEndDatetime("");
        describeMetricDataLatestTopRequest.setMetricName("");
        describeMetricDataLatestTopRequest.setFilters(new ArrayList<>());
        describeMetricDataLatestTopRequest.setLimit(0);
        describeMetricDataLatestTopRequest.setAsc(false);
        describeMetricDataLatestTopRequest.setPeriodSeconds(0);
        describeMetricDataLatestTopRequest.setAggregationOverTime("");
        try {
            DescribeMetricDataLatestTopResponse response = client.describeMetricDataLatestTop(describeMetricDataLatestTopRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
