package com.baidubce.csn.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.csn.CsnClient;
import com.baidubce.csn.models.CreateCsnBpRequest;
import com.baidubce.csn.models.Reservation;
import com.baidubce.csn.models.CreateCsnBpResponse;
import com.baidubce.csn.models.Billing;
import java.util.ArrayList;

public class ExampleCreateCsnBp {
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

        CreateCsnBpRequest createCsnBpRequest = new CreateCsnBpRequest();
        createCsnBpRequest.setClientToken("");
        createCsnBpRequest.setName("");
        createCsnBpRequest.setInterworkType("");
        createCsnBpRequest.setBandwidth(0);
        createCsnBpRequest.setGeographicA("");
        createCsnBpRequest.setGeographicB("");
        createCsnBpRequest.setBilling(billing);
        createCsnBpRequest.setTags(new ArrayList<>());
        try {
            CreateCsnBpResponse response = client.createCsnBp(createCsnBpRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
