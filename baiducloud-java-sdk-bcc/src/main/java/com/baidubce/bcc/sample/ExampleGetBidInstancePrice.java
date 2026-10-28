package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.GetBidInstancePriceRequest;
import com.baidubce.bcc.models.GetBidInstancePriceResponse;
import java.util.ArrayList;

public class ExampleGetBidInstancePrice {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        GetBidInstancePriceRequest getBidInstancePriceRequest = new GetBidInstancePriceRequest();
        getBidInstancePriceRequest.setSpec("");
        getBidInstancePriceRequest.setRootDiskSizeInGb(0);
        getBidInstancePriceRequest.setRootDiskStorageType("");
        getBidInstancePriceRequest.setCreateCdsList(new ArrayList<>());
        getBidInstancePriceRequest.setNetworkCapacityInMbps(0);
        getBidInstancePriceRequest.setInternetChargeType("");
        getBidInstancePriceRequest.setPurchaseCount(0);
        getBidInstancePriceRequest.setZoneName("");
        try {
            GetBidInstancePriceResponse response = client.getBidInstancePrice(getBidInstancePriceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
