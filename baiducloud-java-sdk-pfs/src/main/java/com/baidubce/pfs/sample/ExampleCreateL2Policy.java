package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.CreateL2PolicyRequest;
import com.baidubce.pfs.models.CreateL2PolicyResponse;

public class ExampleCreateL2Policy {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        PfsClient client = new PfsClient(bceClientConfig);
        CreateL2PolicyRequest createL2PolicyRequest = new CreateL2PolicyRequest();
        createL2PolicyRequest.setInstanceId("");
        createL2PolicyRequest.setPolicyName("");
        createL2PolicyRequest.setPath("");
        createL2PolicyRequest.setExpiredTime(0);
        createL2PolicyRequest.setType(0);
        createL2PolicyRequest.setExecuteTime(0);
        createL2PolicyRequest.setBucketName("");
        createL2PolicyRequest.setBucketPrefix("");
        try {
            CreateL2PolicyResponse response = client.createL2Policy(createL2PolicyRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
