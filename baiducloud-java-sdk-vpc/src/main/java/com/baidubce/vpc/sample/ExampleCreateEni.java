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
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

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
