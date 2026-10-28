package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.DescribePlannedEventsRequest;
import com.baidubce.bcc.models.DescribePlannedEventsResponse;
import java.util.ArrayList;

public class ExampleDescribePlannedEvents {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        DescribePlannedEventsRequest describePlannedEventsRequest = new DescribePlannedEventsRequest();
        describePlannedEventsRequest.setAction("");
        describePlannedEventsRequest.setServerEventStatus("");
        describePlannedEventsRequest.setServerEventIds(new ArrayList<>());
        describePlannedEventsRequest.setInstanceIds(new ArrayList<>());
        describePlannedEventsRequest.setProductCategory("");
        describePlannedEventsRequest.setServerEventType("");
        describePlannedEventsRequest.setServerEventLogTimeFilter("");
        describePlannedEventsRequest.setPeriodStartTime("");
        describePlannedEventsRequest.setPeriodEndTime("");
        describePlannedEventsRequest.setMaxKeys(0);
        describePlannedEventsRequest.setMarker("");
        try {
            DescribePlannedEventsResponse response = client.describePlannedEvents(describePlannedEventsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
