package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubnetInfo {
    /**
     * 子网短ID
     */
    private String subnetId;

    /**
     * 子网名称
     */
    private String name;

    /**
     * 子网网段
     */
    private String cidr;

    /**
     * 子网所在可用区
     */
    private String az;

    public SubnetInfo setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public SubnetInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public SubnetInfo setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    public String getCidr() {
        return this.cidr;
    }

    public SubnetInfo setAz(String az) {
        this.az = az;
        return this;
    }

    public String getAz() {
        return this.az;
    }

    @Override
    public String toString() {
        return "SubnetInfo{" + "subnetId=" + subnetId + "\n" + "name=" + name + "\n" + "cidr=" + cidr + "\n" + "az=" + az + "\n" + "}";
    }

}