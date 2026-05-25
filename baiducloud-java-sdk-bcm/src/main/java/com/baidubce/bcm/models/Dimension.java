package com.baidubce.bcm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Dimension {
    /**
     * 维度名
     */
    private String key;

    /**
     * 维度值
     */
    private String value;

    public Dimension setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public Dimension setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Dimension{" + "key=" + key + "\n" + "value=" + value + "\n" + "}";
    }

}