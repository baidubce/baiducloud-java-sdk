package com.baidubce.aigw.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.aigw.AigwClient;
import com.baidubce.aigw.models.UpdateServiceRequest;
import com.baidubce.aigw.models.UpdateServiceResponse;
import java.util.ArrayList;

public class ExampleUpdateService {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        AigwClient client = new AigwClient(bceClientConfig);
        UpdateServiceRequest updateServiceRequest = new UpdateServiceRequest();
        updateServiceRequest.setInstanceId("");
        updateServiceRequest.setServiceNamePath("");
        updateServiceRequest.setXRegion("");
        updateServiceRequest.setServiceName("");
        updateServiceRequest.setServiceAddresses(new ArrayList<>());
        updateServiceRequest.setServiceProtocol("");
        updateServiceRequest.setProvider("");
        updateServiceRequest.setEndpoint("");
        updateServiceRequest.setApiKeys(new ArrayList<>());
        updateServiceRequest.setFailoverEnabled(false);
        updateServiceRequest.setFailoverModel("");
        updateServiceRequest.setCredentialSource("");
        updateServiceRequest.setCredentialNames(new ArrayList<>());
        try {
            UpdateServiceResponse response = client.updateService(updateServiceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
