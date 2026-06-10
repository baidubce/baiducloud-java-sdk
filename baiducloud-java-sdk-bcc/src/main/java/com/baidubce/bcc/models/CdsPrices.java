package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CdsPrices {
    /**
     * 磁盘存储类型（查询CDS价格返回）
     */
    private String storageType;

    /**
     * 磁盘容量（查询CDS价格返回）
     */
    private Integer cdsSizeInGB;

    /**
     * 价格（查询CDS价格返回）
     */
    private Double price;

    /**
     * 实例规格的原始标价（查询CDS价格返回）
     */
    private Double specPrice;

    /**
     * 计费单位（查询CDS价格返回）
     */
    private String unit;

    public CdsPrices setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    public String getStorageType() {
        return this.storageType;
    }

    public CdsPrices setCdsSizeInGB(Integer cdsSizeInGB) {
        this.cdsSizeInGB = cdsSizeInGB;
        return this;
    }

    public Integer getCdsSizeInGB() {
        return this.cdsSizeInGB;
    }

    public CdsPrices setPrice(Double price) {
        this.price = price;
        return this;
    }

    public Double getPrice() {
        return this.price;
    }

    public CdsPrices setSpecPrice(Double specPrice) {
        this.specPrice = specPrice;
        return this;
    }

    public Double getSpecPrice() {
        return this.specPrice;
    }

    public CdsPrices setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    public String getUnit() {
        return this.unit;
    }

    @Override
    public String toString() {
        return "CdsPrices{" + "storageType=" + storageType + "\n" + "cdsSizeInGB=" + cdsSizeInGB + "\n" + "price=" + price + "\n" + "specPrice=" + specPrice + "\n" + "unit="
                + unit + "\n" + "}";
    }

}