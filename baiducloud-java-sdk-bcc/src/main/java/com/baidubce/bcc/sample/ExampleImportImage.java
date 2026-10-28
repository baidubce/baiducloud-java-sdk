package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.ImportImageRequest;
import com.baidubce.bcc.models.ImportImageResponse;

public class ExampleImportImage {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        ImportImageRequest importImageRequest = new ImportImageRequest();
        importImageRequest.setOsName("");
        importImageRequest.setOsArch("");
        importImageRequest.setOsType("");
        importImageRequest.setOsVersion("");
        importImageRequest.setName("");
        importImageRequest.setBosUrl("");
        importImageRequest.setDetection(false);
        importImageRequest.setGenerationType("");
        try {
            ImportImageResponse response = client.importImage(importImageRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
