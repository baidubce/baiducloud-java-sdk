package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.PeerToPeerConnectionRenewalRequest;
import com.baidubce.vpc.models.Reservation;
import com.baidubce.vpc.models.Billing;

public class ExamplePeerToPeerConnectionRenewal {
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

        PeerToPeerConnectionRenewalRequest peerToPeerConnectionRenewalRequest = new PeerToPeerConnectionRenewalRequest();
        peerToPeerConnectionRenewalRequest.setPeerConnId("");
        peerToPeerConnectionRenewalRequest.setClientToken("");
        peerToPeerConnectionRenewalRequest.setBilling(billing);
        try {
            client.peerToPeerConnectionRenewal(peerToPeerConnectionRenewalRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
