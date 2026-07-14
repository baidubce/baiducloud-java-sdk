package com.baidubce.as.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetRuleV2Response extends BaseBceResponse {

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

    public String getRuleId() {
        return ruleId;
    }

    public GetRuleV2Response setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    public String getRuleName() {
        return ruleName;
    }

    public GetRuleV2Response setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    public String getGroupId() {
        return groupId;
    }

    public GetRuleV2Response setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getAccountId() {
        return accountId;
    }

    public GetRuleV2Response setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getState() {
        return state;
    }

    public GetRuleV2Response setState(String state) {
        this.state = state;
        return this;
    }

    public String getType() {
        return type;
    }

    public GetRuleV2Response setType(String type) {
        this.type = type;
        return this;
    }

    public String getCronTime() {
        return cronTime;
    }

    public GetRuleV2Response setCronTime(String cronTime) {
        this.cronTime = cronTime;
        return this;
    }

    public String getActionType() {
        return actionType;
    }

    public GetRuleV2Response setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    public Integer getActionNum() {
        return actionNum;
    }

    public GetRuleV2Response setActionNum(Integer actionNum) {
        this.actionNum = actionNum;
        return this;
    }

    public Integer getCooldownInSec() {
        return cooldownInSec;
    }

    public GetRuleV2Response setCooldownInSec(Integer cooldownInSec) {
        this.cooldownInSec = cooldownInSec;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public GetRuleV2Response setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getLastExecutionTime() {
        return lastExecutionTime;
    }

    public GetRuleV2Response setLastExecutionTime(String lastExecutionTime) {
        this.lastExecutionTime = lastExecutionTime;
        return this;
    }

    public String getLastScheduleTime() {
        return lastScheduleTime;
    }

    public GetRuleV2Response setLastScheduleTime(String lastScheduleTime) {
        this.lastScheduleTime = lastScheduleTime;
        return this;
    }

    public String getPeriodStartTime() {
        return periodStartTime;
    }

    public GetRuleV2Response setPeriodStartTime(String periodStartTime) {
        this.periodStartTime = periodStartTime;
        return this;
    }

    public String getPeriodEndTime() {
        return periodEndTime;
    }

    public GetRuleV2Response setPeriodEndTime(String periodEndTime) {
        this.periodEndTime = periodEndTime;
        return this;
    }

    public String getPeriodType() {
        return periodType;
    }

    public GetRuleV2Response setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    public Integer getPeriodValue() {
        return periodValue;
    }

    public GetRuleV2Response setPeriodValue(Integer periodValue) {
        this.periodValue = periodValue;
        return this;
    }

    public AsAlarmRule getAsAlarmRule() {
        return asAlarmRule;
    }

    public GetRuleV2Response setAsAlarmRule(AsAlarmRule asAlarmRule) {
        this.asAlarmRule = asAlarmRule;
        return this;
    }

    @Override
    public String toString() {
        return "GetRuleV2Response{" + "ruleId=" + ruleId + "\n" + "ruleName=" + ruleName + "\n" + "groupId=" + groupId + "\n" + "accountId=" + accountId + "\n" + "state=" + state
                + "\n" + "type=" + type + "\n" + "cronTime=" + cronTime + "\n" + "actionType=" + actionType + "\n" + "actionNum=" + actionNum + "\n" + "cooldownInSec="
                + cooldownInSec + "\n" + "createTime=" + createTime + "\n" + "lastExecutionTime=" + lastExecutionTime + "\n" + "lastScheduleTime=" + lastScheduleTime + "\n"
                + "periodStartTime=" + periodStartTime + "\n" + "periodEndTime=" + periodEndTime + "\n" + "periodType=" + periodType + "\n" + "periodValue=" + periodValue + "\n"
                + "asAlarmRule=" + asAlarmRule + "\n" + "}";
    }

}
