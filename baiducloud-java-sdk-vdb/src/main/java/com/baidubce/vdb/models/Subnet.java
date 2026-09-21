package com.baidubce.vdb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Subnet {
    /**
     * 
     */
    private String az;

    /**
     * 
     */
    private String cidr;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String shortId;

    /**
     * 
     */
    private String subnetId;

    public Subnet setAz(String az) {
        this.az = az;
        return this;
    }

    public String getAz() {
        return this.az;
    }

    public Subnet setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    public String getCidr() {
        return this.cidr;
    }

    public Subnet setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Subnet setShortId(String shortId) {
        this.shortId = shortId;
        return this;
    }

    public String getShortId() {
        return this.shortId;
    }

    public Subnet setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    @Override
    public String toString() {
        return "Subnet{" + "az=" + az + "\n" + "cidr=" + cidr + "\n" + "name=" + name + "\n" + "shortId=" + shortId + "\n" + "subnetId=" + subnetId + "\n" + "}";
    }

}