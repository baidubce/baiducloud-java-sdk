package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ZoneResourceDetailSpec {
    /**
     * 可用区名称
     */
    private String zoneName;

    /**
     * ebcResources
     */
    private BbcResources ebcResources;

    /**
     * bccResources
     */
    private BccResources bccResources;

    public ZoneResourceDetailSpec setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public ZoneResourceDetailSpec setEbcResources(BbcResources ebcResources) {
        this.ebcResources = ebcResources;
        return this;
    }

    public BbcResources getEbcResources() {
        return this.ebcResources;
    }

    public ZoneResourceDetailSpec setBccResources(BccResources bccResources) {
        this.bccResources = bccResources;
        return this;
    }

    public BccResources getBccResources() {
        return this.bccResources;
    }

    @Override
    public String toString() {
        return "ZoneResourceDetailSpec{" + "zoneName=" + zoneName + "\n" + "ebcResources=" + ebcResources + "\n" + "bccResources=" + bccResources + "\n" + "}";
    }

}