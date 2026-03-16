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
    // 设置Client的Access Key ID和Secret Access
    // Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
    String ak = "Your Ak";
    String sk = "Your Sk";
    String endpoint = "Endpoint";
    BceClientConfiguration config = new BceClientConfiguration();
    config.setCredentials(new DefaultBceCredentials(ak, sk));
    config.setEndpoint(endpoint);
    VpcClient client = new VpcClient(config);
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
