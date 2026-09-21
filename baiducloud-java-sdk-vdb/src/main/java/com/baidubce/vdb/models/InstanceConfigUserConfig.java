package com.baidubce.vdb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceConfigUserConfig {
    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Object value;

    public InstanceConfigUserConfig setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public InstanceConfigUserConfig setValue(Object value) {
        this.value = value;
        return this;
    }

    public Object getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "InstanceConfigUserConfig{" + "name=" + name + "\n" + "value=" + value + "\n" + "}";
    }

}