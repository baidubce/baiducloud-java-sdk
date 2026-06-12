package com.baidubce.bcm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Filter {
    /**
     * 过滤字段名，如 InstanceId
     */
    private String key;

    /**
     * 过滤操作，可选值：= / != / in
     */
    private String op;

    /**
     * 单值，可用于操作符: =, !=
     */
    private String value;

    /**
     * 多值，可用于操作符：in
     */
    private List<String> values;

    public Filter setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public Filter setOp(String op) {
        this.op = op;
        return this;
    }

    public String getOp() {
        return this.op;
    }

    public Filter setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public Filter setValues(List<String> values) {
        this.values = values;
        return this;
    }

    public List<String> getValues() {
        return this.values;
    }

    @Override
    public String toString() {
        return "Filter{" + "key=" + key + "\n" + "op=" + op + "\n" + "value=" + value + "\n" + "values=" + values + "\n" + "}";
    }

}