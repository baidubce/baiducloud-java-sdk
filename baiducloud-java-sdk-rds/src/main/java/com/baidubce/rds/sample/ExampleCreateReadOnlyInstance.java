package com.baidubce.rds.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rds.RdsClient;
import com.baidubce.rds.models.CreateReadOnlyInstanceRequest;
import com.baidubce.rds.models.CreateReadOnlyInstanceResponse;
import com.baidubce.rds.models.Billing;
import java.util.ArrayList;

public class ExampleCreateReadOnlyInstance {
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
        billing.setReservation(null);

        CreateReadOnlyInstanceRequest createReadOnlyInstanceRequest = new CreateReadOnlyInstanceRequest();
        createReadOnlyInstanceRequest.setClientToken("");
        createReadOnlyInstanceRequest.setBilling(billing);
        createReadOnlyInstanceRequest.setSourceInstanceId("");
        createReadOnlyInstanceRequest.setInstanceName("");
        createReadOnlyInstanceRequest.setCpuCount(0);
        createReadOnlyInstanceRequest.setMemoryCapacity(0);
        createReadOnlyInstanceRequest.setVolumeCapacity(0);
        createReadOnlyInstanceRequest.setDiskIoType("");
        createReadOnlyInstanceRequest.setZoneNames(new ArrayList<>());
        createReadOnlyInstanceRequest.setVpcId("");
        createReadOnlyInstanceRequest.setBcmGroupName("");
        createReadOnlyInstanceRequest.setIsDirectPay(false);
        createReadOnlyInstanceRequest.setSubnets(new ArrayList<>());
        createReadOnlyInstanceRequest.setOvip("");
        createReadOnlyInstanceRequest.setEntryPort(0);
        createReadOnlyInstanceRequest.setResourceGroupId("");
        createReadOnlyInstanceRequest.setReplicaType("");
        createReadOnlyInstanceRequest.setIsInheritMasterAuthip(false);
        createReadOnlyInstanceRequest.setPurchaseCount(0);
        createReadOnlyInstanceRequest.setResourceType("");
        createReadOnlyInstanceRequest.setAutoRenewTimeUnit("");
        createReadOnlyInstanceRequest.setAutoRenewTime(0);
        try {
            CreateReadOnlyInstanceResponse response = client.createReadOnlyInstance(createReadOnlyInstanceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
