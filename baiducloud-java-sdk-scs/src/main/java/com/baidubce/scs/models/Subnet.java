package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Subnet {
    /**
     * 子网名
     */
    private String name;

    /**
     * 子网Id
     */
    private String subnetId;

    /**
     * 子网所在可用区
     */
    private String zoneName;

    /**
     * 子网cidr
     */
    private String cidr;

    /**
     * 所属vpc的id
     */
    private String vpcId;

    public Subnet setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Subnet setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public Subnet setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public Subnet setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    public String getCidr() {
        return this.cidr;
    }

    public Subnet setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    @Override
    public String toString() {
        return "Subnet{" + "name=" + name + "\n" + "subnetId=" + subnetId + "\n" + "zoneName=" + zoneName + "\n" + "cidr=" + cidr + "\n" + "vpcId=" + vpcId + "\n" + "}";
    }

}