package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateNatRequest;
import com.baidubce.vpc.models.Reservation;
import com.baidubce.vpc.models.Billing;
import com.baidubce.vpc.models.SessionConfig;
import com.baidubce.vpc.models.CreateNatResponse;
import java.util.ArrayList;

public class ExampleCreateNat {
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

        SessionConfig sessionConfig = new SessionConfig();
        sessionConfig.setTcpTimeout(0);
        sessionConfig.setUdpTimeout(0);
        sessionConfig.setIcmpTimeout(0);

        CreateNatRequest createNatRequest = new CreateNatRequest();
        createNatRequest.setClientToken("");
        createNatRequest.setName("");
        createNatRequest.setVpcId("");
        createNatRequest.setCuNum(0);
        createNatRequest.setIpVersion("");
        createNatRequest.setBindEips(new ArrayList<>());
        createNatRequest.setBilling(billing);
        createNatRequest.setSessionConfig(sessionConfig);
        createNatRequest.setTags(new ArrayList<>());
        createNatRequest.setResourceGroupId("");
        createNatRequest.setDeleteProtect(false);
        try {
            CreateNatResponse response = client.createNat(createNatRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
