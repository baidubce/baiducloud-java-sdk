package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.CreateBlbRequest;
import com.baidubce.blb.models.ReservationForCreate;
import com.baidubce.blb.models.CreateBlbResponse;
import com.baidubce.blb.models.BillingForCreate;
import java.util.ArrayList;

public class ExampleCreateBlb {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BlbClient client = new BlbClient(config);
        BillingForCreate billing = new BillingForCreate();
        billing.setPaymentTiming("");
        billing.setBillingMethod("");
        ReservationForCreate reservation = new ReservationForCreate();
        reservation.setReservationLength(0);

        billing.setReservation(reservation);

        CreateBlbRequest createBlbRequest = new CreateBlbRequest();
        createBlbRequest.setClientToken("");
        createBlbRequest.setName("");
        createBlbRequest.setDesc("");
        createBlbRequest.setVpcId("");
        createBlbRequest.setSubnetId("");
        createBlbRequest.setAddress("");
        createBlbRequest.setType("");
        createBlbRequest.setEip("");
        createBlbRequest.setTags(new ArrayList<>());
        createBlbRequest.setBilling(billing);
        createBlbRequest.setPerformanceLevel("");
        createBlbRequest.setAutoRenewLength(0);
        createBlbRequest.setAutoRenewTimeUnit("");
        createBlbRequest.setResourceGroupId("");
        createBlbRequest.setAllowDelete(false);
        createBlbRequest.setAllowModify(false);
        createBlbRequest.setModificationProtectionReason("");
        createBlbRequest.setAllocateIpv6(false);
        try {
            CreateBlbResponse response = client.createBlb(createBlbRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
