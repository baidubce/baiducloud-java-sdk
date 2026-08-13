package com.baidubce.cfw.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cfw.CfwClient;
import com.baidubce.cfw.models.CreateStatelessCfwRequest;
import com.baidubce.cfw.models.CreateStatelessCfwResponse;
import java.util.ArrayList;

public class ExampleCreateStatelessCfw {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CfwClient client = new CfwClient(bceClientConfig);
        CreateStatelessCfwRequest createStatelessCfwRequest = new CreateStatelessCfwRequest();
        createStatelessCfwRequest.setName("");
        createStatelessCfwRequest.setDescription("");
        createStatelessCfwRequest.setDefaultAction("");
        createStatelessCfwRequest.setProtocol("");
        createStatelessCfwRequest.setIpList(new ArrayList<>());
        try {
            CreateStatelessCfwResponse response = client.createStatelessCfw(createStatelessCfwRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
