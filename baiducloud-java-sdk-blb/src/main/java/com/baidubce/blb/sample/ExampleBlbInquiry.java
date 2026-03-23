package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.BlbInquiryRequest;
import com.baidubce.blb.models.Reservation;
import com.baidubce.blb.models.Billing;
import com.baidubce.blb.models.BlbInquiryResponse;

public class ExampleBlbInquiry {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "ak";
        String sk = "sk";
        String endpoint = "endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BlbClient client = new BlbClient(config);
        Billing billing = new Billing();
        billing.setPaymentTiming("Prepaid");
        Reservation reservation = new Reservation();
        reservation.setReservationLength(1);

        billing.setReservation(reservation);

        BlbInquiryRequest blbInquiryRequest = new BlbInquiryRequest();
        blbInquiryRequest.setBlbType("ipv6Application");
        blbInquiryRequest.setPerformanceLevel("small1");
        blbInquiryRequest.setCount(1);
        blbInquiryRequest.setBilling(billing);
        try {
            BlbInquiryResponse response = client.blbInquiry(blbInquiryRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
