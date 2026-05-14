package com.baidubce.snic.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.snic.SnicClient;
import com.baidubce.snic.models.CreateSnicRequest;
import com.baidubce.snic.models.Reservation;
import com.baidubce.snic.models.Billing;
import com.baidubce.snic.models.CreateSnicResponse;
import java.util.ArrayList;

public class ExampleCreateSnic {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        SnicClient client = new SnicClient(config);
        Billing billing = new Billing();
        billing.setPaymentTiming("");
        Reservation reservation = new Reservation();
        reservation.setReservationLength(0);
        reservation.setReservationTimeUnit("");

        billing.setReservation(reservation);

        CreateSnicRequest createSnicRequest = new CreateSnicRequest();
        createSnicRequest.setClientToken("");
        createSnicRequest.setVpcId("");
        createSnicRequest.setName("");
        createSnicRequest.setSubnetId("");
        createSnicRequest.setService("");
        createSnicRequest.setDescription("");
        createSnicRequest.setIpAddress("");
        createSnicRequest.setBandwidth(0);
        createSnicRequest.setBilling(billing);
        createSnicRequest.setTags(new ArrayList<>());
        createSnicRequest.setResourceGroupId("");
        try {
            CreateSnicResponse response = client.createSnic(createSnicRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
