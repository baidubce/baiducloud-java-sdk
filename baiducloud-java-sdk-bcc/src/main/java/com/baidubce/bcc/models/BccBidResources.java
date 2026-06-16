package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BccBidResources {
    /**
     * 实例类型
     */
    private String instanceType;

    /**
     * 套餐规格列表
     */
    private List<BccBidFlavors> flavors;

    public BccBidResources setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public BccBidResources setFlavors(List<BccBidFlavors> flavors) {
        this.flavors = flavors;
        return this;
    }

    public List<BccBidFlavors> getFlavors() {
        return this.flavors;
    }

    @Override
    public String toString() {
        return "BccBidResources{" + "instanceType=" + instanceType + "\n" + "flavors=" + flavors + "\n" + "}";
    }

}