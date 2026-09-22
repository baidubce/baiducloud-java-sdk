package com.baidubce.scs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.scs.ScsClient;
import com.baidubce.scs.models.CreateAnInstanceRequest;
import com.baidubce.scs.models.Reservation;
import com.baidubce.scs.models.Billing;
import com.baidubce.scs.models.CreateAnInstanceResponse;
import java.util.ArrayList;

public class ExampleCreateAnInstance {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        ScsClient client = new ScsClient(bceClientConfig);
        Billing billing = new Billing();
        billing.setPaymentTiming("");
        Reservation reservation = new Reservation();
        reservation.setReservationLength(0);
        reservation.setReservationTimeUnit("");

        billing.setReservation(reservation);

        CreateAnInstanceRequest createAnInstanceRequest = new CreateAnInstanceRequest();
        createAnInstanceRequest.setClientToken("");
        createAnInstanceRequest.setBilling(billing);
        createAnInstanceRequest.setInstanceName("");
        createAnInstanceRequest.setNodeType("");
        createAnInstanceRequest.setPort(0);
        createAnInstanceRequest.setEngine(0);
        createAnInstanceRequest.setEngineVersion("");
        createAnInstanceRequest.setStoreType(0);
        createAnInstanceRequest.setEnableReadOnly(0);
        createAnInstanceRequest.setPurchaseCount(0);
        createAnInstanceRequest.setShardNum(0);
        createAnInstanceRequest.setProxyNum(0);
        createAnInstanceRequest.setClusterType("");
        createAnInstanceRequest.setDiskFlavor(0);
        createAnInstanceRequest.setDiskType("");
        createAnInstanceRequest.setVpcId("");
        createAnInstanceRequest.setReplicationInfo(new ArrayList<>());
        createAnInstanceRequest.setAutoRenewTimeUnit("");
        createAnInstanceRequest.setAutoRenewTime(0);
        createAnInstanceRequest.setBgwGroupId("");
        createAnInstanceRequest.setClientAuth("");
        createAnInstanceRequest.setTags(new ArrayList<>());
        createAnInstanceRequest.setConfTpl("");
        createAnInstanceRequest.setResourceGroupId("");
        createAnInstanceRequest.setAutoBackupConfig("");
        createAnInstanceRequest.setDeployIdList(new ArrayList<>());
        try {
            CreateAnInstanceResponse response = client.createAnInstance(createAnInstanceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
