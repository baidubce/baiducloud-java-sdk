package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateAPeerToPeerConnectionRequest;
import com.baidubce.vpc.models.Reservation;
import com.baidubce.vpc.models.Billing;
import com.baidubce.vpc.models.CreateAPeerToPeerConnectionResponse;
import java.util.ArrayList;

public class ExampleCreateAPeerToPeerConnection {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        VpcClient client = new VpcClient(config);
        Billing billing = new Billing();
        billing.setPaymentTiming("");
        Reservation reservation = new Reservation();
        reservation.setReservationLength(0);
        reservation.setReservationTimeUnit("");

        billing.setReservation(reservation);

        CreateAPeerToPeerConnectionRequest createAPeerToPeerConnectionRequest = new CreateAPeerToPeerConnectionRequest();
        createAPeerToPeerConnectionRequest.setClientToken("");
        createAPeerToPeerConnectionRequest.setBandwidthInMbps(0);
        createAPeerToPeerConnectionRequest.setDescription("");
        createAPeerToPeerConnectionRequest.setLocalIfName("");
        createAPeerToPeerConnectionRequest.setLocalVpcId("");
        createAPeerToPeerConnectionRequest.setPeerAccountId("");
        createAPeerToPeerConnectionRequest.setPeerVpcId("");
        createAPeerToPeerConnectionRequest.setPeerRegion("");
        createAPeerToPeerConnectionRequest.setPeerIfName("");
        createAPeerToPeerConnectionRequest.setBilling(billing);
        createAPeerToPeerConnectionRequest.setTags(new ArrayList<>());
        createAPeerToPeerConnectionRequest.setResourceGroupId("");
        createAPeerToPeerConnectionRequest.setDeleteProtect(false);
        try {
            CreateAPeerToPeerConnectionResponse response = client.createAPeerToPeerConnection(createAPeerToPeerConnectionRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
