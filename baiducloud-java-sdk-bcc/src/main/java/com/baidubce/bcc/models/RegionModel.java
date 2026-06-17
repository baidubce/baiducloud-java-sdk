package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegionModel {
    /**
     * 地域ID，例：bj
     */
    private String regionId;

    /**
     * 地域名称，例：华北-北京
     */
    private String regionName;

    /**
     * 地域对应的接入地址（Endpoint）
     */
    private String regionEndpoint;

    public RegionModel setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public RegionModel setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    public String getRegionName() {
        return this.regionName;
    }

    public RegionModel setRegionEndpoint(String regionEndpoint) {
        this.regionEndpoint = regionEndpoint;
        return this;
    }

    public String getRegionEndpoint() {
        return this.regionEndpoint;
    }

    @Override
    public String toString() {
        return "RegionModel{" + "regionId=" + regionId + "\n" + "regionName=" + regionName + "\n" + "regionEndpoint=" + regionEndpoint + "\n" + "}";
    }

}