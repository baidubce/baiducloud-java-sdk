package com.baidubce.bcm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceGroupInstance {
    /**
     * 实例维度键值对列表
     */
    private List<Dimension> dimensions;

    /**
     * 实例所属region
     */
    private String region;

    public InstanceGroupInstance setDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public List<Dimension> getDimensions() {
        return this.dimensions;
    }

    public InstanceGroupInstance setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    @Override
    public String toString() {
        return "InstanceGroupInstance{" + "dimensions=" + dimensions + "\n" + "region=" + region + "\n" + "}";
    }

}