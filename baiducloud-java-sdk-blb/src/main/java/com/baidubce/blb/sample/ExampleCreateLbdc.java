package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.CreateLbdcRequest;
import com.baidubce.blb.models.ReservationForCreate;
import com.baidubce.blb.models.BillingForCreate;
import com.baidubce.blb.models.CreateLbdcResponse;
import java.util.ArrayList;

public class ExampleCreateLbdc {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        BillingForCreate billing = new BillingForCreate();
        billing.setPaymentTiming("");
        billing.setBillingMethod("");
        ReservationForCreate reservation = new ReservationForCreate();
        reservation.setReservationLength(0);

        billing.setReservation(reservation);

        ReservationForCreate renewReservation = new ReservationForCreate();
        renewReservation.setReservationLength(0);

        CreateLbdcRequest createLbdcRequest = new CreateLbdcRequest();
        createLbdcRequest.setClientToken("");
        createLbdcRequest.setName("");
        createLbdcRequest.setType("");
        createLbdcRequest.setCcuCount(0);
        createLbdcRequest.setDesc("");
        createLbdcRequest.setBilling(billing);
        createLbdcRequest.setRenewReservation(renewReservation);
        createLbdcRequest.setTags(new ArrayList<>());
        try {
            CreateLbdcResponse response = client.createLbdc(createLbdcRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
