package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.CreateBidInstanceRequest;
import com.baidubce.bcc.models.CreateBidInstanceResponse;
import com.baidubce.bcc.models.Reservation;
import com.baidubce.bcc.models.Billing;
import java.util.ArrayList;

public class ExampleCreateBidInstance {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        Billing billing = new Billing();
        billing.setPaymentTiming("");
        Reservation reservation = new Reservation();
        reservation.setReservationLength(0);
        reservation.setReservationTimeUnit("");

        billing.setReservation(reservation);

        CreateBidInstanceRequest createBidInstanceRequest = new CreateBidInstanceRequest();
        createBidInstanceRequest.setSpec("");
        createBidInstanceRequest.setImageId("");
        createBidInstanceRequest.setBilling(billing);
        createBidInstanceRequest.setBidModel("");
        createBidInstanceRequest.setBidPrice("");
        createBidInstanceRequest.setCpuCount(0);
        createBidInstanceRequest.setMemoryCapacityInGB(0);
        createBidInstanceRequest.setRootDiskSizeInGb(0);
        createBidInstanceRequest.setRootDiskStorageType("");
        createBidInstanceRequest.setCreateCdsList(new ArrayList<>());
        createBidInstanceRequest.setEphemeralDisks(new ArrayList<>());
        createBidInstanceRequest.setNetworkCapacityInMbps(0);
        createBidInstanceRequest.setInternetChargeType("");
        createBidInstanceRequest.setEipName("");
        createBidInstanceRequest.setPurchaseCount(0);
        createBidInstanceRequest.setName("");
        createBidInstanceRequest.setHostname("");
        createBidInstanceRequest.setAutoSeqSuffix(false);
        createBidInstanceRequest.setIsOpenHostnameDomain(false);
        createBidInstanceRequest.setAdminPass("");
        createBidInstanceRequest.setKeypairId("");
        createBidInstanceRequest.setUserData("");
        createBidInstanceRequest.setZoneName("");
        createBidInstanceRequest.setSubnetId("");
        createBidInstanceRequest.setSecurityGroupId("");
        createBidInstanceRequest.setEnterpriseSecurityGroupId("");
        createBidInstanceRequest.setIsomerismCard("");
        createBidInstanceRequest.setDeletionProtection(0);
        createBidInstanceRequest.setRelationTag(false);
        createBidInstanceRequest.setIsOpenIpv6(false);
        createBidInstanceRequest.setTags(new ArrayList<>());
        createBidInstanceRequest.setAspId("");
        createBidInstanceRequest.setFileSystems(new ArrayList<>());
        createBidInstanceRequest.setIsEipAutoRelatedDelete(false);
        createBidInstanceRequest.setResGroupId("");
        try {
            CreateBidInstanceResponse response = client.createBidInstance(createBidInstanceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
