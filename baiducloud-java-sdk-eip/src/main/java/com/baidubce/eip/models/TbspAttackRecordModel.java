package com.baidubce.eip.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TbspAttackRecordModel {
  /** DDoS增强防护包被攻击的IP地址 */
  private String ip;

  /** 攻击开始时间 */
  private String startTime;

  public TbspAttackRecordModel setIp(String ip) {
    this.ip = ip;
    return this;
  }

  public String getIp() {
    return this.ip;
  }

  public TbspAttackRecordModel setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  public String getStartTime() {
    return this.startTime;
  }

  @Override
  public String toString() {
    return "TbspAttackRecordModel{" + "ip=" + ip + "\n" + "startTime=" + startTime + "\n" + "}";
  }
}
