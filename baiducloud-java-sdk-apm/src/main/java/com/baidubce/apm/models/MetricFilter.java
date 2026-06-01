package com.baidubce.apm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetricFilter {
    /**
     * 过滤字段名
     */
    private String key;

    /**
     * 过滤操作，可选项：`=` - 等于，`!=` - 不等于，`contains` - 包含
     */
    private String op;

    /**
     * 过滤值
     */
    private String value;

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

    @Override
    public String toString() {
        return "MetricFilter{" + "key=" + key + "\n" + "op=" + op + "\n" + "value=" + value + "\n" + "}";
    }

}