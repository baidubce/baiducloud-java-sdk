package com.baidubce.bcm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Tag {
    /**
     * 标签键
     */
    private String key;

    /**
     * 标签值
     */
    private String value;

    public Tag setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public Tag setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Tag{" + "key=" + key + "\n" + "value=" + value + "\n" + "}";
    }

}