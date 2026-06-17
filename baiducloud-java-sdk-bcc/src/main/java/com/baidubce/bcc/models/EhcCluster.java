package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EhcCluster {
    /**
     * EHC集群id（EHC集群列表接口返回）
     */
    private String ehcClusterId;

    /**
     * EHC集群name（EHC集群列表接口返回）
     */
    private String name;

    /**
     * EHC集群描述（EHC集群列表接口返回）
     */
    private String description;

    /**
     * 可用区信息（EHC集群列表接口返回）
     */
    private String zoneName;

    /**
     * 创建时间（EHC集群列表接口返回）
     */
    private String createdTime;

    /**
     * 集群下实例id列表（EHC集群列表接口返回）
     */
    private List<String> instanceIds;

    /**
     * 集群下预留实例券id列表（EHC集群列表接口返回）
     */
    private List<String> reservedInstanceIds;

    public EhcCluster setEhcClusterId(String ehcClusterId) {
        this.ehcClusterId = ehcClusterId;
        return this;
    }

    public String getEhcClusterId() {
        return this.ehcClusterId;
    }

    public EhcCluster setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public EhcCluster setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public EhcCluster setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public EhcCluster setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public EhcCluster setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public EhcCluster setReservedInstanceIds(List<String> reservedInstanceIds) {
        this.reservedInstanceIds = reservedInstanceIds;
        return this;
    }

    public List<String> getReservedInstanceIds() {
        return this.reservedInstanceIds;
    }

    @Override
    public String toString() {
        return "EhcCluster{" + "ehcClusterId=" + ehcClusterId + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "zoneName=" + zoneName + "\n" + "createdTime="
                + createdTime + "\n" + "instanceIds=" + instanceIds + "\n" + "reservedInstanceIds=" + reservedInstanceIds + "\n" + "}";
    }

}