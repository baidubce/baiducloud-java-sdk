package com.baidubce.aihc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Env {
    /**
     * 标签名
     */
    private String name;

    /**
     * 标签值
     */
    private String value;

    public Env setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Env setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Env{" + "name=" + name + "\n" + "value=" + value + "\n" + "}";
    }

}