package com.baidubce.aigw.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.aigw.AigwClient;
import com.baidubce.aigw.models.CreateServiceRequest;
import com.baidubce.aigw.models.CreateServiceResponse;
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

        AigwClient client = new AigwClient(bceClientConfig);
        CreateServiceRequest createServiceRequest = new CreateServiceRequest();
        createServiceRequest.setInstanceId("");
        createServiceRequest.setXRegion("");
        createServiceRequest.setServiceSource("");
        createServiceRequest.setNamespace("");
        createServiceRequest.setServiceName("");
        createServiceRequest.setClusterId("");
        createServiceRequest.setClusterIds(new ArrayList<>());
        createServiceRequest.setServiceList(new ArrayList<>());
        createServiceRequest.setRegistryId("");
        createServiceRequest.setServiceAddresses(new ArrayList<>());
        createServiceRequest.setServiceProtocol("");
        createServiceRequest.setProvider("");
        createServiceRequest.setEndpoint("");
        createServiceRequest.setApiKeys(new ArrayList<>());
        createServiceRequest.setCredentialSource("");
        createServiceRequest.setCredentialNames(new ArrayList<>());
        createServiceRequest.setFailoverEnabled(false);
        createServiceRequest.setFailoverModel("");
        try {
            CreateServiceResponse response = client.createService(createServiceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
