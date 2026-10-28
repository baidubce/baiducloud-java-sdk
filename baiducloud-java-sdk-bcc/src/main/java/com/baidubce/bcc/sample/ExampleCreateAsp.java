package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.CreateAspRequest;
import com.baidubce.bcc.models.CreateAspResponse;
import java.util.ArrayList;

public class ExampleCreateAsp {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        CreateAspRequest createAspRequest = new CreateAspRequest();
        createAspRequest.setName("");
        createAspRequest.setTimePoints(new ArrayList<>());
        createAspRequest.setRepeatWeekdays(new ArrayList<>());
        createAspRequest.setRetentionDays("");
        try {
            CreateAspResponse response = client.createAsp(createAspRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
