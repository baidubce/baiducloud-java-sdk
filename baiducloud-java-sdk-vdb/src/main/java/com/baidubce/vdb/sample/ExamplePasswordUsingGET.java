package com.baidubce.vdb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vdb.VdbClient;
import com.baidubce.vdb.models.PasswordUsingGETRequest;
import com.baidubce.vdb.models.PasswordUsingGETResponse;

public class ExamplePasswordUsingGET {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VdbClient client = new VdbClient(bceClientConfig);
        PasswordUsingGETRequest passwordUsingGETRequest = new PasswordUsingGETRequest();
        passwordUsingGETRequest.setInstanceId("");
        passwordUsingGETRequest.setUsername("");
        passwordUsingGETRequest.setEngineType("");
        try {
            PasswordUsingGETResponse response = client.passwordUsingGET(passwordUsingGETRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
