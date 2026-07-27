package com.baidubce.oos.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeyValuePair {
    /**
     * 键
     */
    private String key;

    /**
     * 值
     */
    private String value;

    public KeyValuePair setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public KeyValuePair setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "KeyValuePair{" + "key=" + key + "\n" + "value=" + value + "\n" + "}";
    }

}