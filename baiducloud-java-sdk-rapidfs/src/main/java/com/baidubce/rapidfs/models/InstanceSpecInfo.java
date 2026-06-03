package com.baidubce.rapidfs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceSpecInfo {
    /**
     * 
     */
    private String managedMode;

    /**
     * 
     */
    private String metaSpec;

    /**
     * 数据规格，当前 FullyManaged 部署模式提供性能基线规格：* Basic，100MB/s/TiB；* Capacity，200MB/s/TiB
     */
    private String dataSpec;

    /**
     * 全部署模式下，某个数据规格的最小缓存容量，单位 TiB
     */
    private Integer minCapacityTiB;

    /**
     * 全部署模式下，某个数据规格的缓存步长容量，单位 TiB
     */
    private Integer stepCapacityTiB;

    /**
     * 全部署模式下，某个数据规格的最大缓存容量，单位 TiB
     */
    private Integer maxCapacityTiB;

    /**
     * 可购容量信息，见StockInfo
     */
    private List<StockInfo> stockInfos;

    public InstanceSpecInfo setManagedMode(String managedMode) {
        this.managedMode = managedMode;
        return this;
    }

    public String getManagedMode() {
        return this.managedMode;
    }

    public InstanceSpecInfo setMetaSpec(String metaSpec) {
        this.metaSpec = metaSpec;
        return this;
    }

    public String getMetaSpec() {
        return this.metaSpec;
    }

    public InstanceSpecInfo setDataSpec(String dataSpec) {
        this.dataSpec = dataSpec;
        return this;
    }

    public String getDataSpec() {
        return this.dataSpec;
    }

    public InstanceSpecInfo setMinCapacityTiB(Integer minCapacityTiB) {
        this.minCapacityTiB = minCapacityTiB;
        return this;
    }

    public Integer getMinCapacityTiB() {
        return this.minCapacityTiB;
    }

    public InstanceSpecInfo setStepCapacityTiB(Integer stepCapacityTiB) {
        this.stepCapacityTiB = stepCapacityTiB;
        return this;
    }

    public Integer getStepCapacityTiB() {
        return this.stepCapacityTiB;
    }

    public InstanceSpecInfo setMaxCapacityTiB(Integer maxCapacityTiB) {
        this.maxCapacityTiB = maxCapacityTiB;
        return this;
    }

    public Integer getMaxCapacityTiB() {
        return this.maxCapacityTiB;
    }

    public InstanceSpecInfo setStockInfos(List<StockInfo> stockInfos) {
        this.stockInfos = stockInfos;
        return this;
    }

    public List<StockInfo> getStockInfos() {
        return this.stockInfos;
    }

    @Override
    public String toString() {
        return "InstanceSpecInfo{" + "managedMode=" + managedMode + "\n" + "metaSpec=" + metaSpec + "\n" + "dataSpec=" + dataSpec + "\n" + "minCapacityTiB=" + minCapacityTiB
                + "\n" + "stepCapacityTiB=" + stepCapacityTiB + "\n" + "maxCapacityTiB=" + maxCapacityTiB + "\n" + "stockInfos=" + stockInfos + "\n" + "}";
    }

}