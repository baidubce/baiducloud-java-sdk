package com.baidubce.apm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SampleFilter {
    /**
     * 过滤字段名
     */
    private String key;

    /**
     * 过滤操作，可选项：`=` - 等于，`contains` - 字符串包含，`is_true` - 等于true，`is_false` - 等于false
     */
    private String op;

    /**
     * 过滤值
     */
    private String value;

    public SampleFilter setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public SampleFilter setOp(String op) {
        this.op = op;
        return this;
    }

    public String getOp() {
        return this.op;
    }

    public SampleFilter setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "SampleFilter{" + "key=" + key + "\n" + "op=" + op + "\n" + "value=" + value + "\n" + "}";
    }

}