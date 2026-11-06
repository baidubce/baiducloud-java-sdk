package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Para {
    /**
     * 见示例
     */
    private String key;

    /**
     * 见示例
     */
    private String value;

    /**
     * 见示例
     */
    private String range;

    /**
     * 见示例
     */
    private Integer dynamic;

    /**
     * 见示例
     */
    private String desc;

    /**
     * 见示例
     */
    private String attention;

    /**
     * 见示例
     */
    private String type;

    /**
     * 见示例
     */
    private String bestValue;

    /**
     * 见示例
     */
    private Integer precision;

    /**
     * 见示例
     */
    private Boolean required;

    public Para setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public Para setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public Para setRange(String range) {
        this.range = range;
        return this;
    }

    public String getRange() {
        return this.range;
    }

    public Para setDynamic(Integer dynamic) {
        this.dynamic = dynamic;
        return this;
    }

    public Integer getDynamic() {
        return this.dynamic;
    }

    public Para setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public Para setAttention(String attention) {
        this.attention = attention;
        return this;
    }

    public String getAttention() {
        return this.attention;
    }

    public Para setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public Para setBestValue(String bestValue) {
        this.bestValue = bestValue;
        return this;
    }

    public String getBestValue() {
        return this.bestValue;
    }

    public Para setPrecision(Integer precision) {
        this.precision = precision;
        return this;
    }

    public Integer getPrecision() {
        return this.precision;
    }

    public Para setRequired(Boolean required) {
        this.required = required;
        return this;
    }

    public Boolean getRequired() {
        return this.required;
    }

    @Override
    public String toString() {
        return "Para{" + "key=" + key + "\n" + "value=" + value + "\n" + "range=" + range + "\n" + "dynamic=" + dynamic + "\n" + "desc=" + desc + "\n" + "attention=" + attention
                + "\n" + "type=" + type + "\n" + "bestValue=" + bestValue + "\n" + "precision=" + precision + "\n" + "required=" + required + "\n" + "}";
    }

}