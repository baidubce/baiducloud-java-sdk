package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.QueryTheConfigurationOfAutoscalerV2Request;
import com.baidubce.cce.models.QueryTheConfigurationOfAutoscalerV2Response;

public class ExampleQueryTheConfigurationOfAutoscalerV2 {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CceClient client = new CceClient(bceClientConfig);
        QueryTheConfigurationOfAutoscalerV2Request queryTheConfigurationOfAutoscalerV2Request = new QueryTheConfigurationOfAutoscalerV2Request();
        queryTheConfigurationOfAutoscalerV2Request.setClusterID("");
        try {
            QueryTheConfigurationOfAutoscalerV2Response response = client.queryTheConfigurationOfAutoscalerV2(queryTheConfigurationOfAutoscalerV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
