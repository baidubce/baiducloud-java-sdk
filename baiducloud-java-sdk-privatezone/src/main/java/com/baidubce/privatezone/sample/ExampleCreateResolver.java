package com.baidubce.privatezone.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.privatezone.PrivatezoneClient;
import com.baidubce.privatezone.models.CreateResolverRequest;
import com.baidubce.privatezone.models.CreateResolverResponse;
import java.util.ArrayList;

public class ExampleCreateResolver {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PrivatezoneClient client = new PrivatezoneClient(bceClientConfig);
        CreateResolverRequest createResolverRequest = new CreateResolverRequest();
        createResolverRequest.setClientToken("");
        createResolverRequest.setName("");
        createResolverRequest.setDescription("");
        createResolverRequest.setVpcId("");
        createResolverRequest.setVpcRegion("");
        createResolverRequest.setIpModels(new ArrayList<>());
        createResolverRequest.setType("");
        try {
            CreateResolverResponse response = client.createResolver(createResolverRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
