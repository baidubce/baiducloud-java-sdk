package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserGatewayListRequest {

  /** marker */
  @JsonIgnore private String marker;

  /** maxKeys */
  @JsonIgnore private Integer maxKeys;

  public String getMarker() {
    return marker;
  }

  public UserGatewayListRequest setMarker(String marker) {
    this.marker = marker;
    return this;
  }

  public Integer getMaxKeys() {
    return maxKeys;
  }

  public UserGatewayListRequest setMaxKeys(Integer maxKeys) {
    this.maxKeys = maxKeys;
    return this;
  }
}
