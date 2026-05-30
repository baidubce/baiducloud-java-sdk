package com.baidubce.pfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubnetDetail {
    /**
     * 子网掩码
     */
    private String cidr;

    /**
     * PFS实例所在物理Zone
     */
    private String physicalZone;

    /**
     * 子网ID
     */
    private String subnetId;

    /**
     * PFS实例所在逻辑Zone
     */
    private String zoneName;

    public SubnetDetail setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    public String getCidr() {
        return this.cidr;
    }

    public SubnetDetail setPhysicalZone(String physicalZone) {
        this.physicalZone = physicalZone;
        return this;
    }

    public String getPhysicalZone() {
        return this.physicalZone;
    }

    public SubnetDetail setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public SubnetDetail setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    @Override
    public String toString() {
        return "SubnetDetail{" + "cidr=" + cidr + "\n" + "physicalZone=" + physicalZone + "\n" + "subnetId=" + subnetId + "\n" + "zoneName=" + zoneName + "\n" + "}";
    }

}