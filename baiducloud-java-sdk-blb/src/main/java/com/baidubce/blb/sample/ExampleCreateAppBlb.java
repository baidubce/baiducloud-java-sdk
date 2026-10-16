package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.CreateAppBlbRequest;
import com.baidubce.blb.models.ReservationForCreate;
import com.baidubce.blb.models.BillingForCreate;
import com.baidubce.blb.models.CreateAppBlbResponse;
import java.util.ArrayList;

public class ExampleCreateAppBlb {
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

        CreateAppBlbRequest createAppBlbRequest = new CreateAppBlbRequest();
        createAppBlbRequest.setClientToken("");
        createAppBlbRequest.setName("");
        createAppBlbRequest.setType("");
        createAppBlbRequest.setDesc("");
        createAppBlbRequest.setSubnetId("");
        createAppBlbRequest.setVpcId("");
        createAppBlbRequest.setAddress("");
        createAppBlbRequest.setEip("");
        createAppBlbRequest.setTags(new ArrayList<>());
        createAppBlbRequest.setBilling(billing);
        createAppBlbRequest.setPerformanceLevel("");
        createAppBlbRequest.setAutoRenewLength(0);
        createAppBlbRequest.setAutoRenewTimeUnit("");
        createAppBlbRequest.setResourceGroupId("");
        createAppBlbRequest.setAllowDelete(false);
        createAppBlbRequest.setAllowModify(false);
        createAppBlbRequest.setModificationProtectionReason("");
        createAppBlbRequest.setAllocateIpv6(false);
        try {
            CreateAppBlbResponse response = client.createAppBlb(createAppBlbRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
