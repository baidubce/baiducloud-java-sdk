package com.baidubce.as.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScaleCondition {
    /**
     * 指标类型，如伸缩组指标为ASG
     */
    private String targetType;

    /**
     * 报警监控实例，如伸缩组ID：asg-CClxxxxx
     */
    private String targetId;

    /**
     * 监控指标。如伸缩组CPU使用率均值为CPUUsagePercent_Average
     */
    private String indicator;

    /**
     * 阈值
     */
    private String threshold;

    /**
     * 单位
     */
    private String unit;

    /**
     * 比较运算符，支持'>'，'<'，'='
     */
    private String comparisonOperator;

    /**
     * 定时规则或周期规则：当日执行时间。如12:30
     */
    private String cronTime;

    /**
     * 不重复触发时间
     */
    private String triggerTime;

    /**
     * 包括：CRONTAB(定时伸缩),ALARM(报警触发伸缩),PERIOD(周期伸缩)
     */
    private String type;

    /**
     * 周期单位，可选值为DAY/WEEK/MONTH/CronExpression
     */
    private String periodType;

    /**
     * 周期触发日期，1-7标识周1-周日，1-31表示1号到31号，与periodType相关
     */
    private Integer periodValue;

    /**
     * 报警类规则
     */
    private String alarmRule;

    public ScaleCondition setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    public String getTargetType() {
        return this.targetType;
    }

    public ScaleCondition setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    public String getTargetId() {
        return this.targetId;
    }

    public ScaleCondition setIndicator(String indicator) {
        this.indicator = indicator;
        return this;
    }

    public String getIndicator() {
        return this.indicator;
    }

    public ScaleCondition setThreshold(String threshold) {
        this.threshold = threshold;
        return this;
    }

    public String getThreshold() {
        return this.threshold;
    }

    public ScaleCondition setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    public String getUnit() {
        return this.unit;
    }

    public ScaleCondition setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    public ScaleCondition setCronTime(String cronTime) {
        this.cronTime = cronTime;
        return this;
    }

    public String getCronTime() {
        return this.cronTime;
    }

    public ScaleCondition setTriggerTime(String triggerTime) {
        this.triggerTime = triggerTime;
        return this;
    }

    public String getTriggerTime() {
        return this.triggerTime;
    }

    public ScaleCondition setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public ScaleCondition setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    public String getPeriodType() {
        return this.periodType;
    }

    public ScaleCondition setPeriodValue(Integer periodValue) {
        this.periodValue = periodValue;
        return this;
    }

    public Integer getPeriodValue() {
        return this.periodValue;
    }

    public ScaleCondition setAlarmRule(String alarmRule) {
        this.alarmRule = alarmRule;
        return this;
    }

    public String getAlarmRule() {
        return this.alarmRule;
    }

    @Override
    public String toString() {
        return "ScaleCondition{" + "targetType=" + targetType + "\n" + "targetId=" + targetId + "\n" + "indicator=" + indicator + "\n" + "threshold=" + threshold + "\n" + "unit="
                + unit + "\n" + "comparisonOperator=" + comparisonOperator + "\n" + "cronTime=" + cronTime + "\n" + "triggerTime=" + triggerTime + "\n" + "type=" + type + "\n"
                + "periodType=" + periodType + "\n" + "periodValue=" + periodValue + "\n" + "alarmRule=" + alarmRule + "\n" + "}";
    }

}