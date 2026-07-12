package com.baidubce.oos.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TagExpression {
    /**
     * 标签 key
     */
    private String key;

    /**
     * 操作符
     */
    private String op;

    /**
     * 单值
     */
    private String value;

    /**
     * 多值
     */
    private List<String> values;

    public TagExpression setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public TagExpression setOp(String op) {
        this.op = op;
        return this;
    }

    public String getOp() {
        return this.op;
    }

    public TagExpression setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public TagExpression setValues(List<String> values) {
        this.values = values;
        return this;
    }

    public List<String> getValues() {
        return this.values;
    }

    @Override
    public String toString() {
        return "TagExpression{" + "key=" + key + "\n" + "op=" + op + "\n" + "value=" + value + "\n" + "values=" + values + "\n" + "}";
    }

}