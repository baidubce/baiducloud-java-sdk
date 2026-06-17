package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.GetReservedInstancePriceRequest;
import com.baidubce.bcc.models.GetReservedInstancePriceResponse;

public class ExampleGetReservedInstancePrice {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
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
