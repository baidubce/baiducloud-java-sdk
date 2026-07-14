package com.baidubce.as.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Dimension {
    /**
     * 名称
     */
    private String name;

    /**
     * 值
     */
    private String value;

    public Dimension setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
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
        return "Dimension{" + "name=" + name + "\n" + "value=" + value + "\n" + "}";
    }

}