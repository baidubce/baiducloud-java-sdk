package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateSslVpnServerRequest;
import com.baidubce.vpc.models.CreateSslVpnServerResponse;
import java.util.ArrayList;

public class ExampleCreateSslVpnServer {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        CreateSslVpnServerRequest createSslVpnServerRequest = new CreateSslVpnServerRequest();
        createSslVpnServerRequest.setVpnId("");
        createSslVpnServerRequest.setClientToken("");
        createSslVpnServerRequest.setSslVpnServerName("");
        createSslVpnServerRequest.setInterfaceType("");
        createSslVpnServerRequest.setLocalSubnets(new ArrayList<>());
        createSslVpnServerRequest.setRemoteSubnet("");
        createSslVpnServerRequest.setClientDns("");
        try {
            CreateSslVpnServerResponse response = client.createSslVpnServer(createSslVpnServerRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
