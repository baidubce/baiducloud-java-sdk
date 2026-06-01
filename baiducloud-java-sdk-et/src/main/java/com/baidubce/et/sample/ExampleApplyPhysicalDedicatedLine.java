package com.baidubce.et.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.et.EtClient;
import com.baidubce.et.models.ApplyPhysicalDedicatedLineRequest;
import com.baidubce.et.models.ApplyPhysicalDedicatedLineResponse;
import com.baidubce.et.models.Reservation;
import com.baidubce.et.models.Billing;
import java.util.ArrayList;

public class ExampleApplyPhysicalDedicatedLine {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        EtClient client = new EtClient(config);
        Billing billing = new Billing();
        billing.setPaymentTiming("");
        Reservation reservation = new Reservation();
        reservation.setReservationLength(0);
        reservation.setReservationTimeUnit("");

        billing.setReservation(reservation);

        Reservation autoRenew = new Reservation();
        autoRenew.setReservationLength(0);
        autoRenew.setReservationTimeUnit("");

        ApplyPhysicalDedicatedLineRequest applyPhysicalDedicatedLineRequest = new ApplyPhysicalDedicatedLineRequest();
        applyPhysicalDedicatedLineRequest.setClientToken("");
        applyPhysicalDedicatedLineRequest.setName("");
        applyPhysicalDedicatedLineRequest.setDescription("");
        applyPhysicalDedicatedLineRequest.setIsp("");
        applyPhysicalDedicatedLineRequest.setIntfType("");
        applyPhysicalDedicatedLineRequest.setApType("");
        applyPhysicalDedicatedLineRequest.setApAddr("");
        applyPhysicalDedicatedLineRequest.setLinkDelay(0);
        applyPhysicalDedicatedLineRequest.setUserName("");
        applyPhysicalDedicatedLineRequest.setUserPhone("");
        applyPhysicalDedicatedLineRequest.setUserEmail("");
        applyPhysicalDedicatedLineRequest.setUserIdc("");
        applyPhysicalDedicatedLineRequest.setBilling(billing);
        applyPhysicalDedicatedLineRequest.setAutoRenew(autoRenew);
        applyPhysicalDedicatedLineRequest.setTags(new ArrayList<>());
        try {
            ApplyPhysicalDedicatedLineResponse response = client.applyPhysicalDedicatedLine(applyPhysicalDedicatedLineRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
