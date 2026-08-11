package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.DeleteL3MountTargetRequest;
import com.baidubce.pfs.models.DeleteL3MountTargetResponse;

public class ExampleDeleteL3MountTarget {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        PfsClient client = new PfsClient(bceClientConfig);
        DeleteL3MountTargetRequest deleteL3MountTargetRequest = new DeleteL3MountTargetRequest();
        deleteL3MountTargetRequest.setInstanceId("");
        deleteL3MountTargetRequest.setMountTargetId("");
        try {
            DeleteL3MountTargetResponse response = client.deleteL3MountTarget(deleteL3MountTargetRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
