package com.baidubce.eip.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.eip.EipClient;
import com.baidubce.eip.models.SharedBandwidthInquiryRequest;
import com.baidubce.eip.models.Reservation;
import com.baidubce.eip.models.Billing;
import com.baidubce.eip.models.SharedBandwidthInquiryResponse;

public class ExampleSharedBandwidthInquiry {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        EipClient client = new EipClient(config);
        Billing billing = new Billing();
        billing.setPaymentTiming("");
        billing.setBillingMethod("");
        Reservation reservation = new Reservation();
        reservation.setReservationLength(0);
        reservation.setReservationTimeUnit("");

        billing.setReservation(reservation);

        SharedBandwidthInquiryRequest sharedBandwidthInquiryRequest = new SharedBandwidthInquiryRequest();
        sharedBandwidthInquiryRequest.setBandwidthInMbps(0);
        sharedBandwidthInquiryRequest.setCount(0);
        sharedBandwidthInquiryRequest.setIpNum(0);
        sharedBandwidthInquiryRequest.setBilling(billing);
        try {
            SharedBandwidthInquiryResponse response = client.sharedBandwidthInquiry(sharedBandwidthInquiryRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
