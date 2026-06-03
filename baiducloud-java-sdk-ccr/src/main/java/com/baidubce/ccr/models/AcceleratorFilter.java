package com.baidubce.ccr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AcceleratorFilter {
    /**
     * 镜像加速触发类型
     */
    private String type;

    /**
     * 镜像加速触发类型对应值
     */
    private String value;

    public AcceleratorFilter setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public AcceleratorFilter setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "AcceleratorFilter{" + "type=" + type + "\n" + "value=" + value + "\n" + "}";
    }

}