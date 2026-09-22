package com.baidubce.scs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.scs.ScsClient;
import com.baidubce.scs.models.ParameterTemplateDetailsRequest;
import com.baidubce.scs.models.ParameterTemplateDetailsResponse;

public class ExampleParameterTemplateDetails {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        ScsClient client = new ScsClient(bceClientConfig);
        ParameterTemplateDetailsRequest parameterTemplateDetailsRequest = new ParameterTemplateDetailsRequest();
        parameterTemplateDetailsRequest.setTemplateShowId("");
        try {
            ParameterTemplateDetailsResponse response = client.parameterTemplateDetails(parameterTemplateDetailsRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
