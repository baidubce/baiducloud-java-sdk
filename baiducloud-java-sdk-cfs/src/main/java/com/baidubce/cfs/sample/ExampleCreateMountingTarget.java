package com.baidubce.cfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cfs.CfsClient;
import com.baidubce.cfs.models.CreateMountingTargetRequest;
import com.baidubce.cfs.models.CreateMountingTargetResponse;

public class ExampleCreateMountingTarget {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        CfsClient client = new CfsClient(config);
        CreateMountingTargetRequest createMountingTargetRequest = new CreateMountingTargetRequest();
        createMountingTargetRequest.setFsId("");
        createMountingTargetRequest.setSubnetId("");
        createMountingTargetRequest.setVpcId("");
        createMountingTargetRequest.setAccessGroupName("");
        createMountingTargetRequest.setAddress("");
        try {
            CreateMountingTargetResponse response = client.createMountingTarget(createMountingTargetRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
