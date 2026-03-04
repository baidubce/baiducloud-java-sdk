package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SharedDataPackageInquiryRequest extends BaseBceRequest {

  /** clientToken */
  @JsonIgnore private String clientToken;

  /** 共享流量包有效期（单位：月），1/6/12 */
  private Integer reservationLength;

  /**
   * 共享流量包容量，有效期为1时，对应可选规格 "10G"/"50G"/"100G"/"500G"/"1T"/"5T"/"10T"/"50T"； 有效期为6时，对应可选规格
   * "60G"/"300G"/"600G"/"3T"/"6T"/"30T"/"60T"/"300T"； 有效期为12时，对应可选规格
   * "1T"/"10T"/"50T"/"100T"/"500T"/"1P"，需按照对应可选规格进行容量选择
   */
  private String capacity;

  /**
   * 共享流量包扣费策略，包含 "FullTimeDurationPackage" 全时；"TimeDurationPackage" 闲时，默认为
   * "FullTimeDurationPackage"
   */
  private String deductPolicy;

  /** 共享流量包线路类型，当前支持 "WebOutBytes" 动态，默认为 "WebOutBytes" */
  private String packageType;

  public String getClientToken() {
    return clientToken;
  }

  public SharedDataPackageInquiryRequest setClientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

  public Integer getReservationLength() {
    return reservationLength;
  }

  public SharedDataPackageInquiryRequest setReservationLength(Integer reservationLength) {
    this.reservationLength = reservationLength;
    return this;
  }

  public String getCapacity() {
    return capacity;
  }

  public SharedDataPackageInquiryRequest setCapacity(String capacity) {
    this.capacity = capacity;
    return this;
  }

  public String getDeductPolicy() {
    return deductPolicy;
  }

  public SharedDataPackageInquiryRequest setDeductPolicy(String deductPolicy) {
    this.deductPolicy = deductPolicy;
    return this;
  }

  public String getPackageType() {
    return packageType;
  }

  public SharedDataPackageInquiryRequest setPackageType(String packageType) {
    this.packageType = packageType;
    return this;
  }
}
