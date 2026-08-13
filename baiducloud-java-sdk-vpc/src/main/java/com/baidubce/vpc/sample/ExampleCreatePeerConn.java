package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreatePeerConnRequest;
import com.baidubce.vpc.models.Reservation;
import com.baidubce.vpc.models.Billing;
import com.baidubce.vpc.models.CreatePeerConnResponse;
import java.util.ArrayList;

public class ExampleCreatePeerConn {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        Billing billing = new Billing();
        billing.setPaymentTiming("");
        Reservation reservation = new Reservation();
        reservation.setReservationLength(0);
        reservation.setReservationTimeUnit("");

        billing.setReservation(reservation);

        CreatePeerConnRequest createPeerConnRequest = new CreatePeerConnRequest();
        createPeerConnRequest.setClientToken("");
        createPeerConnRequest.setBandwidthInMbps(0);
        createPeerConnRequest.setDescription("");
        createPeerConnRequest.setLocalIfName("");
        createPeerConnRequest.setLocalVpcId("");
        createPeerConnRequest.setPeerAccountId("");
        createPeerConnRequest.setPeerVpcId("");
        createPeerConnRequest.setPeerRegion("");
        createPeerConnRequest.setPeerIfName("");
        createPeerConnRequest.setBilling(billing);
        createPeerConnRequest.setTags(new ArrayList<>());
        createPeerConnRequest.setResourceGroupId("");
        createPeerConnRequest.setDeleteProtect(false);
        try {
            CreatePeerConnResponse response = client.createPeerConn(createPeerConnRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
