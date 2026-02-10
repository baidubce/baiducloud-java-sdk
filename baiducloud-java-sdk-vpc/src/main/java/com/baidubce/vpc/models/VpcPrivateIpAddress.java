
package com.baidubce.vpc.models;



import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VpcPrivateIpAddress  {
    /**
     * 所属子网CIDR
     */
    private String cidr;

    /**
     * VPC内网IP
     */
    private String privateIpAddress;

    /**
     * VPC内网IP的类型
     */
    private String privateIpAddressType;

    /**
     * 创建时间
     */
    private String createdTime;

    public VpcPrivateIpAddress setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    public String getCidr() {
        return this.cidr;
    }

    public VpcPrivateIpAddress setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public VpcPrivateIpAddress setPrivateIpAddressType(String privateIpAddressType) {
        this.privateIpAddressType = privateIpAddressType;
        return this;
    }

    public String getPrivateIpAddressType() {
        return this.privateIpAddressType;
    }

    public VpcPrivateIpAddress setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    @Override
    public String toString() {
        return "VpcPrivateIpAddress{"
                + "cidr=" + cidr + "\n"
                + "privateIpAddress=" + privateIpAddress + "\n"
                + "privateIpAddressType=" + privateIpAddressType + "\n"
                + "createdTime=" + createdTime + "\n"
                + "}";
    }




}