package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateIpSetRequest;
import com.baidubce.vpc.models.CreateIpSetResponse;
import java.util.ArrayList;

public class ExampleCreateIpSet {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        VpcClient client = new VpcClient(bceClientConfig);
        CreateIpSetRequest createIpSetRequest = new CreateIpSetRequest();
        createIpSetRequest.setClientToken("");
        createIpSetRequest.setName("");
        createIpSetRequest.setIpVersion("");
        createIpSetRequest.setIpSetIds(new ArrayList<>());
        createIpSetRequest.setDescription("");
        try {
            CreateIpSetResponse response = client.createIpSet(createIpSetRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
