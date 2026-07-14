package com.baidubce.as.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Rule {
    /**
     * 规则ID
     */
    private String ruleId;

    /**
     * 规则名称
     */
    private String ruleName;

    /**
     * 伸缩组ID
     */
    private String groupId;

    /**
     * 用户ID
     */
    private String accountId;

    /**
     * 规则的状态
     */
    private String state;

    /**
     * 规则的类型
     */
    private String type;

    /**
     * 定时规则或周期规则：当日执行时间。如12:30。
     */
    private String cronTime;

    /**
     * 动作类型。包括：INCREASE(扩容),DECREASE(缩容),ADJUST(调整至)
     */
    private String actionType;

    /**
     * 动作数量
     */
    private Integer actionNum;

    /**
     * 冷却时间（秒）
     */
    private Integer cooldownInSec;

    /**
     * 规则创建时间
     */
    private String createTime;

    /**
     * 规则最后修改时间
     */
    private String lastExecutionTime;

    /**
     * 规则最后执行时间
     */
    private String lastScheduleTime;

    /**
     * 周期规则：周期有效期开始时间。如：2023-12-10T12:00:00Z
     */
    private String periodStartTime;

    /**
     * 周期规则：周期有效期结束时间。如：2023-12-11T12:00:00Z
     */
    private String periodEndTime;

    /**
     * 周期规则：周期单位，可选值为DAY/WEEK/MONTH/CronExpression
     */
    private String periodType;

    /**
     * 周期规则：周期触发日期，1-7标识周1-周日，1-31表示1号到31号，与periodType相关
     */
    private Integer periodValue;

    /**
     * asAlarmRule
     */
    private AsAlarmRule asAlarmRule;

    public Rule setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    public String getRuleId() {
        return this.ruleId;
    }

    public Rule setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    public String getRuleName() {
        return this.ruleName;
    }

    public Rule setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public Rule setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Rule setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public Rule setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public Rule setCronTime(String cronTime) {
        this.cronTime = cronTime;
        return this;
    }

    public String getCronTime() {
        return this.cronTime;
    }

    public Rule setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    public String getActionType() {
        return this.actionType;
    }

    public Rule setActionNum(Integer actionNum) {
        this.actionNum = actionNum;
        return this;
    }

    public Integer getActionNum() {
        return this.actionNum;
    }

    public Rule setCooldownInSec(Integer cooldownInSec) {
        this.cooldownInSec = cooldownInSec;
        return this;
    }

    public Integer getCooldownInSec() {
        return this.cooldownInSec;
    }

    public Rule setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public Rule setLastExecutionTime(String lastExecutionTime) {
        this.lastExecutionTime = lastExecutionTime;
        return this;
    }

    public String getLastExecutionTime() {
        return this.lastExecutionTime;
    }

    public Rule setLastScheduleTime(String lastScheduleTime) {
        this.lastScheduleTime = lastScheduleTime;
        return this;
    }

    public String getLastScheduleTime() {
        return this.lastScheduleTime;
    }

    public Rule setPeriodStartTime(String periodStartTime) {
        this.periodStartTime = periodStartTime;
        return this;
    }

    public String getPeriodStartTime() {
        return this.periodStartTime;
    }

    public Rule setPeriodEndTime(String periodEndTime) {
        this.periodEndTime = periodEndTime;
        return this;
    }

    public String getPeriodEndTime() {
        return this.periodEndTime;
    }

    public Rule setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    public String getPeriodType() {
        return this.periodType;
    }

    public Rule setPeriodValue(Integer periodValue) {
        this.periodValue = periodValue;
        return this;
    }

    public Integer getPeriodValue() {
        return this.periodValue;
    }

    public Rule setAsAlarmRule(AsAlarmRule asAlarmRule) {
        this.asAlarmRule = asAlarmRule;
        return this;
    }

    public AsAlarmRule getAsAlarmRule() {
        return this.asAlarmRule;
    }

    @Override
    public String toString() {
        return "Rule{" + "ruleId=" + ruleId + "\n" + "ruleName=" + ruleName + "\n" + "groupId=" + groupId + "\n" + "accountId=" + accountId + "\n" + "state=" + state + "\n"
                + "type=" + type + "\n" + "cronTime=" + cronTime + "\n" + "actionType=" + actionType + "\n" + "actionNum=" + actionNum + "\n" + "cooldownInSec=" + cooldownInSec
                + "\n" + "createTime=" + createTime + "\n" + "lastExecutionTime=" + lastExecutionTime + "\n" + "lastScheduleTime=" + lastScheduleTime + "\n" + "periodStartTime="
                + periodStartTime + "\n" + "periodEndTime=" + periodEndTime + "\n" + "periodType=" + periodType + "\n" + "periodValue=" + periodValue + "\n" + "asAlarmRule="
                + asAlarmRule + "\n" + "}";
    }

}