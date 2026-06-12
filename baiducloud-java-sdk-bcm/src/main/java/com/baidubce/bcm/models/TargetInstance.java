package com.baidubce.bcm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TargetInstance {
    /**
     * 实例维度键值对列表
     */
    private List<Dimension> dimensions;

    public TargetInstance setDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public List<Dimension> getDimensions() {
        return this.dimensions;
    }

    @Override
    public String toString() {
        return "TargetInstance{" + "dimensions=" + dimensions + "\n" + "}";
    }

}