package com.baidubce.csn.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.csn.CsnClient;
import com.baidubce.csn.models.QueryCsnBpPriceRequest;
import com.baidubce.csn.models.Reservation;
import com.baidubce.csn.models.Billing;
import com.baidubce.csn.models.QueryCsnBpPriceResponse;

public class ExampleQueryCsnBpPrice {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        CsnClient client = new CsnClient(config);
        Billing billing = new Billing();
        billing.setPaymentTiming("");
        billing.setBillingMethod("");
        Reservation reservation = new Reservation();
        reservation.setReservationLength(0);
        reservation.setReservationTimeUnit("");

        billing.setReservation(reservation);

        QueryCsnBpPriceRequest queryCsnBpPriceRequest = new QueryCsnBpPriceRequest();
        queryCsnBpPriceRequest.setName("");
        queryCsnBpPriceRequest.setBandwidth(0);
        queryCsnBpPriceRequest.setGeographicA("");
        queryCsnBpPriceRequest.setGeographicB("");
        queryCsnBpPriceRequest.setBilling(billing);
        try {
            QueryCsnBpPriceResponse response = client.queryCsnBpPrice(queryCsnBpPriceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
