package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.UpdateVpnTunnelRequest;
import com.baidubce.vpc.models.IpsecConfig;
import com.baidubce.vpc.models.IkeConfig;
import java.util.ArrayList;

public class ExampleUpdateVpnTunnel {
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

    UpdateVpnTunnelRequest updateVpnTunnelRequest = new UpdateVpnTunnelRequest();
    updateVpnTunnelRequest.setVpnConnId("");
    updateVpnTunnelRequest.setClientToken("");
    updateVpnTunnelRequest.setVpnId("");
    updateVpnTunnelRequest.setSecretKey("");
    updateVpnTunnelRequest.setLocalSubnets(new ArrayList<>());
    updateVpnTunnelRequest.setCgwId("");
    updateVpnTunnelRequest.setRemoteSubnets(new ArrayList<>());
    updateVpnTunnelRequest.setDescription("");
    updateVpnTunnelRequest.setVpnConnName("");
    updateVpnTunnelRequest.setIkeConfig(ikeConfig);
    updateVpnTunnelRequest.setIpsecConfig(ipsecConfig);
    try {
      client.updateVpnTunnel(updateVpnTunnelRequest);
    } catch (BceClientException e) {
      // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
      System.out.println(e.getMessage());
    }
  }
}
