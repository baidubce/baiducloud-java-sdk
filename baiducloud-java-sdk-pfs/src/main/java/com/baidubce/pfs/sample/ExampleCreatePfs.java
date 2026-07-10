package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.CreatePfsRequest;
import com.baidubce.pfs.models.CreatePfsResponse;
import java.util.ArrayList;

public class ExampleCreatePfs {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        PfsClient client = new PfsClient(bceClientConfig);
        CreatePfsRequest createPfsRequest = new CreatePfsRequest();
        createPfsRequest.setName("");
        createPfsRequest.setInstanceType("");
        createPfsRequest.setCapacity(0);
        createPfsRequest.setZone("");
        createPfsRequest.setSubnetId("");
        createPfsRequest.setDescription("");
        createPfsRequest.setTags(new ArrayList<>());
        try {
            CreatePfsResponse response = client.createPfs(createPfsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
