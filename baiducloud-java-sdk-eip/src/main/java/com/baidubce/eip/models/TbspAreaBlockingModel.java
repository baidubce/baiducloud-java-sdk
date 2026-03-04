package com.baidubce.eip.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TbspAreaBlockingModel {
  /** DDoS增强防护包防护对象IP地址 */
  private String ip;

  /** DDoS增强防护包防护对象封禁区域，包含大陆地区 (continent) 和海外及港澳台地区 (overseas) */
  private String blockArea;

  /** DDoS增强防护包防护对象区域封禁起始时间 */
  private String blockBeginTime;

  /** DDoS增强防护包防护对象区域封禁终止时间 */
  private String blockEndTime;

  /** DDoS增强防护包防护对象区域封禁类型 */
  private String blockType;

  public TbspAreaBlockingModel setIp(String ip) {
    this.ip = ip;
    return this;
  }

  public String getIp() {
    return this.ip;
  }

  public TbspAreaBlockingModel setBlockArea(String blockArea) {
    this.blockArea = blockArea;
    return this;
  }

  public String getBlockArea() {
    return this.blockArea;
  }

  public TbspAreaBlockingModel setBlockBeginTime(String blockBeginTime) {
    this.blockBeginTime = blockBeginTime;
    return this;
  }

  public String getBlockBeginTime() {
    return this.blockBeginTime;
  }

  public TbspAreaBlockingModel setBlockEndTime(String blockEndTime) {
    this.blockEndTime = blockEndTime;
    return this;
  }

  public String getBlockEndTime() {
    return this.blockEndTime;
  }

  public TbspAreaBlockingModel setBlockType(String blockType) {
    this.blockType = blockType;
    return this;
  }

  public String getBlockType() {
    return this.blockType;
  }

  @Override
  public String toString() {
    return "TbspAreaBlockingModel{"
        + "ip="
        + ip
        + "\n"
        + "blockArea="
        + blockArea
        + "\n"
        + "blockBeginTime="
        + blockBeginTime
        + "\n"
        + "blockEndTime="
        + blockEndTime
        + "\n"
        + "blockType="
        + blockType
        + "\n"
        + "}";
  }
}
