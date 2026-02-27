package com.baidubce.eip.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.eip.EipClient;
import com.baidubce.eip.models.EipInquiryRequest;
import com.baidubce.eip.models.Reservation;
import com.baidubce.eip.models.EipInquiryResponse;
import com.baidubce.eip.models.Billing;

public class ExampleEipInquiry {
  public static void main(String[] args) {
    // 设置Client的Access Key ID和Secret Access
    // Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
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

    EipInquiryRequest eipInquiryRequest = new EipInquiryRequest();
    eipInquiryRequest.setBandwidthInMbps(0);
    eipInquiryRequest.setCount(0);
    eipInquiryRequest.setPurchaseType("");
    eipInquiryRequest.setBilling(billing);
    try {
      EipInquiryResponse response = client.eipInquiry(eipInquiryRequest);
      System.out.println(response.toJsonString());
    } catch (BceClientException e) {
      System.out.println(e.getMessage());
    }
  }
}
