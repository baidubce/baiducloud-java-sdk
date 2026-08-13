package com.baidubce.aigw.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomHeader {
    /**
     * 请求头名称
     */
    private String key;

    /**
     * 请求头值
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