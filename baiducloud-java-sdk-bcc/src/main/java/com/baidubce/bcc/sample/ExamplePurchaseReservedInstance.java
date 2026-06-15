package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.PurchaseReservedInstanceRequest;
import com.baidubce.bcc.models.PurchaseReservedInstanceResponse;
import com.baidubce.bcc.models.Reservation;
import com.baidubce.bcc.models.Billing;
import java.util.ArrayList;

public class ExamplePurchaseReservedInstance {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BccClient client = new BccClient(bceClientConfig);
        Billing billing = new Billing();
        billing.setPaymentTiming("");
        Reservation reservation = new Reservation();
        reservation.setReservationLength(0);
        reservation.setReservationTimeUnit("");

        billing.setReservation(reservation);

        PurchaseReservedInstanceRequest purchaseReservedInstanceRequest = new PurchaseReservedInstanceRequest();
        purchaseReservedInstanceRequest.setInstanceId("");
        purchaseReservedInstanceRequest.setRelatedRenewFlag("");
        purchaseReservedInstanceRequest.setBilling(billing);
        purchaseReservedInstanceRequest.setCdsCustomPeriod(new ArrayList<>());
        try {
            PurchaseReservedInstanceResponse response = client.purchaseReservedInstance(purchaseReservedInstanceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
