package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.PurchaseReservedVolumeClusterRequest;
import com.baidubce.bcc.models.Reservation;
import com.baidubce.bcc.models.Billing;
import com.baidubce.bcc.models.PurchaseReservedVolumeClusterResponse;

public class ExamplePurchaseReservedVolumeCluster {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        Billing billing = new Billing();
        billing.setPaymentTiming("");
        Reservation reservation = new Reservation();
        reservation.setReservationLength(0);
        reservation.setReservationTimeUnit("");

        billing.setReservation(reservation);

        PurchaseReservedVolumeClusterRequest purchaseReservedVolumeClusterRequest = new PurchaseReservedVolumeClusterRequest();
        purchaseReservedVolumeClusterRequest.setClusterId("");
        purchaseReservedVolumeClusterRequest.setBilling(billing);
        try {
            PurchaseReservedVolumeClusterResponse response = client.purchaseReservedVolumeCluster(purchaseReservedVolumeClusterRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
