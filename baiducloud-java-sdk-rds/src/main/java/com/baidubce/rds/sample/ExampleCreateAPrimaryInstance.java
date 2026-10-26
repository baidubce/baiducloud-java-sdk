package com.baidubce.rds.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rds.RdsClient;
import com.baidubce.rds.models.CreateAPrimaryInstanceRequest;
import com.baidubce.rds.models.Reservation;
import com.baidubce.rds.models.Billing;
import com.baidubce.rds.models.CreateAPrimaryInstanceResponse;
import com.baidubce.rds.models.InitialDataReference;
import java.util.ArrayList;

public class ExampleCreateAPrimaryInstance {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        RdsClient client = new RdsClient(bceClientConfig);
        Billing billing = new Billing();
        billing.setPaymentTiming("");
        Reservation reservation = new Reservation();
        reservation.setReservationLength(0);
        reservation.setReservationTimeUnit("");

        billing.setReservation(reservation);

        InitialDataReference initialDataReference = new InitialDataReference();
        initialDataReference.setInstanceId("");
        initialDataReference.setReferenceType("");
        initialDataReference.setDatetime("");
        initialDataReference.setSnapshotId("");

        CreateAPrimaryInstanceRequest createAPrimaryInstanceRequest = new CreateAPrimaryInstanceRequest();
        createAPrimaryInstanceRequest.setClientToken("");
        createAPrimaryInstanceRequest.setBilling(billing);
        createAPrimaryInstanceRequest.setPurchaseCount(0);
        createAPrimaryInstanceRequest.setInstanceName("");
        createAPrimaryInstanceRequest.setEngine("");
        createAPrimaryInstanceRequest.setEngineVersion("");
        createAPrimaryInstanceRequest.setCategory("");
        createAPrimaryInstanceRequest.setCpuCount(0);
        createAPrimaryInstanceRequest.setMemoryCapacity(0);
        createAPrimaryInstanceRequest.setVolumeCapacity(0);
        createAPrimaryInstanceRequest.setDiskIoType("");
        createAPrimaryInstanceRequest.setZoneNames(new ArrayList<>());
        createAPrimaryInstanceRequest.setBcmGroupName("");
        createAPrimaryInstanceRequest.setVpcId("");
        createAPrimaryInstanceRequest.setIsDirectPay(false);
        createAPrimaryInstanceRequest.setSubnets(new ArrayList<>());
        createAPrimaryInstanceRequest.setTags(new ArrayList<>());
        createAPrimaryInstanceRequest.setBgwGroupId("");
        createAPrimaryInstanceRequest.setBgwGroupExclusive(false);
        createAPrimaryInstanceRequest.setCharacterSetName("");
        createAPrimaryInstanceRequest.setAutoRenewTimeUnit("");
        createAPrimaryInstanceRequest.setAutoRenewTime(0);
        createAPrimaryInstanceRequest.setLowerCaseTableNames(0);
        createAPrimaryInstanceRequest.setParameterTemplateId("");
        createAPrimaryInstanceRequest.setOvip("");
        createAPrimaryInstanceRequest.setEntryPort(0);
        createAPrimaryInstanceRequest.setReplicationType("");
        createAPrimaryInstanceRequest.setResourceGroupId("");
        createAPrimaryInstanceRequest.setInitialDataReference(initialDataReference);
        createAPrimaryInstanceRequest.setData(new ArrayList<>());
        createAPrimaryInstanceRequest.setLeaderInstanceId("");
        createAPrimaryInstanceRequest.setResourceType("");
        try {
            CreateAPrimaryInstanceResponse response = client.createAPrimaryInstance(createAPrimaryInstanceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
