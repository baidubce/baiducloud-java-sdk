package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateIpReservedRequest;
import com.baidubce.vpc.models.CreateIpReservedResponse;

public class ExampleCreateIpReserved {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        CreateIpReservedRequest createIpReservedRequest = new CreateIpReservedRequest();
        createIpReservedRequest.setClientToken("");
        createIpReservedRequest.setSubnetId("");
        createIpReservedRequest.setIpCidr("");
        createIpReservedRequest.setIpVersion(0);
        createIpReservedRequest.setDescription("");
        try {
            CreateIpReservedResponse response = client.createIpReserved(createIpReservedRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
