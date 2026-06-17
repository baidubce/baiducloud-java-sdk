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
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
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
