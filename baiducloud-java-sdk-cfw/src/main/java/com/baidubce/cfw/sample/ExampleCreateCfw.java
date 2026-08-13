package com.baidubce.cfw.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cfw.CfwClient;
import com.baidubce.cfw.models.CreateCfwRequest;
import com.baidubce.cfw.models.CreateCfwResponse;
import java.util.ArrayList;

public class ExampleCreateCfw {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CfwClient client = new CfwClient(bceClientConfig);
        CreateCfwRequest createCfwRequest = new CreateCfwRequest();
        createCfwRequest.setName("");
        createCfwRequest.setType(0);
        createCfwRequest.setBorder(0);
        createCfwRequest.setDescription("");
        createCfwRequest.setCfwRules(new ArrayList<>());
        try {
            CreateCfwResponse response = client.createCfw(createCfwRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
