package com.baidubce.bcm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetricDimension {
    /**
     * 维度key
     */
    private String key;

    /**
     * 操作符，可选值：= / !=
     */
    private String operator;

    /**
     * 维度值列表
     */
    private List<String> values;

    public MetricDimension setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public MetricDimension setOperator(String operator) {
        this.operator = operator;
        return this;
    }

    public String getOperator() {
        return this.operator;
    }

    public MetricDimension setValues(List<String> values) {
        this.values = values;
        return this;
    }

    public List<String> getValues() {
        return this.values;
    }

    @Override
    public String toString() {
        return "MetricDimension{" + "key=" + key + "\n" + "operator=" + operator + "\n" + "values=" + values + "\n" + "}";
    }

}