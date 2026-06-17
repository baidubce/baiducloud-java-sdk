package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.DescribeUnplannedEventsRequest;
import com.baidubce.bcc.models.DescribeUnplannedEventsResponse;
import java.util.ArrayList;

public class ExampleDescribeUnplannedEvents {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BccClient client = new BccClient(bceClientConfig);
        DescribeUnplannedEventsRequest describeUnplannedEventsRequest = new DescribeUnplannedEventsRequest();
        describeUnplannedEventsRequest.setAction("");
        describeUnplannedEventsRequest.setServerEventStatus("");
        describeUnplannedEventsRequest.setServerEventIds(new ArrayList<>());
        describeUnplannedEventsRequest.setInstanceIds(new ArrayList<>());
        describeUnplannedEventsRequest.setProductCategory("");
        describeUnplannedEventsRequest.setServerEventType("");
        describeUnplannedEventsRequest.setServerEventLogTimeFilter("");
        describeUnplannedEventsRequest.setPeriodStartTime("");
        describeUnplannedEventsRequest.setPeriodEndTime("");
        describeUnplannedEventsRequest.setMaxKeys(0);
        describeUnplannedEventsRequest.setMarker("");
        try {
            DescribeUnplannedEventsResponse response = client.describeUnplannedEvents(describeUnplannedEventsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
