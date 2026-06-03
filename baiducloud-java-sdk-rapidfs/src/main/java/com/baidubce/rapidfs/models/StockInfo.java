package com.baidubce.rapidfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StockInfo {
    /**
     * 用户可购买的可用区，例如 zoneA
     */
    private String zone;

    /**
     * FullyManaged 部署模式下，可购买的缓存容量，0 表示售罄，单位 TiB
     */
    private Integer stockCapacityTiB;

    /**
     * MasterManaged 部署模式下，可购买的 Master 托管实例数量，0 表示售罄
     */
    private Integer stockQuantity;

    public StockInfo setZone(String zone) {
        this.zone = zone;
        return this;
    }

    public String getZone() {
        return this.zone;
    }

    public StockInfo setStockCapacityTiB(Integer stockCapacityTiB) {
        this.stockCapacityTiB = stockCapacityTiB;
        return this;
    }

    public Integer getStockCapacityTiB() {
        return this.stockCapacityTiB;
    }

    public StockInfo setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
        return this;
    }

    public Integer getStockQuantity() {
        return this.stockQuantity;
    }

    @Override
    public String toString() {
        return "StockInfo{" + "zone=" + zone + "\n" + "stockCapacityTiB=" + stockCapacityTiB + "\n" + "stockQuantity=" + stockQuantity + "\n" + "}";
    }

}