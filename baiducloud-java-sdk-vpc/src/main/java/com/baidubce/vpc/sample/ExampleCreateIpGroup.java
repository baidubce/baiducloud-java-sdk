package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateIpGroupRequest;
import com.baidubce.vpc.models.CreateIpGroupResponse;
import java.util.ArrayList;

public class ExampleCreateIpGroup {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        CreateIpGroupRequest createIpGroupRequest = new CreateIpGroupRequest();
        createIpGroupRequest.setClientToken("");
        createIpGroupRequest.setName("");
        createIpGroupRequest.setIpVersion("");
        createIpGroupRequest.setIpAddressInfo(new ArrayList<>());
        createIpGroupRequest.setDescription("");
        try {
            CreateIpGroupResponse response = client.createIpGroup(createIpGroupRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
