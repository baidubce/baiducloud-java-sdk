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
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

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
