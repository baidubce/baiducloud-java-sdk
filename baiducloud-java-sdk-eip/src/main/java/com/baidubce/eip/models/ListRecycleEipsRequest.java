package com.baidubce.eip.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListRecycleEipsRequest {

  /** eip */
  @JsonIgnore private String eip;

  /** name */
  @JsonIgnore private String name;

  /** marker */
  @JsonIgnore private String marker;

  /** maxKeys */
  @JsonIgnore private Integer maxKeys;

  public String getEip() {
    return eip;
  }

  public ListRecycleEipsRequest setEip(String eip) {
    this.eip = eip;
    return this;
  }

  public String getName() {
    return name;
  }

  public ListRecycleEipsRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getMarker() {
    return marker;
  }

  public ListRecycleEipsRequest setMarker(String marker) {
    this.marker = marker;
    return this;
  }

  public Integer getMaxKeys() {
    return maxKeys;
  }

  public ListRecycleEipsRequest setMaxKeys(Integer maxKeys) {
    this.maxKeys = maxKeys;
    return this;
  }
}
