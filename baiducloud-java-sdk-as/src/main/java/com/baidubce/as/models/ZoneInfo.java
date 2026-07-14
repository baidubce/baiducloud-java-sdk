package com.baidubce.as.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ZoneInfo {
    /**
     * 可用区
     */
    private String zone;

    /**
     * 子网ID
     */
    private String subnetId;

    /**
     * 子网UUID
     */
    private String subnetUuid;

    /**
     * 子网名称
     */
    private String subnetName;

    /**
     * 子网类型
     */
    private Integer subnetType;

    /**
     * 节点数量
     */
    private Integer nodeCount;

    public ZoneInfo setZone(String zone) {
        this.zone = zone;
        return this;
    }

    public String getZone() {
        return this.zone;
    }

    public ZoneInfo setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public ZoneInfo setSubnetUuid(String subnetUuid) {
        this.subnetUuid = subnetUuid;
        return this;
    }

    public String getSubnetUuid() {
        return this.subnetUuid;
    }

    public ZoneInfo setSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }

    public String getSubnetName() {
        return this.subnetName;
    }

    public ZoneInfo setSubnetType(Integer subnetType) {
        this.subnetType = subnetType;
        return this;
    }

    public Integer getSubnetType() {
        return this.subnetType;
    }

    public ZoneInfo setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    public Integer getNodeCount() {
        return this.nodeCount;
    }

    @Override
    public String toString() {
        return "ZoneInfo{" + "zone=" + zone + "\n" + "subnetId=" + subnetId + "\n" + "subnetUuid=" + subnetUuid + "\n" + "subnetName=" + subnetName + "\n" + "subnetType="
                + subnetType + "\n" + "nodeCount=" + nodeCount + "\n" + "}";
    }

}