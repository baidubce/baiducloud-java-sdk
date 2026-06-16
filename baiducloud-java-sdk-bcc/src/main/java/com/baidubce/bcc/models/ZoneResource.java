package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ZoneResource {
    /**
     * 可用区名称
     */
    private String zoneName;

    /**
     * BCC资源列表
     */
    private List<BccBidResources> bccResources;

    public ZoneResource setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public ZoneResource setBccResources(List<BccBidResources> bccResources) {
        this.bccResources = bccResources;
        return this;
    }

    public List<BccBidResources> getBccResources() {
        return this.bccResources;
    }

    @Override
    public String toString() {
        return "ZoneResource{" + "zoneName=" + zoneName + "\n" + "bccResources=" + bccResources + "\n" + "}";
    }

}