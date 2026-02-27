package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuerySubnetListRequest {

  /** marker */
  @JsonIgnore private String marker;

  /** maxKeys */
  @JsonIgnore private Integer maxKeys;

  /** vpcId */
  @JsonIgnore private String vpcId;

  /** zoneName */
  @JsonIgnore private String zoneName;

  /** subnetType */
  @JsonIgnore private String subnetType;

  /** subnetIds */
  @JsonIgnore private String subnetIds;

  public String getMarker() {
    return marker;
  }

  public QuerySubnetListRequest setMarker(String marker) {
    this.marker = marker;
    return this;
  }

  public Integer getMaxKeys() {
    return maxKeys;
  }

  public QuerySubnetListRequest setMaxKeys(Integer maxKeys) {
    this.maxKeys = maxKeys;
    return this;
  }

  public String getVpcId() {
    return vpcId;
  }

  public QuerySubnetListRequest setVpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

  public String getZoneName() {
    return zoneName;
  }

  public QuerySubnetListRequest setZoneName(String zoneName) {
    this.zoneName = zoneName;
    return this;
  }

  public String getSubnetType() {
    return subnetType;
  }

  public QuerySubnetListRequest setSubnetType(String subnetType) {
    this.subnetType = subnetType;
    return this;
  }

  public String getSubnetIds() {
    return subnetIds;
  }

  public QuerySubnetListRequest setSubnetIds(String subnetIds) {
    this.subnetIds = subnetIds;
    return this;
  }
}
