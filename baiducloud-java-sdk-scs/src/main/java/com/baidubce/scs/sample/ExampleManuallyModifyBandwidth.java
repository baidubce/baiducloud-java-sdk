package com.baidubce.scs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.scs.ScsClient;
import com.baidubce.scs.models.ManuallyModifyBandwidthRequest;
import com.baidubce.scs.models.ManuallyModifyBandwidthResponse;
import java.util.ArrayList;

public class ExampleManuallyModifyBandwidth {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        ScsClient client = new ScsClient(bceClientConfig);
        ManuallyModifyBandwidthRequest manuallyModifyBandwidthRequest = new ManuallyModifyBandwidthRequest();
        manuallyModifyBandwidthRequest.setInstanceId("");
        manuallyModifyBandwidthRequest.setShardBandwidthInfo(new ArrayList<>());
        try {
            ManuallyModifyBandwidthResponse response = client.manuallyModifyBandwidth(manuallyModifyBandwidthRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
