package com.baidubce.cfw.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cfw.CfwClient;
import com.baidubce.cfw.models.GetStatelessCfwRequest;
import com.baidubce.cfw.models.GetStatelessCfwResponse;

public class ExampleGetStatelessCfw {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CfwClient client = new CfwClient(bceClientConfig);
        GetStatelessCfwRequest getStatelessCfwRequest = new GetStatelessCfwRequest();
        getStatelessCfwRequest.setCfwId("");
        try {
            GetStatelessCfwResponse response = client.getStatelessCfw(getStatelessCfwRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
