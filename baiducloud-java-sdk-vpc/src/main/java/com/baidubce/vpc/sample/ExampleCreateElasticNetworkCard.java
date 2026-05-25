package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateElasticNetworkCardRequest;
import com.baidubce.vpc.models.CreateElasticNetworkCardResponse;
import java.util.ArrayList;

public class ExampleCreateElasticNetworkCard {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        VpcClient client = new VpcClient(config);
        CreateElasticNetworkCardRequest createElasticNetworkCardRequest = new CreateElasticNetworkCardRequest();
        createElasticNetworkCardRequest.setClientToken("");
        createElasticNetworkCardRequest.setName("");
        createElasticNetworkCardRequest.setSubnetId("");
        createElasticNetworkCardRequest.setSecurityGroupIds(new ArrayList<>());
        createElasticNetworkCardRequest.setEnterpriseSecurityGroupIds(new ArrayList<>());
        createElasticNetworkCardRequest.setPrivateIpSet(new ArrayList<>());
        createElasticNetworkCardRequest.setIpv6PrivateIpSet(new ArrayList<>());
        createElasticNetworkCardRequest.setDescription("");
        createElasticNetworkCardRequest.setNetworkInterfaceTrafficMode("");
        try {
            CreateElasticNetworkCardResponse response = client.createElasticNetworkCard(createElasticNetworkCardRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
