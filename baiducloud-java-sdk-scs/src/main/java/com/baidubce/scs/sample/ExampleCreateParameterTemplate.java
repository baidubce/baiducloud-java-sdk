package com.baidubce.scs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.scs.ScsClient;
import com.baidubce.scs.models.CreateParameterTemplateRequest;
import com.baidubce.scs.models.CreateParameterTemplateResponse;
import java.util.ArrayList;

public class ExampleCreateParameterTemplate {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        ScsClient client = new ScsClient(bceClientConfig);
        CreateParameterTemplateRequest createParameterTemplateRequest = new CreateParameterTemplateRequest();
        createParameterTemplateRequest.setName("");
        createParameterTemplateRequest.setEngine("");
        createParameterTemplateRequest.setEngineVersion("");
        createParameterTemplateRequest.setClusterType("");
        createParameterTemplateRequest.setTemplateType(0);
        createParameterTemplateRequest.setComment("");
        createParameterTemplateRequest.setParameters(new ArrayList<>());
        try {
            CreateParameterTemplateResponse response = client.createParameterTemplate(createParameterTemplateRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
