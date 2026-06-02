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
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BlbClient client = new BlbClient(config);
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
