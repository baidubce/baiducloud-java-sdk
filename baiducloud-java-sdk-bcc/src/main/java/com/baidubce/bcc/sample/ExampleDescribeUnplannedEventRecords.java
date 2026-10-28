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
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

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
