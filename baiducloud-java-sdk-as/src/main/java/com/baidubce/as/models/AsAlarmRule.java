package com.baidubce.as.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsAlarmRule {
    /**
     * 策略ID
     */
    private Integer id;

    /**
     * 策略归属产品
     */
    private String scope;

    /**
     * monitorObject
     */
    private MonitorObject monitorObject;

    /**
     * 创建伸缩组的规则时，传入具体的判断规则，支持且规则、或规则。
     */
    private List<List<AlarmRule>> rules;

    /**
     * BCM策略ID，使用BCM已有策略时候，传入对应策略的唯一id
     */
    private String alarmName;

    /**
     * BCM策略别名
     */
    private String aliasName;

    /**
     * 无数据状态触发的持续时间，单位s
     */
    private Integer insufficientCycle;

    /**
     * 策略状态
     */
    private Boolean policyEnabled;

    /**
     * 报警规则的内容描述
     */
    private List<String> ruleContents;

    /**
     * 报警规则的英文描述
     */
    private List<String> ruleContentsEn;

    /**
     * 报警策略创建来源
     */
    private String source;

    /**
     * 表示报警策略来自于哪个业务组件
     */
    private String componentType;

    /**
     * 报警动作
     */
    private List<String> alarmActions;

    /**
     * 当报警恢复时执行的动作列表
     */
    private List<String> okActions;

    /**
     * 当数据不足时执行的动作列表
     */
    private List<String> insufficientActions;

    public AsAlarmRule setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getId() {
        return this.id;
    }

    public AsAlarmRule setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getScope() {
        return this.scope;
    }

    public AsAlarmRule setMonitorObject(MonitorObject monitorObject) {
        this.monitorObject = monitorObject;
        return this;
    }

    public MonitorObject getMonitorObject() {
        return this.monitorObject;
    }

    public AsAlarmRule setRules(List<List<AlarmRule>> rules) {
        this.rules = rules;
        return this;
    }

    public List<List<AlarmRule>> getRules() {
        return this.rules;
    }

    public AsAlarmRule setAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }

    public String getAlarmName() {
        return this.alarmName;
    }

    public AsAlarmRule setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }

    public String getAliasName() {
        return this.aliasName;
    }

    public AsAlarmRule setInsufficientCycle(Integer insufficientCycle) {
        this.insufficientCycle = insufficientCycle;
        return this;
    }

    public Integer getInsufficientCycle() {
        return this.insufficientCycle;
    }

    public AsAlarmRule setPolicyEnabled(Boolean policyEnabled) {
        this.policyEnabled = policyEnabled;
        return this;
    }

    public Boolean getPolicyEnabled() {
        return this.policyEnabled;
    }

    public AsAlarmRule setRuleContents(List<String> ruleContents) {
        this.ruleContents = ruleContents;
        return this;
    }

    public List<String> getRuleContents() {
        return this.ruleContents;
    }

    public AsAlarmRule setRuleContentsEn(List<String> ruleContentsEn) {
        this.ruleContentsEn = ruleContentsEn;
        return this;
    }

    public List<String> getRuleContentsEn() {
        return this.ruleContentsEn;
    }

    public AsAlarmRule setSource(String source) {
        this.source = source;
        return this;
    }

    public String getSource() {
        return this.source;
    }

    public AsAlarmRule setComponentType(String componentType) {
        this.componentType = componentType;
        return this;
    }

    public String getComponentType() {
        return this.componentType;
    }

    public AsAlarmRule setAlarmActions(List<String> alarmActions) {
        this.alarmActions = alarmActions;
        return this;
    }

    public List<String> getAlarmActions() {
        return this.alarmActions;
    }

    public AsAlarmRule setOkActions(List<String> okActions) {
        this.okActions = okActions;
        return this;
    }

    public List<String> getOkActions() {
        return this.okActions;
    }

    public AsAlarmRule setInsufficientActions(List<String> insufficientActions) {
        this.insufficientActions = insufficientActions;
        return this;
    }

    public List<String> getInsufficientActions() {
        return this.insufficientActions;
    }

    @Override
    public String toString() {
        return "AsAlarmRule{" + "id=" + id + "\n" + "scope=" + scope + "\n" + "monitorObject=" + monitorObject + "\n" + "rules=" + rules + "\n" + "alarmName=" + alarmName + "\n"
                + "aliasName=" + aliasName + "\n" + "insufficientCycle=" + insufficientCycle + "\n" + "policyEnabled=" + policyEnabled + "\n" + "ruleContents=" + ruleContents
                + "\n" + "ruleContentsEn=" + ruleContentsEn + "\n" + "source=" + source + "\n" + "componentType=" + componentType + "\n" + "alarmActions=" + alarmActions + "\n"
                + "okActions=" + okActions + "\n" + "insufficientActions=" + insufficientActions + "\n" + "}";
    }

}