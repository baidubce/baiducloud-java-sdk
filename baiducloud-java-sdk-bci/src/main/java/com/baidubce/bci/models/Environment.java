package com.baidubce.bci.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Environment {
    /**
     * 环境变量名
     */
    private String key;

    /**
     * 环境变量值
     */
    private String value;

    public Environment setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public Environment setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Environment{" + "key=" + key + "\n" + "value=" + value + "\n" + "}";
    }

}