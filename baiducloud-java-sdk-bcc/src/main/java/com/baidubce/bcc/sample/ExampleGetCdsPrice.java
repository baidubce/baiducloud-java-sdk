package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.GetCdsPriceRequest;
import com.baidubce.bcc.models.GetCdsPriceResponse;

public class ExampleGetCdsPrice {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        GetCdsPriceRequest getCdsPriceRequest = new GetCdsPriceRequest();
        getCdsPriceRequest.setStorageType("");
        getCdsPriceRequest.setCdsSizeInGB(0);
        getCdsPriceRequest.setPaymentTiming("");
        getCdsPriceRequest.setZoneName("");
        getCdsPriceRequest.setPurchaseCount(0);
        getCdsPriceRequest.setPurchaseLength(0);
        getCdsPriceRequest.setCdsExtraIo(0);
        try {
            GetCdsPriceResponse response = client.getCdsPrice(getCdsPriceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
