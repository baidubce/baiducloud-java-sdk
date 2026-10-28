package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.ListAvailableResizeSpecRequest;
import com.baidubce.bcc.models.ListAvailableResizeSpecResponse;
import java.util.ArrayList;

public class ExampleListAvailableResizeSpec {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        ListAvailableResizeSpecRequest listAvailableResizeSpecRequest = new ListAvailableResizeSpecRequest();
        listAvailableResizeSpecRequest.setSpec("");
        listAvailableResizeSpecRequest.setSpecId("");
        listAvailableResizeSpecRequest.setZone("");
        listAvailableResizeSpecRequest.setInstanceIdList(new ArrayList<>());
        try {
            ListAvailableResizeSpecResponse response = client.listAvailableResizeSpec(listAvailableResizeSpecRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
