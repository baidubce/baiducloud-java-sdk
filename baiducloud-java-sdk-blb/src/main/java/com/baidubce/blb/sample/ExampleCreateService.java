package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.CreateServiceRequest;
import com.baidubce.blb.models.CreateServiceResponse;
import java.util.ArrayList;

public class ExampleCreateService {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BlbClient client = new BlbClient(bceClientConfig);
        CreateServiceRequest createServiceRequest = new CreateServiceRequest();
        createServiceRequest.setClientToken("");
        createServiceRequest.setName("");
        createServiceRequest.setDescription("");
        createServiceRequest.setServiceName("");
        createServiceRequest.setInstanceId("");
        createServiceRequest.setAuthList(new ArrayList<>());
        try {
            CreateServiceResponse response = client.createService(createServiceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
