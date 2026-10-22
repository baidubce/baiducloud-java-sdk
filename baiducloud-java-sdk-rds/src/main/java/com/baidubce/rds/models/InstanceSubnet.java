package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceSubnet {
    /**
     * 子网名称。
     */
    private String name;

    /**
     * 子网长ID。
     */
    private String subnetId;

    /**
     * 可用区。
     */
    private String az;

    /**
     * 可用区名称。
     */
    private String zoneName;

    /**
     * Ipv4地址及子网掩码。
     */
    private String cidr;

    /**
     * 子网短ID。
     */
    private String shortId;

    public InstanceSubnet setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public InstanceSubnet setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public InstanceSubnet setAz(String az) {
        this.az = az;
        return this;
    }

    public String getAz() {
        return this.az;
    }

    public InstanceSubnet setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public InstanceSubnet setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    public String getCidr() {
        return this.cidr;
    }

    public InstanceSubnet setShortId(String shortId) {
        this.shortId = shortId;
        return this;
    }

    public String getShortId() {
        return this.shortId;
    }

    @Override
    public String toString() {
        return "InstanceSubnet{" + "name=" + name + "\n" + "subnetId=" + subnetId + "\n" + "az=" + az + "\n" + "zoneName=" + zoneName + "\n" + "cidr=" + cidr + "\n" + "shortId="
                + shortId + "\n" + "}";
    }

}