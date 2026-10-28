package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.GetReservedInstancePriceRequest;
import com.baidubce.bcc.models.GetReservedInstancePriceResponse;

public class ExampleGetReservedInstancePrice {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        GetReservedInstancePriceRequest getReservedInstancePriceRequest = new GetReservedInstancePriceRequest();
        getReservedInstancePriceRequest.setSpecId("");
        getReservedInstancePriceRequest.setSpec("");
        getReservedInstancePriceRequest.setOfferingType("");
        getReservedInstancePriceRequest.setScope("");
        getReservedInstancePriceRequest.setZoneName("");
        getReservedInstancePriceRequest.setReservedInstanceCount(0);
        getReservedInstancePriceRequest.setPriceTimeUnit("");
        getReservedInstancePriceRequest.setReservedInstanceTime(0);
        getReservedInstancePriceRequest.setPurchaseNum(0);
        try {
            GetReservedInstancePriceResponse response = client.getReservedInstancePrice(getReservedInstancePriceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
