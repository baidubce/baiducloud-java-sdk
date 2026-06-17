package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.CreateVolumeClusterRequest;
import com.baidubce.bcc.models.Reservation;
import com.baidubce.bcc.models.Billing;
import com.baidubce.bcc.models.CreateVolumeClusterResponse;
import java.util.ArrayList;

public class ExampleCreateVolumeCluster {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BccClient client = new BccClient(bceClientConfig);
        Billing billing = new Billing();
        billing.setPaymentTiming("");
        Reservation reservation = new Reservation();
        reservation.setReservationLength(0);
        reservation.setReservationTimeUnit("");

        billing.setReservation(reservation);

        CreateVolumeClusterRequest createVolumeClusterRequest = new CreateVolumeClusterRequest();
        createVolumeClusterRequest.setZoneName("");
        createVolumeClusterRequest.setClusterName("");
        createVolumeClusterRequest.setClusterSizeInGB(0);
        createVolumeClusterRequest.setStorageType("");
        createVolumeClusterRequest.setPurchaseCount(0);
        createVolumeClusterRequest.setBilling(billing);
        createVolumeClusterRequest.setTags(new ArrayList<>());
        try {
            CreateVolumeClusterResponse response = client.createVolumeCluster(createVolumeClusterRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
