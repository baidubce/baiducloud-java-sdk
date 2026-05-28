package com.baidubce.dns.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.dns.DnsClient;
import com.baidubce.dns.models.UpgradeZoneRequest;
import com.baidubce.dns.models.Reservation;
import com.baidubce.dns.models.Billing;
import java.util.ArrayList;

public class ExampleUpgradeZone {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        DnsClient client = new DnsClient(config);
        Billing billing = new Billing();
        billing.setPaymentTiming("Prepaid");
        Reservation reservation = new Reservation();
        reservation.setReservationLength(1);

        billing.setReservation(reservation);

        UpgradeZoneRequest upgradeZoneRequest = new UpgradeZoneRequest();
        upgradeZoneRequest.setAction("upgradeToDiscount");
        upgradeZoneRequest.setClientToken("");
        upgradeZoneRequest.setNames(new ArrayList<>());
        upgradeZoneRequest.setBilling(billing);
        try {
            client.upgradeZone(upgradeZoneRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
