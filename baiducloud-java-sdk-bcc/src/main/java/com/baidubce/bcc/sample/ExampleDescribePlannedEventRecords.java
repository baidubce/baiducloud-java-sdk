package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.DescribePlannedEventRecordsRequest;
import com.baidubce.bcc.models.DescribePlannedEventRecordsResponse;
import java.util.ArrayList;

public class ExampleDescribePlannedEventRecords {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        DescribePlannedEventRecordsRequest describePlannedEventRecordsRequest = new DescribePlannedEventRecordsRequest();
        describePlannedEventRecordsRequest.setAction("");
        describePlannedEventRecordsRequest.setServerEventIds(new ArrayList<>());
        describePlannedEventRecordsRequest.setInstanceIds(new ArrayList<>());
        describePlannedEventRecordsRequest.setProductCategory("");
        describePlannedEventRecordsRequest.setServerEventType("");
        describePlannedEventRecordsRequest.setServerEventLogTimeFilter("");
        describePlannedEventRecordsRequest.setPeriodStartTime("");
        describePlannedEventRecordsRequest.setPeriodEndTime("");
        describePlannedEventRecordsRequest.setMaxKeys(0);
        describePlannedEventRecordsRequest.setMarker("");
        try {
            DescribePlannedEventRecordsResponse response = client.describePlannedEventRecords(describePlannedEventRecordsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
