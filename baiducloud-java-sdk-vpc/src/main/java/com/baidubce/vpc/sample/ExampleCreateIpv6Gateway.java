package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateIpv6GatewayRequest;
import com.baidubce.vpc.models.Reservation;
import com.baidubce.vpc.models.Billing;
import com.baidubce.vpc.models.CreateIpv6GatewayResponse;
import java.util.ArrayList;

public class ExampleCreateIpv6Gateway {
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

        CreateIpv6GatewayRequest createIpv6GatewayRequest = new CreateIpv6GatewayRequest();
        createIpv6GatewayRequest.setClientToken("");
        createIpv6GatewayRequest.setVpcId("");
        createIpv6GatewayRequest.setName("");
        createIpv6GatewayRequest.setBandwidthInMbps(0);
        createIpv6GatewayRequest.setBilling(billing);
        createIpv6GatewayRequest.setTags(new ArrayList<>());
        createIpv6GatewayRequest.setResourceGroupId("");
        createIpv6GatewayRequest.setDeleteProtect(false);
        try {
            CreateIpv6GatewayResponse response = client.createIpv6Gateway(createIpv6GatewayRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
