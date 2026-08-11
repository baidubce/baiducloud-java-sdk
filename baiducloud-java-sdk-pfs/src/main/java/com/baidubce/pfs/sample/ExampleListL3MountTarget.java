package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.ListL3MountTargetRequest;
import com.baidubce.pfs.models.ListL3MountTargetResponse;

public class ExampleListL3MountTarget {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        PfsClient client = new PfsClient(bceClientConfig);
        ListL3MountTargetRequest listL3MountTargetRequest = new ListL3MountTargetRequest();
        listL3MountTargetRequest.setInstanceId("");
        listL3MountTargetRequest.setMaxKeys(0);
        listL3MountTargetRequest.setMarker("");
        try {
            ListL3MountTargetResponse response = client.listL3MountTarget(listL3MountTargetRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
