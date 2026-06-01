package com.baidubce.apm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlarmPolicyDetail {
    /**
     * 策略ID
     */
    private String id;

    /**
     * 策略名称
     */
    private String name;

    /**
     * 策略内容描述
     */
    private String content;

    /**
     * 策略状态，可选项：`ENABLED` - 已启动，`DISABLED` - 已停用
     */
    private String state;

    /**
     * 创建时间，UTC时间
     */
    private String createdTimestamp;

    /**
     * 更新时间，UTC时间
     */
    private String updatedTimestamp;

    /**
     * target
     */
    private AlarmTarget target;

    /**
     * 
     */
    private String metricKind;

    /**
     * rule
     */
    private AlarmRule rule;

    /**
     * 报警规则内容描述
     */
    private String ruleContent;

    /**
     * 地域
     */
    private String region;

    /**
     * 维度过滤条件列表
     */
    private List<AlarmFilter> filters;

    /**
     * 连续触发阈值，连续多少次触发阈值则报警
     */
    private Integer pendingCount;

    /**
     * 重复报警间隔，单位：分钟，0表示关闭重复报警
     */
    private Integer renotifyIntervalInMinutes;

    /**
     * 最大重复次数，0表示关闭重复报警
     */
    private Integer renotifyCount;

    /**
     * 恢复后是否通知
     */
    private Boolean notifyRecovery;

    /**
     * 
     */
    private String onMissingData;

    /**
     * 无数据报警等待间隔，单位：分钟
     */
    private Integer noDataNotifyPendingIntervalInMinutes;

    /**
     * 报警级别，可选项：`NOTICE` - 通知，`WARNING` - 警告，`MAJOR` - 重要，`CRITICAL` - 严重
     */
    private String level;

    /**
     * 通知模板列表
     */
    private List<AlarmAction> actions;

    public AlarmPolicyDetail setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public AlarmPolicyDetail setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public AlarmPolicyDetail setContent(String content) {
        this.content = content;
        return this;
    }

    public String getContent() {
        return this.content;
    }

    public AlarmPolicyDetail setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public AlarmPolicyDetail setCreatedTimestamp(String createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public String getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public AlarmPolicyDetail setUpdatedTimestamp(String updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
        return this;
    }

    public String getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    public AlarmPolicyDetail setTarget(AlarmTarget target) {
        this.target = target;
        return this;
    }

    public AlarmTarget getTarget() {
        return this.target;
    }

    public AlarmPolicyDetail setMetricKind(String metricKind) {
        this.metricKind = metricKind;
        return this;
    }

    public String getMetricKind() {
        return this.metricKind;
    }

    public AlarmPolicyDetail setRule(AlarmRule rule) {
        this.rule = rule;
        return this;
    }

    public AlarmRule getRule() {
        return this.rule;
    }

    public AlarmPolicyDetail setRuleContent(String ruleContent) {
        this.ruleContent = ruleContent;
        return this;
    }

    public String getRuleContent() {
        return this.ruleContent;
    }

    public AlarmPolicyDetail setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public AlarmPolicyDetail setFilters(List<AlarmFilter> filters) {
        this.filters = filters;
        return this;
    }

    public List<AlarmFilter> getFilters() {
        return this.filters;
    }

    public AlarmPolicyDetail setPendingCount(Integer pendingCount) {
        this.pendingCount = pendingCount;
        return this;
    }

    public Integer getPendingCount() {
        return this.pendingCount;
    }

    public AlarmPolicyDetail setRenotifyIntervalInMinutes(Integer renotifyIntervalInMinutes) {
        this.renotifyIntervalInMinutes = renotifyIntervalInMinutes;
        return this;
    }

    public Integer getRenotifyIntervalInMinutes() {
        return this.renotifyIntervalInMinutes;
    }

    public AlarmPolicyDetail setRenotifyCount(Integer renotifyCount) {
        this.renotifyCount = renotifyCount;
        return this;
    }

    public Integer getRenotifyCount() {
        return this.renotifyCount;
    }

    public AlarmPolicyDetail setNotifyRecovery(Boolean notifyRecovery) {
        this.notifyRecovery = notifyRecovery;
        return this;
    }

    public Boolean getNotifyRecovery() {
        return this.notifyRecovery;
    }

    public AlarmPolicyDetail setOnMissingData(String onMissingData) {
        this.onMissingData = onMissingData;
        return this;
    }

    public String getOnMissingData() {
        return this.onMissingData;
    }

    public AlarmPolicyDetail setNoDataNotifyPendingIntervalInMinutes(Integer noDataNotifyPendingIntervalInMinutes) {
        this.noDataNotifyPendingIntervalInMinutes = noDataNotifyPendingIntervalInMinutes;
        return this;
    }

    public Integer getNoDataNotifyPendingIntervalInMinutes() {
        return this.noDataNotifyPendingIntervalInMinutes;
    }

    public AlarmPolicyDetail setLevel(String level) {
        this.level = level;
        return this;
    }

    public String getLevel() {
        return this.level;
    }

    public AlarmPolicyDetail setActions(List<AlarmAction> actions) {
        this.actions = actions;
        return this;
    }

    public List<AlarmAction> getActions() {
        return this.actions;
    }

    @Override
    public String toString() {
        return "AlarmPolicyDetail{" + "id=" + id + "\n" + "name=" + name + "\n" + "content=" + content + "\n" + "state=" + state + "\n" + "createdTimestamp=" + createdTimestamp
                + "\n" + "updatedTimestamp=" + updatedTimestamp + "\n" + "target=" + target + "\n" + "metricKind=" + metricKind + "\n" + "rule=" + rule + "\n" + "ruleContent="
                + ruleContent + "\n" + "region=" + region + "\n" + "filters=" + filters + "\n" + "pendingCount=" + pendingCount + "\n" + "renotifyIntervalInMinutes="
                + renotifyIntervalInMinutes + "\n" + "renotifyCount=" + renotifyCount + "\n" + "notifyRecovery=" + notifyRecovery + "\n" + "onMissingData=" + onMissingData + "\n"
                + "noDataNotifyPendingIntervalInMinutes=" + noDataNotifyPendingIntervalInMinutes + "\n" + "level=" + level + "\n" + "actions=" + actions + "\n" + "}";
    }

}