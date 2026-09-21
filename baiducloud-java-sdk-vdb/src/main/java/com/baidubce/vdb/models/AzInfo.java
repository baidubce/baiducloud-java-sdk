package com.baidubce.vdb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AzInfo {
    /**
     * 
     */
    private String availabilityZone;

    /**
     * 
     */
    private Integer count;

    /**
     * 
     */
    private String subnetId;

    public AzInfo setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    public AzInfo setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getCount() {
        return this.count;
    }

    public AzInfo setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    @Override
    public String toString() {
        return "AzInfo{" + "availabilityZone=" + availabilityZone + "\n" + "count=" + count + "\n" + "subnetId=" + subnetId + "\n" + "}";
    }

}