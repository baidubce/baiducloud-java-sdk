package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.CreateElasticityAssuranceRequest;
import com.baidubce.bcc.models.CreateElasticityAssuranceResponse;
import java.util.ArrayList;

public class ExampleCreateElasticityAssurance {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        CreateElasticityAssuranceRequest createElasticityAssuranceRequest = new CreateElasticityAssuranceRequest();
        createElasticityAssuranceRequest.setElasticityAssuranceName("");
        createElasticityAssuranceRequest.setZoneName("");
        createElasticityAssuranceRequest.setSpec("");
        createElasticityAssuranceRequest.setCapacity(0);
        createElasticityAssuranceRequest.setPeriod(0);
        createElasticityAssuranceRequest.setAutoRenew(false);
        createElasticityAssuranceRequest.setTags(new ArrayList<>());
        try {
            CreateElasticityAssuranceResponse response = client.createElasticityAssurance(createElasticityAssuranceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
