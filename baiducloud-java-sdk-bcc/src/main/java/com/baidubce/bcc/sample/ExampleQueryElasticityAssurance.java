package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.QueryElasticityAssuranceRequest;
import com.baidubce.bcc.models.QueryElasticityAssuranceResponse;
import java.util.ArrayList;

public class ExampleQueryElasticityAssurance {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        QueryElasticityAssuranceRequest queryElasticityAssuranceRequest = new QueryElasticityAssuranceRequest();
        queryElasticityAssuranceRequest.setMarker("");
        queryElasticityAssuranceRequest.setMaxKeys(0);
        queryElasticityAssuranceRequest.setElasticityAssuranceIds(new ArrayList<>());
        queryElasticityAssuranceRequest.setElasticityAssuranceName("");
        queryElasticityAssuranceRequest.setZoneName("");
        queryElasticityAssuranceRequest.setSpec("");
        queryElasticityAssuranceRequest.setStatus(new ArrayList<>());
        try {
            QueryElasticityAssuranceResponse response = client.queryElasticityAssurance(queryElasticityAssuranceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
