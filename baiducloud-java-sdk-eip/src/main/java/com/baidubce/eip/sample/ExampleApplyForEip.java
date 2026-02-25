package com.baidubce.eip.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.eip.EipClient;
import com.baidubce.eip.models.ApplyForEipRequest;
import com.baidubce.eip.models.Reservation;
import com.baidubce.eip.models.Billing;
import com.baidubce.eip.models.ApplyForEipResponse;
import java.util.ArrayList;

public class ExampleApplyForEip {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        EipClient client = new EipClient(config);
        Billing billing = new Billing();
        billing.setPaymentTiming("");
        billing.setBillingMethod("");
        Reservation reservation = new Reservation();
        reservation.setReservationLength(0);
        reservation.setReservationTimeUnit("");

        billing.setReservation(reservation);

        ApplyForEipRequest applyForEipRequest = new ApplyForEipRequest();
        applyForEipRequest.setClientToken("");
        applyForEipRequest.setIpVersion("");
        applyForEipRequest.setRouteType("");
        applyForEipRequest.setBandwidthInMbps(0);
        applyForEipRequest.setBilling(billing);
        applyForEipRequest.setName("");
        applyForEipRequest.setTags(new ArrayList<>());
        applyForEipRequest.setResourceGroupId("");
        applyForEipRequest.setAutoRenewTimeUnit("");
        applyForEipRequest.setAutoRenewTime(0);
        applyForEipRequest.setDeleteProtect(false);
        try {
            ApplyForEipResponse response = client.applyForEip(applyForEipRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
