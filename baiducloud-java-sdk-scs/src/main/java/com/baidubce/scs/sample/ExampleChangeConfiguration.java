package com.baidubce.scs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.scs.ScsClient;
import com.baidubce.scs.models.ChangeConfigurationRequest;
import com.baidubce.scs.models.Reservation;
import com.baidubce.scs.models.ChangeConfigurationResponse;
import com.baidubce.scs.models.Billing;

public class ExampleChangeConfiguration {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        ScsClient client = new ScsClient(bceClientConfig);
        Billing billing = new Billing();
        billing.setPaymentTiming("");
        Reservation reservation = new Reservation();
        reservation.setReservationLength(0);
        reservation.setReservationTimeUnit("");

        billing.setReservation(reservation);

        ChangeConfigurationRequest changeConfigurationRequest = new ChangeConfigurationRequest();
        changeConfigurationRequest.setInstanceId("");
        changeConfigurationRequest.setClientToken("");
        changeConfigurationRequest.setBilling(billing);
        changeConfigurationRequest.setEngineVersion("");
        changeConfigurationRequest.setNodeType("");
        changeConfigurationRequest.setShardNum(0);
        changeConfigurationRequest.setDiskFlavor(0);
        try {
            ChangeConfigurationResponse response = client.changeConfiguration(changeConfigurationRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
