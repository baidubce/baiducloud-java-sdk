package com.baidubce.rapidfs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AihcResourcePoolInfo {
    /**
     * 百舸资源池 ID
     */
    private String resourcePoolId;

    /**
     * 百舸资源池名称（排序键）
     */
    private String name;

    /**
     * 百舸资源池类型
     */
    private String type;

    /**
     * 百舸资源池关联的可用区列表，由其子网自动聚合得出
     */
    private List<String> zones;

    /**
     * 
     */
    private List<String> boundInstanceIds;

    public AihcResourcePoolInfo setResourcePoolId(String resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
        return this;
    }

    public String getResourcePoolId() {
        return this.resourcePoolId;
    }

    public AihcResourcePoolInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public AihcResourcePoolInfo setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public AihcResourcePoolInfo setZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    public List<String> getZones() {
        return this.zones;
    }

    public AihcResourcePoolInfo setBoundInstanceIds(List<String> boundInstanceIds) {
        this.boundInstanceIds = boundInstanceIds;
        return this;
    }

    public List<String> getBoundInstanceIds() {
        return this.boundInstanceIds;
    }

    @Override
    public String toString() {
        return "AihcResourcePoolInfo{" + "resourcePoolId=" + resourcePoolId + "\n" + "name=" + name + "\n" + "type=" + type + "\n" + "zones=" + zones + "\n" + "boundInstanceIds="
                + boundInstanceIds + "\n" + "}";
    }

}