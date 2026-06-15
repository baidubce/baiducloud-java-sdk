package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.CreateInstanceBySpecRequest;
import com.baidubce.bcc.models.CreateInstanceBySpecResponse;
import com.baidubce.bcc.models.Reservation;
import com.baidubce.bcc.models.Billing;
import java.util.ArrayList;

public class ExampleCreateInstanceBySpec {
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

        CreateInstanceBySpecRequest createInstanceBySpecRequest = new CreateInstanceBySpecRequest();
        createInstanceBySpecRequest.setKeepImageLogin(false);
        createInstanceBySpecRequest.setBccCreateWithScript("");
        createInstanceBySpecRequest.setName("");
        createInstanceBySpecRequest.setCpuThreadConfig("");
        createInstanceBySpecRequest.setNumaConfig("");
        createInstanceBySpecRequest.setEnableDeleteProtection(false);
        createInstanceBySpecRequest.setHostname("");
        createInstanceBySpecRequest.setAutoSeqSuffix(false);
        createInstanceBySpecRequest.setIsOpenHostnameDomain(false);
        createInstanceBySpecRequest.setAdminPass("");
        createInstanceBySpecRequest.setKeypairId("");
        createInstanceBySpecRequest.setAspId("");
        createInstanceBySpecRequest.setSpecId("");
        createInstanceBySpecRequest.setEnableJumboFrame(false);
        createInstanceBySpecRequest.setUserData("");
        createInstanceBySpecRequest.setDeletionProtection("");
        createInstanceBySpecRequest.setAutoRenewTimeUnit("");
        createInstanceBySpecRequest.setAutoRenewTime(0);
        createInstanceBySpecRequest.setHosteyeType("");
        createInstanceBySpecRequest.setEnableNuma(false);
        createInstanceBySpecRequest.setDataPartitionType("");
        createInstanceBySpecRequest.setRootPartitionType("");
        createInstanceBySpecRequest.setCdsAutoRenew(false);
        createInstanceBySpecRequest.setCreateCdsList(new ArrayList<>());
        createInstanceBySpecRequest.setImageId("");
        createInstanceBySpecRequest.setSpec("");
        createInstanceBySpecRequest.setRoleName("");
        createInstanceBySpecRequest.setBidModel("");
        createInstanceBySpecRequest.setBidPrice("");
        createInstanceBySpecRequest.setRootDiskSizeInGb(0);
        createInstanceBySpecRequest.setRootDiskExtraIo("");
        createInstanceBySpecRequest.setRootDiskStorageType("");
        createInstanceBySpecRequest.setNetworkCapacityInMbps(0);
        createInstanceBySpecRequest.setEhcClusterId("");
        createInstanceBySpecRequest.setPurchaseCount(0);
        createInstanceBySpecRequest.setPurchaseMinCount(0);
        createInstanceBySpecRequest.setDedicatedHostId("");
        createInstanceBySpecRequest.setRelationTag(false);
        createInstanceBySpecRequest.setTags(new ArrayList<>());
        createInstanceBySpecRequest.setFileSystems(new ArrayList<>());
        createInstanceBySpecRequest.setEphemeralDisks(new ArrayList<>());
        createInstanceBySpecRequest.setSecurityGroupId("");
        createInstanceBySpecRequest.setEnterpriseSecurityGroupId("");
        createInstanceBySpecRequest.setSecurityGroupIds(new ArrayList<>());
        createInstanceBySpecRequest.setEnterpriseSecurityGroupIds(new ArrayList<>());
        createInstanceBySpecRequest.setSubnetId("");
        createInstanceBySpecRequest.setDeployId("");
        createInstanceBySpecRequest.setDeployIdList(new ArrayList<>());
        createInstanceBySpecRequest.setEniIds(new ArrayList<>());
        createInstanceBySpecRequest.setDisableRootDiskSerial("");
        createInstanceBySpecRequest.setZoneName("");
        createInstanceBySpecRequest.setInternalIps(new ArrayList<>());
        createInstanceBySpecRequest.setResGroupId("");
        createInstanceBySpecRequest.setIsEipAutoRelatedDelete(false);
        createInstanceBySpecRequest.setNetworkPurchaseType("");
        createInstanceBySpecRequest.setInstanceType("");
        createInstanceBySpecRequest.setInternetChargeType("");
        createInstanceBySpecRequest.setEipName("");
        createInstanceBySpecRequest.setIsOpenHostEye(false);
        createInstanceBySpecRequest.setEnableHt(false);
        createInstanceBySpecRequest.setBilling(billing);
        createInstanceBySpecRequest.setIsOpenIpv6(false);
        try {
            CreateInstanceBySpecResponse response = client.createInstanceBySpec(createInstanceBySpecRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
