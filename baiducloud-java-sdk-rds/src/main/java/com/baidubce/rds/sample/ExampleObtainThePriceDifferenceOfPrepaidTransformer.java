package com.baidubce.rds.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rds.RdsClient;
import com.baidubce.rds.models.ObtainThePriceDifferenceOfPrepaidTransformerRequest;
import com.baidubce.rds.models.ObtainThePriceDifferenceOfPrepaidTransformerResponse;

public class ExampleObtainThePriceDifferenceOfPrepaidTransformer {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        RdsClient client = new RdsClient(bceClientConfig);
        ObtainThePriceDifferenceOfPrepaidTransformerRequest obtainThePriceDifferenceOfPrepaidTransformerRequest = new ObtainThePriceDifferenceOfPrepaidTransformerRequest();
        obtainThePriceDifferenceOfPrepaidTransformerRequest.setInstanceId("");
        obtainThePriceDifferenceOfPrepaidTransformerRequest.setCpuCount(0);
        obtainThePriceDifferenceOfPrepaidTransformerRequest.setAllocatedMemoryInGB(0);
        obtainThePriceDifferenceOfPrepaidTransformerRequest.setAllocatedStorageInGB(0);
        obtainThePriceDifferenceOfPrepaidTransformerRequest.setDiskIoType("");
        obtainThePriceDifferenceOfPrepaidTransformerRequest.setCategory("");
        try {
            ObtainThePriceDifferenceOfPrepaidTransformerResponse response =
                    client.obtainThePriceDifferenceOfPrepaidTransformer(obtainThePriceDifferenceOfPrepaidTransformerRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
