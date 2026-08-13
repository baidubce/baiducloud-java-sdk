package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.CreateVpnTunnelRequest;
import com.baidubce.vpc.models.IpsecConfig;
import com.baidubce.vpc.models.CreateVpnTunnelResponse;
import com.baidubce.vpc.models.IkeConfig;
import java.util.ArrayList;

public class ExampleCreateVpnTunnel {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        VpcClient client = new VpcClient(bceClientConfig);
        IkeConfig ikeConfig = new IkeConfig();
        ikeConfig.setIkeVersion("");
        ikeConfig.setIkeMode("");
        ikeConfig.setIkeEncAlg("");
        ikeConfig.setIkeAuthAlg("");
        ikeConfig.setIkePfs("");
        ikeConfig.setIkeLifeTime("");

        IpsecConfig ipsecConfig = new IpsecConfig();
        ipsecConfig.setIpsecEncAlg("");
        ipsecConfig.setIpsecAuthAlg("");
        ipsecConfig.setIpsecPfs("");
        ipsecConfig.setIpsecLifetime("");

        CreateVpnTunnelRequest createVpnTunnelRequest = new CreateVpnTunnelRequest();
        createVpnTunnelRequest.setVpnId("");
        createVpnTunnelRequest.setClientToken("");
        createVpnTunnelRequest.setSecretKey("");
        createVpnTunnelRequest.setLocalSubnets(new ArrayList<>());
        createVpnTunnelRequest.setCgwId("");
        createVpnTunnelRequest.setRemoteSubnets(new ArrayList<>());
        createVpnTunnelRequest.setDescription("");
        createVpnTunnelRequest.setVpnConnName("");
        createVpnTunnelRequest.setIkeConfig(ikeConfig);
        createVpnTunnelRequest.setIpsecConfig(ipsecConfig);
        try {
            CreateVpnTunnelResponse response = client.createVpnTunnel(createVpnTunnelRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
