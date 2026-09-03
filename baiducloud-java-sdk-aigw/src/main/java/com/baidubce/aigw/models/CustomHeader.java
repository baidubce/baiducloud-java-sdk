package com.baidubce.aigw.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomHeader {
    /**
     * HTTP 头名称，同一列表中不能重复
     */
    private String key;

    /**
     * HTTP 头值
     */
    private String value;

    public CustomHeader setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public CustomHeader setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "CustomHeader{" + "key=" + key + "\n" + "value=" + value + "\n" + "}";
    }

}