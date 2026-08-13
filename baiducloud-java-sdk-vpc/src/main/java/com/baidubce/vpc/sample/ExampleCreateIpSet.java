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
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

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
