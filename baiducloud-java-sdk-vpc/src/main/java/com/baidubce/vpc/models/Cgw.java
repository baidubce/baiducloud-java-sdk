package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cgw {
  /** 用户网关ID */
  private String cgwId;

  /** 用户网关名称 */
  private String name;

  /** 用户网关IP */
  private String ip;

  /** 用户网关描述 */
  private String description;

  /** 用户网关创建时间，北京时间 */
  private String createdTime;

  /** 用户网关修改时间，北京时间 */
  private String updatedTime;

  public Cgw setCgwId(String cgwId) {
    this.cgwId = cgwId;
    return this;
  }

  public String getCgwId() {
    return this.cgwId;
  }

  public Cgw setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return this.name;
  }

  public Cgw setIp(String ip) {
    this.ip = ip;
    return this;
  }

  public String getIp() {
    return this.ip;
  }

  public Cgw setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return this.description;
  }

  public Cgw setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  public String getCreatedTime() {
    return this.createdTime;
  }

  public Cgw setUpdatedTime(String updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  public String getUpdatedTime() {
    return this.updatedTime;
  }

  @Override
  public String toString() {
    return "Cgw{"
        + "cgwId="
        + cgwId
        + "\n"
        + "name="
        + name
        + "\n"
        + "ip="
        + ip
        + "\n"
        + "description="
        + description
        + "\n"
        + "createdTime="
        + createdTime
        + "\n"
        + "updatedTime="
        + updatedTime
        + "\n"
        + "}";
  }
}
