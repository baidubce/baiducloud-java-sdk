package com.baidubce.bcc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bcc.BccClient;
import com.baidubce.bcc.models.ListSnapchainRequest;
import com.baidubce.bcc.models.ListSnapchainResponse;

public class ExampleListSnapchain {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        BccClient client = new BccClient(bceClientConfig);
        ListSnapchainRequest listSnapchainRequest = new ListSnapchainRequest();
        listSnapchainRequest.setOrderBy("");
        listSnapchainRequest.setOrder("");
        listSnapchainRequest.setPageSize(0);
        listSnapchainRequest.setPageNo(0);
        listSnapchainRequest.setVolumeId("");
        try {
            ListSnapchainResponse response = client.listSnapchain(listSnapchainRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
