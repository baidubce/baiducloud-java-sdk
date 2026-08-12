package com.baidubce.ax.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.BceApiKeyCredentials;
import com.baidubce.ax.AxClient;
import com.baidubce.ax.models.CreateSandboxRequest;
import com.baidubce.ax.models.CreateSandboxResponse;
import java.util.HashMap;
import java.util.ArrayList;

public class ExampleCreateSandbox {
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
        CreateSandboxRequest createSandboxRequest = new CreateSandboxRequest();
        createSandboxRequest.setTemplateID("");
        createSandboxRequest.setTimeout(0);
        createSandboxRequest.setMetadata(new HashMap<>());
        createSandboxRequest.setEnvVars(new HashMap<>());
        createSandboxRequest.setSecure(false);
        createSandboxRequest.setAllowInternetAccess(false);
        createSandboxRequest.setAutoPause(false);
        createSandboxRequest.setAutoResume(new HashMap<>());
        createSandboxRequest.setRuntimeType("");
        createSandboxRequest.setMcp(new HashMap<>());
        createSandboxRequest.setVolumeMounts(new ArrayList<>());
        try {
            CreateSandboxResponse response = client.createSandbox(createSandboxRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
