package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.CreateVolumeRequest;
import com.baidubce.bcc.models.AutoSnapshotPolicyModel;
import com.baidubce.bcc.models.Reservation;
import com.baidubce.bcc.models.Billing;
import com.baidubce.bcc.models.CreateVolumeResponse;
import java.util.ArrayList;

public class ExampleCreateVolume {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BccClient client = new BccClient(config);
        Billing billing = new Billing();
        billing.setPaymentTiming("");
        Reservation reservation = new Reservation();
        reservation.setReservationLength(0);
        reservation.setReservationTimeUnit("");

        billing.setReservation(reservation);

        AutoSnapshotPolicyModel autoSnapshotPolicy = new AutoSnapshotPolicyModel();
        autoSnapshotPolicy.setId("");
        autoSnapshotPolicy.setName("");
        autoSnapshotPolicy.setTimePoints(new ArrayList<>());
        autoSnapshotPolicy.setRepeatWeekdays(new ArrayList<>());
        autoSnapshotPolicy.setStatus("");
        autoSnapshotPolicy.setRetentionDays(0);
        autoSnapshotPolicy.setCreatedTime("");
        autoSnapshotPolicy.setUpdatedTime("");
        autoSnapshotPolicy.setDeletedTime("");
        autoSnapshotPolicy.setLastExecuteTime("");
        autoSnapshotPolicy.setVolumeCount(0);

        CreateVolumeRequest createVolumeRequest = new CreateVolumeRequest();
        createVolumeRequest.setZoneName("");
        createVolumeRequest.setStorageType("");
        createVolumeRequest.setCdsSizeInGB(0);
        createVolumeRequest.setCdsExtraIo(0);
        createVolumeRequest.setSnapshotId("");
        createVolumeRequest.setShareSnapshotId("");
        createVolumeRequest.setEnableDeleteProtection("");
        createVolumeRequest.setInstanceId("");
        createVolumeRequest.setEncryptKey("");
        createVolumeRequest.setName("");
        createVolumeRequest.setDescription("");
        createVolumeRequest.setRenewTimeUnit("");
        createVolumeRequest.setRenewTime(0);
        createVolumeRequest.setRelationTag(false);
        createVolumeRequest.setTags(new ArrayList<>());
        createVolumeRequest.setResGroupId("");
        createVolumeRequest.setBilling(billing);
        createVolumeRequest.setClusterId("");
        createVolumeRequest.setChargeType("");
        createVolumeRequest.setAutoSnapshotPolicy(autoSnapshotPolicy);
        createVolumeRequest.setDeleteWithInstance(false);
        createVolumeRequest.setDeleteAutoSnapshot(false);
        createVolumeRequest.setPurchaseCount(0);
        try {
            CreateVolumeResponse response = client.createVolume(createVolumeRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
