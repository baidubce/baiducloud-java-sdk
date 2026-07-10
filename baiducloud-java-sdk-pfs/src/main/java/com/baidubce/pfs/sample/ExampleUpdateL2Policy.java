package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.UpdateL2PolicyRequest;
import com.baidubce.pfs.models.UpdateL2PolicyResponse;

public class ExampleUpdateL2Policy {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        PfsClient client = new PfsClient(bceClientConfig);
        UpdateL2PolicyRequest updateL2PolicyRequest = new UpdateL2PolicyRequest();
        updateL2PolicyRequest.setInstanceId("");
        updateL2PolicyRequest.setPolicyId("");
        updateL2PolicyRequest.setNewPolicyName("");
        updateL2PolicyRequest.setExpiredTime(0);
        updateL2PolicyRequest.setExecuteTime(0);
        updateL2PolicyRequest.setBucketName("");
        updateL2PolicyRequest.setBucketPrefix("");
        try {
            UpdateL2PolicyResponse response = client.updateL2Policy(updateL2PolicyRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
