package com.baidubce.apm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlarmRule {
    /**
     * 逻辑运算符，可选项：`and` - 且，`or` - 或。作为逻辑组合节点时必填
     */
    private String operator;

    /**
     * 子规则列表，当operator为and/or时必填
     */
    private List<AlarmRule> rules;

    /**
     * 指标名，作为叶子节点（指标表达式）时必填
     */
    private String metric;

    /**
     * 聚合窗口，单位：秒，不可小于60
     */
    private Integer windowInSeconds;

    /**
     * 
     */
    private String aggregate;

    /**
     * 阈值（显示值）
     */
    private Float displayValue;

    /**
     * 阈值单位
     */
    private String displayUnit;

    public AlarmRule setOperator(String operator) {
        this.operator = operator;
        return this;
    }

    public String getOperator() {
        return this.operator;
    }

    public AlarmRule setRules(List<AlarmRule> rules) {
        this.rules = rules;
        return this;
    }

    public List<AlarmRule> getRules() {
        return this.rules;
    }

    public AlarmRule setMetric(String metric) {
        this.metric = metric;
        return this;
    }

    public String getMetric() {
        return this.metric;
    }

    public AlarmRule setWindowInSeconds(Integer windowInSeconds) {
        this.windowInSeconds = windowInSeconds;
        return this;
    }

    public Integer getWindowInSeconds() {
        return this.windowInSeconds;
    }

    public AlarmRule setAggregate(String aggregate) {
        this.aggregate = aggregate;
        return this;
    }

    public String getAggregate() {
        return this.aggregate;
    }

    public AlarmRule setDisplayValue(Float displayValue) {
        this.displayValue = displayValue;
        return this;
    }

    public Float getDisplayValue() {
        return this.displayValue;
    }

    public AlarmRule setDisplayUnit(String displayUnit) {
        this.displayUnit = displayUnit;
        return this;
    }

    public String getDisplayUnit() {
        return this.displayUnit;
    }

    @Override
    public String toString() {
        return "AlarmRule{" + "operator=" + operator + "\n" + "rules=" + rules + "\n" + "metric=" + metric + "\n" + "windowInSeconds=" + windowInSeconds + "\n" + "aggregate="
                + aggregate + "\n" + "displayValue=" + displayValue + "\n" + "displayUnit=" + displayUnit + "\n" + "}";
    }

}