package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BccBidFlavors {
    /**
     * 规格族ID
     */
    private String specId;

    /**
     * CPU核数
     */
    private Integer cpuCount;

    /**
     * 内存容量，单位GB
     */
    private Integer memoryCapacityInGB;

    /**
     * 产品类型
     */
    private String productType;

    /**
     * 实例规格
     */
    private String spec;

    public BccBidFlavors setSpecId(String specId) {
        this.specId = specId;
        return this;
    }

    public String getSpecId() {
        return this.specId;
    }

    public BccBidFlavors setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public BccBidFlavors setMemoryCapacityInGB(Integer memoryCapacityInGB) {
        this.memoryCapacityInGB = memoryCapacityInGB;
        return this;
    }

    public Integer getMemoryCapacityInGB() {
        return this.memoryCapacityInGB;
    }

    public BccBidFlavors setProductType(String productType) {
        this.productType = productType;
        return this;
    }

    public String getProductType() {
        return this.productType;
    }

    public BccBidFlavors setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public String getSpec() {
        return this.spec;
    }

    @Override
    public String toString() {
        return "BccBidFlavors{" + "specId=" + specId + "\n" + "cpuCount=" + cpuCount + "\n" + "memoryCapacityInGB=" + memoryCapacityInGB + "\n" + "productType=" + productType
                + "\n" + "spec=" + spec + "\n" + "}";
    }

}