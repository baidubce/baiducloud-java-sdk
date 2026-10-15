package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubnetMap {
    /**
     * 可用区
     */
    private String zoneName;

    /**
     * 子网ID
     */
    private String subnetId;

    public SubnetMap setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public SubnetMap setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    @Override
    public String toString() {
        return "SubnetMap{" + "zoneName=" + zoneName + "\n" + "subnetId=" + subnetId + "\n" + "}";
    }

}