package com.baidubce.dns.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dns.DnsClient;
import com.baidubce.dns.models.CreatePaidZoneRequest;
import com.baidubce.dns.models.Reservation;
import com.baidubce.dns.models.Billing;
import java.util.ArrayList;

public class ExampleCreatePaidZone {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        DnsClient client = new DnsClient(bceClientConfig);
        Billing billing = new Billing();
        billing.setPaymentTiming("");
        Reservation reservation = new Reservation();
        reservation.setReservationLength(0);

        billing.setReservation(reservation);

        CreatePaidZoneRequest createPaidZoneRequest = new CreatePaidZoneRequest();
        createPaidZoneRequest.setClientToken("");
        createPaidZoneRequest.setNames(new ArrayList<>());
        createPaidZoneRequest.setProductVersion("");
        createPaidZoneRequest.setBilling(billing);
        try {
            client.createPaidZone(createPaidZoneRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
