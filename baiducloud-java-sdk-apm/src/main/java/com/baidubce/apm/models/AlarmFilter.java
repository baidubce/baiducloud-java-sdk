package com.baidubce.apm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlarmFilter {
    /**
     * 维度名称
     */
    private String key;

    /**
     * 
     */
    private String operator;

    /**
     * 维度值列表，若包含`*`则表示遍历该维度所有值
     */
    private List<String> values;

    public AlarmFilter setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public AlarmFilter setOperator(String operator) {
        this.operator = operator;
        return this;
    }

    public String getOperator() {
        return this.operator;
    }

    public AlarmFilter setValues(List<String> values) {
        this.values = values;
        return this;
    }

    public List<String> getValues() {
        return this.values;
    }

    @Override
    public String toString() {
        return "AlarmFilter{" + "key=" + key + "\n" + "operator=" + operator + "\n" + "values=" + values + "\n" + "}";
    }

}