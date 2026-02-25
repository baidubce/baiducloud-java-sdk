
package com.baidubce.eip.models;



/**
 * Gets or Sets EipStatus
 */
public enum EipStatus {
  
  CREATING("creating"),
  
  AVAILABLE("available"),
  
  BINDED("binded"),
  
  BINDING("binding"),
  
  UNBINDING("unbinding"),
  
  UPDATING("updating"),
  
  PAUSED("paused"),
  
  UNAVAILABLE("unavailable");

  private String value;

  EipStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }




}