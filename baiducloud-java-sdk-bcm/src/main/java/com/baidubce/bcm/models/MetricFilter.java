package com.baidubce.bcm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetricFilter {
    /**
     * 过滤字段名称。配置filters时必填，可填写指标标签名称或指标维度名称
     */
    private String key;

    /**
     * 过滤操作符，可选值：= / != / contains / in
     */
    private String op;

    /**
     * 单值过滤条件，用于=、!=或contains操作符。对指标维度使用空字符串时，可用于判断该维度是否存在
     */
    private String value;

    /**
     * 多值过滤条件，op为in时必填，匹配任意一个值即满足当前条件
     */
    private List<String> values;

    public MetricFilter setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public MetricFilter setOp(String op) {
        this.op = op;
        return this;
    }

    public String getOp() {
        return this.op;
    }

    public MetricFilter setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public MetricFilter setValues(List<String> values) {
        this.values = values;
        return this;
    }

    public List<String> getValues() {
        return this.values;
    }

    @Override
    public String toString() {
        return "MetricFilter{" + "key=" + key + "\n" + "op=" + op + "\n" + "value=" + value + "\n" + "values=" + values + "\n" + "}";
    }

}