package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateAnIpv6GatewayRequest;
import com.baidubce.vpc.models.Reservation;
import com.baidubce.vpc.models.CreateAnIpv6GatewayResponse;
import com.baidubce.vpc.models.Billing;
import java.util.ArrayList;

public class ExampleCreateAnIpv6Gateway {
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

        CreateAnIpv6GatewayRequest createAnIpv6GatewayRequest = new CreateAnIpv6GatewayRequest();
        createAnIpv6GatewayRequest.setClientToken("");
        createAnIpv6GatewayRequest.setVpcId("");
        createAnIpv6GatewayRequest.setName("");
        createAnIpv6GatewayRequest.setBandwidthInMbps(0);
        createAnIpv6GatewayRequest.setBilling(billing);
        createAnIpv6GatewayRequest.setTags(new ArrayList<>());
        createAnIpv6GatewayRequest.setResourceGroupId("");
        createAnIpv6GatewayRequest.setDeleteProtect(false);
        try {
            CreateAnIpv6GatewayResponse response = client.createAnIpv6Gateway(createAnIpv6GatewayRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
