package com.baidubce.rds.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ZoneDetail {
    /**
     * 可用区名称的列表，显示当前的可用区名称
     */
    private List<String> zoneNames;

    /**
     * api可用区名称列表，显示当前的可用区名称，这个字段属于openApi专属字段
     */
    private List<String> apiZoneNames;

    /**
     * 可用区状态：true(可用) ， false(不可用)
     */
    private Boolean available;

    /**
     * 当前可用区名称
     */
    private String zoneNameStr;

    /**
     * 默认子网ID
     */
    private String defaultSubnetId;

    /**
     * 可用区，统计最大CPU数
     */
    private Integer maxCpuCount;

    /**
     * 可用区，最大内存容量
     */
    private Integer maxMemory;

    /**
     * 可用区，最大磁盘存储容量
     */
    private Integer maxStorage;

    /**
     * 是否支持Nvme磁盘。 true（支持），false（不支持）
     */
    private Boolean supportNvmeDisk;

    /**
     * 可用区类型，例如 normal
     */
    private String zoneType;

    public ZoneDetail setZoneNames(List<String> zoneNames) {
        this.zoneNames = zoneNames;
        return this;
    }

    public List<String> getZoneNames() {
        return this.zoneNames;
    }

    public ZoneDetail setApiZoneNames(List<String> apiZoneNames) {
        this.apiZoneNames = apiZoneNames;
        return this;
    }

    public List<String> getApiZoneNames() {
        return this.apiZoneNames;
    }

    public ZoneDetail setAvailable(Boolean available) {
        this.available = available;
        return this;
    }

    public Boolean getAvailable() {
        return this.available;
    }

    public ZoneDetail setZoneNameStr(String zoneNameStr) {
        this.zoneNameStr = zoneNameStr;
        return this;
    }

    public String getZoneNameStr() {
        return this.zoneNameStr;
    }

    public ZoneDetail setDefaultSubnetId(String defaultSubnetId) {
        this.defaultSubnetId = defaultSubnetId;
        return this;
    }

    public String getDefaultSubnetId() {
        return this.defaultSubnetId;
    }

    public ZoneDetail setMaxCpuCount(Integer maxCpuCount) {
        this.maxCpuCount = maxCpuCount;
        return this;
    }

    public Integer getMaxCpuCount() {
        return this.maxCpuCount;
    }

    public ZoneDetail setMaxMemory(Integer maxMemory) {
        this.maxMemory = maxMemory;
        return this;
    }

    public Integer getMaxMemory() {
        return this.maxMemory;
    }

    public ZoneDetail setMaxStorage(Integer maxStorage) {
        this.maxStorage = maxStorage;
        return this;
    }

    public Integer getMaxStorage() {
        return this.maxStorage;
    }

    public ZoneDetail setSupportNvmeDisk(Boolean supportNvmeDisk) {
        this.supportNvmeDisk = supportNvmeDisk;
        return this;
    }

    public Boolean getSupportNvmeDisk() {
        return this.supportNvmeDisk;
    }

    public ZoneDetail setZoneType(String zoneType) {
        this.zoneType = zoneType;
        return this;
    }

    public String getZoneType() {
        return this.zoneType;
    }

    @Override
    public String toString() {
        return "ZoneDetail{" + "zoneNames=" + zoneNames + "\n" + "apiZoneNames=" + apiZoneNames + "\n" + "available=" + available + "\n" + "zoneNameStr=" + zoneNameStr + "\n"
                + "defaultSubnetId=" + defaultSubnetId + "\n" + "maxCpuCount=" + maxCpuCount + "\n" + "maxMemory=" + maxMemory + "\n" + "maxStorage=" + maxStorage + "\n"
                + "supportNvmeDisk=" + supportNvmeDisk + "\n" + "zoneType=" + zoneType + "\n" + "}";
    }

}