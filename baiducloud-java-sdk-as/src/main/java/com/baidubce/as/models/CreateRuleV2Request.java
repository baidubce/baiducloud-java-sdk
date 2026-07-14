package com.baidubce.as.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateRuleV2Request extends BaseBceRequest {

    /**
    * 规则名称
    */
    private String ruleName;

    /**
    * 伸缩组id
    */
    private String groupId;

    /**
    * 规则状态。包括：ENABLE(可用),DISABLE(禁用)
    */
    private String state;

    /**
    * 规则类型。包括：CRONTAB(定时伸缩),ALARM(报警触发伸缩),PERIOD(周期伸缩)
    */
    private String type;

    /**
    * 动作类型。包括：INCREASE(扩容),DECREASE(缩容),ADJUST(调整至)
    */
    private String actionType;

    /**
    * 动作数量
    */
    private Integer actionNum;

    /**
    * 定时规则或周期规则：当日执行时间。如12:30。
    */
    private String cronTime;

    /**
    * 冷却时间（秒）
    */
    private Integer cooldownInSec;

    /**
    * 周期规则：周期单位，可选值为DAY/WEEK/MONTH/CronExpression
    */
    private String periodType;

    /**
    * 周期规则：周期触发日期，1-7标识周1-周日，1-31表示1号到31号，与periodType相关
    */
    private Integer periodValue;

    /**
    * 周期规则：周期有效期开始时间。如：2023-12-10T12:00:00Z
    */
    private String periodStartTime;

    /**
    * 周期规则：周期有效期结束时间。如：2023-12-11T12:00:00Z
    */
    private String periodEndTime;

    /**
    * asAlarmRule
    */
    private AsAlarmRule asAlarmRule;

    public String getRuleName() {
        return ruleName;
    }

    public CreateRuleV2Request setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    public String getGroupId() {
        return groupId;
    }

    public CreateRuleV2Request setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getState() {
        return state;
    }

    public CreateRuleV2Request setState(String state) {
        this.state = state;
        return this;
    }

    public String getType() {
        return type;
    }

    public CreateRuleV2Request setType(String type) {
        this.type = type;
        return this;
    }

    public String getActionType() {
        return actionType;
    }

    public CreateRuleV2Request setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    public Integer getActionNum() {
        return actionNum;
    }

    public CreateRuleV2Request setActionNum(Integer actionNum) {
        this.actionNum = actionNum;
        return this;
    }

    public String getCronTime() {
        return cronTime;
    }

    public CreateRuleV2Request setCronTime(String cronTime) {
        this.cronTime = cronTime;
        return this;
    }

    public Integer getCooldownInSec() {
        return cooldownInSec;
    }

    public CreateRuleV2Request setCooldownInSec(Integer cooldownInSec) {
        this.cooldownInSec = cooldownInSec;
        return this;
    }

    public String getPeriodType() {
        return periodType;
    }

    public CreateRuleV2Request setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    public Integer getPeriodValue() {
        return periodValue;
    }

    public CreateRuleV2Request setPeriodValue(Integer periodValue) {
        this.periodValue = periodValue;
        return this;
    }

    public String getPeriodStartTime() {
        return periodStartTime;
    }

    public CreateRuleV2Request setPeriodStartTime(String periodStartTime) {
        this.periodStartTime = periodStartTime;
        return this;
    }

    public String getPeriodEndTime() {
        return periodEndTime;
    }

    public CreateRuleV2Request setPeriodEndTime(String periodEndTime) {
        this.periodEndTime = periodEndTime;
        return this;
    }

    public AsAlarmRule getAsAlarmRule() {
        return asAlarmRule;
    }

    public CreateRuleV2Request setAsAlarmRule(AsAlarmRule asAlarmRule) {
        this.asAlarmRule = asAlarmRule;
        return this;
    }

}
