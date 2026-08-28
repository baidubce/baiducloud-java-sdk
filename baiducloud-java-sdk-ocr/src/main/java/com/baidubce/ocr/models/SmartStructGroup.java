package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SmartStructGroup {
    /**
     * key 文字行的信息
     */
    private List<SmartStructTextLine> key;

    /**
     * value 文字行的信息
     */
    private List<SmartStructTextLine> value;

    public SmartStructGroup setKey(List<SmartStructTextLine> key) {
        this.key = key;
        return this;
    }

    public List<SmartStructTextLine> getKey() {
        return this.key;
    }

    public SmartStructGroup setValue(List<SmartStructTextLine> value) {
        this.value = value;
        return this;
    }

    public List<SmartStructTextLine> getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "SmartStructGroup{" + "key=" + key + "\n" + "value=" + value + "\n" + "}";
    }

}