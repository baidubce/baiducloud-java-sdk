package com.baidubce.ax.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.BceApiKeyCredentials;
import com.baidubce.ax.AxClient;
import com.baidubce.ax.models.ListSandboxesV2ByPathRequest;
import com.baidubce.ax.models.ListSandboxesV2ByPathResponse;

public class ExampleListSandboxesV2ByPath {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        // String ak = "Your Ak";
        // String sk = "Your Sk";
        // bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        // ==== API Key 鉴权 ====
        String apiKey = "Your ApiKey";
        bceClientConfig.setCredentials(new BceApiKeyCredentials(apiKey));

        AxClient client = new AxClient(bceClientConfig);
        ListSandboxesV2ByPathRequest listSandboxesV2ByPathRequest = new ListSandboxesV2ByPathRequest();
        listSandboxesV2ByPathRequest.setLimit(0);
        listSandboxesV2ByPathRequest.setNextToken("");
        listSandboxesV2ByPathRequest.setMetadata("");
        listSandboxesV2ByPathRequest.setState("");
        try {
            ListSandboxesV2ByPathResponse response = client.listSandboxesV2ByPath(listSandboxesV2ByPathRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
