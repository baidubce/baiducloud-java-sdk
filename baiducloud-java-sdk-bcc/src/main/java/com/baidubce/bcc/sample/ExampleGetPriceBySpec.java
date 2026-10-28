package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.GetPriceBySpecRequest;
import com.baidubce.bcc.models.GetPriceBySpecResponse;

public class ExampleGetPriceBySpec {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        GetPriceBySpecRequest getPriceBySpecRequest = new GetPriceBySpecRequest();
        getPriceBySpecRequest.setSpecId("");
        getPriceBySpecRequest.setSpec("");
        getPriceBySpecRequest.setPaymentTiming("");
        getPriceBySpecRequest.setZoneName("");
        getPriceBySpecRequest.setPurchaseCount(0);
        getPriceBySpecRequest.setPurchaseLength(0);
        try {
            GetPriceBySpecResponse response = client.getPriceBySpec(getPriceBySpecRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
