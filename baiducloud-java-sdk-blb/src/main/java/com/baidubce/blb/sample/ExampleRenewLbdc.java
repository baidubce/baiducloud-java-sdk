package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.RenewLbdcRequest;
import com.baidubce.blb.models.ReservationForCreate;
import com.baidubce.blb.models.BillingForRenew;

public class ExampleRenewLbdc {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BlbClient client = new BlbClient(config);
        BillingForRenew billing = new BillingForRenew();
        ReservationForCreate reservation = new ReservationForCreate();
        reservation.setReservationLength(0);

        billing.setReservation(reservation);

        RenewLbdcRequest renewLbdcRequest = new RenewLbdcRequest();
        renewLbdcRequest.setId("");
        renewLbdcRequest.setClientToken("");
        renewLbdcRequest.setBilling(billing);
        try {
            client.renewLbdc(renewLbdcRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
