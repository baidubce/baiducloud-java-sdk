package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateVpnRequest;
import com.baidubce.vpc.models.CreateVpnResponse;
import com.baidubce.vpc.models.Reservation;
import com.baidubce.vpc.models.Billing;
import java.util.ArrayList;

public class ExampleCreateVpn {
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

        CreateVpnRequest createVpnRequest = new CreateVpnRequest();
        createVpnRequest.setClientToken("");
        createVpnRequest.setVpcId("");
        createVpnRequest.setSubnetId("");
        createVpnRequest.setVpnName("");
        createVpnRequest.setType("");
        createVpnRequest.setDescription("");
        createVpnRequest.setEip("");
        createVpnRequest.setTags(new ArrayList<>());
        createVpnRequest.setResourceGroupId("");
        createVpnRequest.setBilling(billing);
        createVpnRequest.setMaxConnection(0);
        createVpnRequest.setDeleteProtect(false);
        try {
            CreateVpnResponse response = client.createVpn(createVpnRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
