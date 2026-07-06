package com.baidubce.aihc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Label {
    /**
     * 标签名
     */
    private String key;

    /**
     * 标签值
     */
    private String value;

    public Label setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public Label setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Label{" + "key=" + key + "\n" + "value=" + value + "\n" + "}";
    }

}