package com.baidubce.vdb.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ZoneDetail {
    /**
     * 
     */
    private List<String> apiZoneNames;

    /**
     * 
     */
    private Boolean available;

    /**
     * 
     */
    private String defaultSubnetId;

    /**
     * 
     */
    private Integer maxCpuCount;

    /**
     * 
     */
    private Integer maxMemory;

    /**
     * 
     */
    private Integer maxStorage;

    /**
     * 
     */
    private Integer stockState;

    /**
     * 
     */
    private String zoneNameStr;

    /**
     * 
     */
    private List<String> zoneNames;

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

    public ZoneDetail setStockState(Integer stockState) {
        this.stockState = stockState;
        return this;
    }

    public Integer getStockState() {
        return this.stockState;
    }

    public ZoneDetail setZoneNameStr(String zoneNameStr) {
        this.zoneNameStr = zoneNameStr;
        return this;
    }

    public String getZoneNameStr() {
        return this.zoneNameStr;
    }

    public ZoneDetail setZoneNames(List<String> zoneNames) {
        this.zoneNames = zoneNames;
        return this;
    }

    public List<String> getZoneNames() {
        return this.zoneNames;
    }

    @Override
    public String toString() {
        return "ZoneDetail{" + "apiZoneNames=" + apiZoneNames + "\n" + "available=" + available + "\n" + "defaultSubnetId=" + defaultSubnetId + "\n" + "maxCpuCount=" + maxCpuCount
                + "\n" + "maxMemory=" + maxMemory + "\n" + "maxStorage=" + maxStorage + "\n" + "stockState=" + stockState + "\n" + "zoneNameStr=" + zoneNameStr + "\n"
                + "zoneNames=" + zoneNames + "\n" + "}";
    }

}