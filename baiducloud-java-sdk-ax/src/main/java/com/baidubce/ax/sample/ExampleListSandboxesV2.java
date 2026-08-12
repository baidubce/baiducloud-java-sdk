package com.baidubce.ax.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.BceApiKeyCredentials;
import com.baidubce.ax.AxClient;
import com.baidubce.ax.models.ListSandboxesV2Request;
import com.baidubce.ax.models.ListSandboxesV2Response;

public class ExampleListSandboxesV2 {
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
        ListSandboxesV2Request listSandboxesV2Request = new ListSandboxesV2Request();
        listSandboxesV2Request.setLimit(0);
        listSandboxesV2Request.setNextToken("");
        listSandboxesV2Request.setMetadata("");
        listSandboxesV2Request.setState("");
        try {
            ListSandboxesV2Response response = client.listSandboxesV2(listSandboxesV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
