package com.baidubce.eip.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TbspIpWhitelistModel {
  /** DDoS增强防护包防护对象IP地址 */
  private String ip;

  /** DDoS增强防护包IP白名单ID */
  private String whitelistId;

  /** DDoS增强防护包IP白名单网段 (完整IP地址格式或IP网段格式) */
  private String ipCidr;

  public TbspIpWhitelistModel setIp(String ip) {
    this.ip = ip;
    return this;
  }

  public String getIp() {
    return this.ip;
  }

  public TbspIpWhitelistModel setWhitelistId(String whitelistId) {
    this.whitelistId = whitelistId;
    return this;
  }

  public String getWhitelistId() {
    return this.whitelistId;
  }

  public TbspIpWhitelistModel setIpCidr(String ipCidr) {
    this.ipCidr = ipCidr;
    return this;
  }

  public String getIpCidr() {
    return this.ipCidr;
  }

  @Override
  public String toString() {
    return "TbspIpWhitelistModel{"
        + "ip="
        + ip
        + "\n"
        + "whitelistId="
        + whitelistId
        + "\n"
        + "ipCidr="
        + ipCidr
        + "\n"
        + "}";
  }
}
