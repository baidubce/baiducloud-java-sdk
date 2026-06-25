package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateEniRequest;
import com.baidubce.vpc.models.CreateEniResponse;
import java.util.ArrayList;

public class ExampleCreateEni {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        VpcClient client = new VpcClient(bceClientConfig);
        CreateEniRequest createEniRequest = new CreateEniRequest();
        createEniRequest.setClientToken("");
        createEniRequest.setName("");
        createEniRequest.setSubnetId("");
        createEniRequest.setSecurityGroupIds(new ArrayList<>());
        createEniRequest.setEnterpriseSecurityGroupIds(new ArrayList<>());
        createEniRequest.setPrivateIpSet(new ArrayList<>());
        createEniRequest.setIpv6PrivateIpSet(new ArrayList<>());
        createEniRequest.setDescription("");
        createEniRequest.setNetworkInterfaceTrafficMode("");
        try {
            CreateEniResponse response = client.createEni(createEniRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
