package com.baidubce.rds.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rds.RdsClient;
import com.baidubce.rds.models.TransformationExampleRequest;
import com.baidubce.rds.models.TransformationExampleResponse;
import java.util.ArrayList;

public class ExampleTransformationExample {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        RdsClient client = new RdsClient(bceClientConfig);
        TransformationExampleRequest transformationExampleRequest = new TransformationExampleRequest();
        transformationExampleRequest.setInstanceId("");
        transformationExampleRequest.setCpuCount(0);
        transformationExampleRequest.setMemoryCapacity(0);
        transformationExampleRequest.setVolumeCapacity(0);
        transformationExampleRequest.setAllocatedMemoryInMB(0);
        transformationExampleRequest.setNodeAmount(0);
        transformationExampleRequest.setIsDirectPay(false);
        transformationExampleRequest.setIsEnhanced(false);
        transformationExampleRequest.setEffectiveTime("");
        transformationExampleRequest.setMasterAzone("");
        transformationExampleRequest.setBackupAzone("");
        transformationExampleRequest.setDiskIoType("");
        transformationExampleRequest.setSubnetId("");
        transformationExampleRequest.setEdgeSubnetId("");
        transformationExampleRequest.setSubnets(new ArrayList<>());
        try {
            TransformationExampleResponse response = client.transformationExample(transformationExampleRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
