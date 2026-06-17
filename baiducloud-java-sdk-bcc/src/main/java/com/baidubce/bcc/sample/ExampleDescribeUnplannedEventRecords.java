package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.DescribeUnplannedEventRecordsRequest;
import com.baidubce.bcc.models.DescribeUnplannedEventRecordsResponse;
import java.util.ArrayList;

public class ExampleDescribeUnplannedEventRecords {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BccClient client = new BccClient(bceClientConfig);
        DescribeUnplannedEventRecordsRequest describeUnplannedEventRecordsRequest = new DescribeUnplannedEventRecordsRequest();
        describeUnplannedEventRecordsRequest.setAction("");
        describeUnplannedEventRecordsRequest.setServerEventIds(new ArrayList<>());
        describeUnplannedEventRecordsRequest.setInstanceIds(new ArrayList<>());
        describeUnplannedEventRecordsRequest.setProductCategory("");
        describeUnplannedEventRecordsRequest.setServerEventType("");
        describeUnplannedEventRecordsRequest.setServerEventLogTimeFilter("");
        describeUnplannedEventRecordsRequest.setPeriodStartTime("");
        describeUnplannedEventRecordsRequest.setPeriodEndTime("");
        describeUnplannedEventRecordsRequest.setMaxKeys(0);
        describeUnplannedEventRecordsRequest.setMarker("");
        try {
            DescribeUnplannedEventRecordsResponse response = client.describeUnplannedEventRecords(describeUnplannedEventRecordsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
