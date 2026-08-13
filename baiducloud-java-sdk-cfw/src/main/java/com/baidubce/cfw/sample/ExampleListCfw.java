package com.baidubce.cfw.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cfw.CfwClient;
import com.baidubce.cfw.models.ListCfwRequest;
import com.baidubce.cfw.models.ListCfwResponse;

public class ExampleListCfw {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CfwClient client = new CfwClient(bceClientConfig);
        ListCfwRequest listCfwRequest = new ListCfwRequest();
        listCfwRequest.setMarker("");
        listCfwRequest.setMaxKeys(0);
        try {
            ListCfwResponse response = client.listCfw(listCfwRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
