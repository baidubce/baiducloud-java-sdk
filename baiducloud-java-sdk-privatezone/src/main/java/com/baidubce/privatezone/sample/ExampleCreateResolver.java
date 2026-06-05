package com.baidubce.privatezone.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.privatezone.PrivatezoneClient;
import com.baidubce.privatezone.models.CreateResolverRequest;
import com.baidubce.privatezone.models.CreateResolverResponse;
import com.baidubce.privatezone.models.IpModel;

import java.util.ArrayList;
import java.util.List;

public class ExampleCreateResolver {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        PrivatezoneClient client = new PrivatezoneClient(config);
        CreateResolverRequest createResolverRequest = new CreateResolverRequest();
        createResolverRequest.setClientToken("");
        createResolverRequest.setName("");
        createResolverRequest.setDescription("");
        createResolverRequest.setVpcId("");
        createResolverRequest.setVpcRegion("");
        List<IpModel> ipModels = new ArrayList<>();
        IpModel ipModel1 = new IpModel();
        ipModel1.setSubnetId("");
        ipModel1.setIpAddress("");
        IpModel ipModel2 = new IpModel();
        ipModel2.setSubnetId("");
        ipModel2.setIpAddress("");
        ipModels.add(ipModel1);
        ipModels.add(ipModel2);
        createResolverRequest.setIpModels(ipModels);
        createResolverRequest.setType("outbound");
        try {
            CreateResolverResponse response = client.createResolver(createResolverRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
