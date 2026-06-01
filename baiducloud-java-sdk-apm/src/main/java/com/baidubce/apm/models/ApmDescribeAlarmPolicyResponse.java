package com.baidubce.apm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApmDescribeAlarmPolicyResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 状态码
    */
    private String code;

    /**
    * 错误信息
    */
    private String message;

    /**
    * 策略ID
    */
    private String id;

    /**
    * 策略名称
    */
    private String name;

    /**
    * 创建时间，UTC时间
    */
    private String createdTimestamp;

    /**
    * 更新时间，UTC时间
    */
    private String updatedTimestamp;

    /**
    * 策略内容
    */
    private String content;

    /**
    * 策略状态，可选值：ENABLED-已启动，DISABLED-已停用
    */
    private String state;

    /**
    * target
    */
    private AlarmTarget target;

    /**
    * 指标类别
    */
    private String metricKind;

    /**
    * rule
    */
    private AlarmRule rule;

    /**
    * 报警内容
    */
    private String ruleContent;

    /**
    * 维度过滤条件列表
    */
    private List<AlarmFilter> filters;

    /**
    * 连续触发阈值，连续多少次触发阈值则报警
    */
    private Integer pendingCount;

    /**
    * 重复报警间隔，单位：分钟
    */
    private Integer renotifyIntervalInMinutes;

    /**
    * 最大重复次数
    */
    private Integer renotifyCount;

    /**
    * 恢复后是否通知
    */
    private Boolean notifyRecovery;

    /**
    * 无数据处理方式
    */
    private String onMissingData;

    /**
    * 无数据报警等待间隔，单位：分钟
    */
    private Integer noDataNotifyPendingIntervalInMinutes;

    /**
    * 报警级别
    */
    private String level;

    /**
    * 通知模板列表
    */
    private List<AlarmAction> actions;

    public Boolean getSuccess() {
        return success;
    }

    public ApmDescribeAlarmPolicyResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public ApmDescribeAlarmPolicyResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ApmDescribeAlarmPolicyResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getId() {
        return id;
    }

    public ApmDescribeAlarmPolicyResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ApmDescribeAlarmPolicyResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getCreatedTimestamp() {
        return createdTimestamp;
    }

    public ApmDescribeAlarmPolicyResponse setCreatedTimestamp(String createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public String getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    public ApmDescribeAlarmPolicyResponse setUpdatedTimestamp(String updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
        return this;
    }

    public String getContent() {
        return content;
    }

    public ApmDescribeAlarmPolicyResponse setContent(String content) {
        this.content = content;
        return this;
    }

    public String getState() {
        return state;
    }

    public ApmDescribeAlarmPolicyResponse setState(String state) {
        this.state = state;
        return this;
    }

    public AlarmTarget getTarget() {
        return target;
    }

    public ApmDescribeAlarmPolicyResponse setTarget(AlarmTarget target) {
        this.target = target;
        return this;
    }

    public String getMetricKind() {
        return metricKind;
    }

    public ApmDescribeAlarmPolicyResponse setMetricKind(String metricKind) {
        this.metricKind = metricKind;
        return this;
    }

    public AlarmRule getRule() {
        return rule;
    }

    public ApmDescribeAlarmPolicyResponse setRule(AlarmRule rule) {
        this.rule = rule;
        return this;
    }

    public String getRuleContent() {
        return ruleContent;
    }

    public ApmDescribeAlarmPolicyResponse setRuleContent(String ruleContent) {
        this.ruleContent = ruleContent;
        return this;
    }

    public List<AlarmFilter> getFilters() {
        return filters;
    }

    public ApmDescribeAlarmPolicyResponse setFilters(List<AlarmFilter> filters) {
        this.filters = filters;
        return this;
    }

    public Integer getPendingCount() {
        return pendingCount;
    }

    public ApmDescribeAlarmPolicyResponse setPendingCount(Integer pendingCount) {
        this.pendingCount = pendingCount;
        return this;
    }

    public Integer getRenotifyIntervalInMinutes() {
        return renotifyIntervalInMinutes;
    }

    public ApmDescribeAlarmPolicyResponse setRenotifyIntervalInMinutes(Integer renotifyIntervalInMinutes) {
        this.renotifyIntervalInMinutes = renotifyIntervalInMinutes;
        return this;
    }

    public Integer getRenotifyCount() {
        return renotifyCount;
    }

    public ApmDescribeAlarmPolicyResponse setRenotifyCount(Integer renotifyCount) {
        this.renotifyCount = renotifyCount;
        return this;
    }

    public Boolean getNotifyRecovery() {
        return notifyRecovery;
    }

    public ApmDescribeAlarmPolicyResponse setNotifyRecovery(Boolean notifyRecovery) {
        this.notifyRecovery = notifyRecovery;
        return this;
    }

    public String getOnMissingData() {
        return onMissingData;
    }

    public ApmDescribeAlarmPolicyResponse setOnMissingData(String onMissingData) {
        this.onMissingData = onMissingData;
        return this;
    }

    public Integer getNoDataNotifyPendingIntervalInMinutes() {
        return noDataNotifyPendingIntervalInMinutes;
    }

    public ApmDescribeAlarmPolicyResponse setNoDataNotifyPendingIntervalInMinutes(Integer noDataNotifyPendingIntervalInMinutes) {
        this.noDataNotifyPendingIntervalInMinutes = noDataNotifyPendingIntervalInMinutes;
        return this;
    }

    public String getLevel() {
        return level;
    }

    public ApmDescribeAlarmPolicyResponse setLevel(String level) {
        this.level = level;
        return this;
    }

    public List<AlarmAction> getActions() {
        return actions;
    }

    public ApmDescribeAlarmPolicyResponse setActions(List<AlarmAction> actions) {
        this.actions = actions;
        return this;
    }

    @Override
    public String toString() {
        return "ApmDescribeAlarmPolicyResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "id=" + id + "\n" + "name=" + name + "\n"
                + "createdTimestamp=" + createdTimestamp + "\n" + "updatedTimestamp=" + updatedTimestamp + "\n" + "content=" + content + "\n" + "state=" + state + "\n" + "target="
                + target + "\n" + "metricKind=" + metricKind + "\n" + "rule=" + rule + "\n" + "ruleContent=" + ruleContent + "\n" + "filters=" + filters + "\n" + "pendingCount="
                + pendingCount + "\n" + "renotifyIntervalInMinutes=" + renotifyIntervalInMinutes + "\n" + "renotifyCount=" + renotifyCount + "\n" + "notifyRecovery="
                + notifyRecovery + "\n" + "onMissingData=" + onMissingData + "\n" + "noDataNotifyPendingIntervalInMinutes=" + noDataNotifyPendingIntervalInMinutes + "\n"
                + "level=" + level + "\n" + "actions=" + actions + "\n" + "}";
    }

}
