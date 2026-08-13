package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.UpdateSslVpnServerRequest;
import java.util.ArrayList;

public class ExampleUpdateSslVpnServer {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        UpdateSslVpnServerRequest updateSslVpnServerRequest = new UpdateSslVpnServerRequest();
        updateSslVpnServerRequest.setVpnId("");
        updateSslVpnServerRequest.setSslVpnServerId("");
        updateSslVpnServerRequest.setClientToken("");
        updateSslVpnServerRequest.setSslVpnServerName("");
        updateSslVpnServerRequest.setLocalSubnets(new ArrayList<>());
        updateSslVpnServerRequest.setRemoteSubnet("");
        updateSslVpnServerRequest.setClientDns("");
        try {
            client.updateSslVpnServer(updateSslVpnServerRequest);
        } catch (BceClientException e) {
            // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
            System.out.println(e.getMessage());
        }
    }
}
