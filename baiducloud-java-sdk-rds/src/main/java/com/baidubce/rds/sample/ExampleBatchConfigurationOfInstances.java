package com.baidubce.rds.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rds.RdsClient;
import com.baidubce.rds.models.BatchConfigurationOfInstancesRequest;
import com.baidubce.rds.models.BatchConfigurationOfInstancesResponse;
import java.util.ArrayList;

public class ExampleBatchConfigurationOfInstances {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        RdsClient client = new RdsClient(bceClientConfig);
        BatchConfigurationOfInstancesRequest batchConfigurationOfInstancesRequest = new BatchConfigurationOfInstancesRequest();
        batchConfigurationOfInstancesRequest.setInstanceId("");
        batchConfigurationOfInstancesRequest.setCpuCount(0);
        batchConfigurationOfInstancesRequest.setMemoryCapacity(0);
        batchConfigurationOfInstancesRequest.setVolumeCapacity(0);
        batchConfigurationOfInstancesRequest.setReadReplicas(new ArrayList<>());
        batchConfigurationOfInstancesRequest.setIsBatchResize(false);
        batchConfigurationOfInstancesRequest.setIsDirectPay(false);
        batchConfigurationOfInstancesRequest.setIsEnhanced(false);
        batchConfigurationOfInstancesRequest.setEffectiveTime("");
        batchConfigurationOfInstancesRequest.setMasterAzone("");
        batchConfigurationOfInstancesRequest.setBackupAzone("");
        batchConfigurationOfInstancesRequest.setDiskIoType("");
        batchConfigurationOfInstancesRequest.setSubnetId("");
        batchConfigurationOfInstancesRequest.setEdgeSubnetId("");
        batchConfigurationOfInstancesRequest.setSubnets(new ArrayList<>());
        batchConfigurationOfInstancesRequest.setCouponId(new ArrayList<>());
        try {
            BatchConfigurationOfInstancesResponse response = client.batchConfigurationOfInstances(batchConfigurationOfInstancesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
