package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.ImportKeypairRequest;
import com.baidubce.bcc.models.ImportKeypairResponse;

public class ExampleImportKeypair {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        ImportKeypairRequest importKeypairRequest = new ImportKeypairRequest();
        importKeypairRequest.setName("");
        importKeypairRequest.setDescription("");
        importKeypairRequest.setPublicKey("");
        try {
            ImportKeypairResponse response = client.importKeypair(importKeypairRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
