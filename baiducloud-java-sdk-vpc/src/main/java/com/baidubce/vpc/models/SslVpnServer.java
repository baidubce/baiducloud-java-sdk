package com.baidubce.vpc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SslVpnServer {
  /** VPN的ID */
  private String vpnId;

  /** SSL-VPN服务端ID */
  private String sslVpnServerId;

  /** SSL-VPN服务端的名称 */
  private String sslVpnServerName;

  /** SSL-VPN服务端接口类型 */
  private String interfaceType;

  /** SSL-VPN服务端状态 */
  private String status;

  /** 本端网络CIDR列表 */
  private List<String> localSubnets;

  /** 客户端网络CIDR */
  private String remoteSubnet;

  /** 客户端的DNS地址 */
  private String clientDns;

  /** SSL-VPN最大客户端连接数 */
  private Integer maxConnection;

  public SslVpnServer setVpnId(String vpnId) {
    this.vpnId = vpnId;
    return this;
  }

  public String getVpnId() {
    return this.vpnId;
  }

  public SslVpnServer setSslVpnServerId(String sslVpnServerId) {
    this.sslVpnServerId = sslVpnServerId;
    return this;
  }

  public String getSslVpnServerId() {
    return this.sslVpnServerId;
  }

  public SslVpnServer setSslVpnServerName(String sslVpnServerName) {
    this.sslVpnServerName = sslVpnServerName;
    return this;
  }

  public String getSslVpnServerName() {
    return this.sslVpnServerName;
  }

  public SslVpnServer setInterfaceType(String interfaceType) {
    this.interfaceType = interfaceType;
    return this;
  }

  public String getInterfaceType() {
    return this.interfaceType;
  }

  public SslVpnServer setStatus(String status) {
    this.status = status;
    return this;
  }

  public String getStatus() {
    return this.status;
  }

  public SslVpnServer setLocalSubnets(List<String> localSubnets) {
    this.localSubnets = localSubnets;
    return this;
  }

  public List<String> getLocalSubnets() {
    return this.localSubnets;
  }

  public SslVpnServer setRemoteSubnet(String remoteSubnet) {
    this.remoteSubnet = remoteSubnet;
    return this;
  }

  public String getRemoteSubnet() {
    return this.remoteSubnet;
  }

  public SslVpnServer setClientDns(String clientDns) {
    this.clientDns = clientDns;
    return this;
  }

  public String getClientDns() {
    return this.clientDns;
  }

  public SslVpnServer setMaxConnection(Integer maxConnection) {
    this.maxConnection = maxConnection;
    return this;
  }

  public Integer getMaxConnection() {
    return this.maxConnection;
  }

  @Override
  public String toString() {
    return "SslVpnServer{"
        + "vpnId="
        + vpnId
        + "\n"
        + "sslVpnServerId="
        + sslVpnServerId
        + "\n"
        + "sslVpnServerName="
        + sslVpnServerName
        + "\n"
        + "interfaceType="
        + interfaceType
        + "\n"
        + "status="
        + status
        + "\n"
        + "localSubnets="
        + localSubnets
        + "\n"
        + "remoteSubnet="
        + remoteSubnet
        + "\n"
        + "clientDns="
        + clientDns
        + "\n"
        + "maxConnection="
        + maxConnection
        + "\n"
        + "}";
  }
}
