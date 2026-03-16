package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateVpnTunnelRequest extends BaseBceRequest {

  /** vpnId */
  @JsonIgnore private String vpnId;

  /** clientToken */
  @JsonIgnore private String clientToken;

  /** 共享秘钥，8～17位字符，英文、数字和符号必须同时存在，符号仅限!@#$%^*()_ */
  private String secretKey;

  /** 本端网络cidr列表 */
  private List<String> localSubnets;

  /** 用户网关ID */
  private String cgwId;

  /** 对端网络cidr列表 */
  private List<String> remoteSubnets;

  /** 描述 */
  private String description;

  /** VPN隧道名称，大小写字母、数字以及-_/.特殊字符，必须以字母开头，长度1-65 */
  private String vpnConnName;

  /** ikeConfig */
  private IkeConfig ikeConfig;

  /** ipsecConfig */
  private IpsecConfig ipsecConfig;

  public String getVpnId() {
    return vpnId;
  }

  public CreateVpnTunnelRequest setVpnId(String vpnId) {
    this.vpnId = vpnId;
    return this;
  }

  public String getClientToken() {
    return clientToken;
  }

  public CreateVpnTunnelRequest setClientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

  public String getSecretKey() {
    return secretKey;
  }

  public CreateVpnTunnelRequest setSecretKey(String secretKey) {
    this.secretKey = secretKey;
    return this;
  }

  public List<String> getLocalSubnets() {
    return localSubnets;
  }

  public CreateVpnTunnelRequest setLocalSubnets(List<String> localSubnets) {
    this.localSubnets = localSubnets;
    return this;
  }

  public String getCgwId() {
    return cgwId;
  }

  public CreateVpnTunnelRequest setCgwId(String cgwId) {
    this.cgwId = cgwId;
    return this;
  }

  public List<String> getRemoteSubnets() {
    return remoteSubnets;
  }

  public CreateVpnTunnelRequest setRemoteSubnets(List<String> remoteSubnets) {
    this.remoteSubnets = remoteSubnets;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public CreateVpnTunnelRequest setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getVpnConnName() {
    return vpnConnName;
  }

  public CreateVpnTunnelRequest setVpnConnName(String vpnConnName) {
    this.vpnConnName = vpnConnName;
    return this;
  }

  public IkeConfig getIkeConfig() {
    return ikeConfig;
  }

  public CreateVpnTunnelRequest setIkeConfig(IkeConfig ikeConfig) {
    this.ikeConfig = ikeConfig;
    return this;
  }

  public IpsecConfig getIpsecConfig() {
    return ipsecConfig;
  }

  public CreateVpnTunnelRequest setIpsecConfig(IpsecConfig ipsecConfig) {
    this.ipsecConfig = ipsecConfig;
    return this;
  }
}
