
package com.baidubce.eip.models;



/**
 * Gets or Sets InstanceType
 */
public enum InstanceType {
  
  BCC("BCC"),
  
  BBC("BBC"),
  
  DCC("DCC"),
  
  ENI("ENI"),
  
  BLB("BLB"),
  
  VPN("VPN"),
  
  NAT("NAT");

  private String value;

  InstanceType(String value) {
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