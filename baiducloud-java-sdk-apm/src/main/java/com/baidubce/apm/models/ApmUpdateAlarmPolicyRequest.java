package com.baidubce.apm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApmUpdateAlarmPolicyRequest extends BaseBceRequest {

    /**
    * 策略ID
    */
    private String id;

    /**
    * 报警策略名称
    */
    private String name;

    /**
    * target
    */
    private AlarmTarget target;

    /**
    * 指标类别，可选值：SERVER-服务端性能指标，CLIENT-客户端性能指标，DB-数据库指标，PRODUCER-生产者，CONSUMER-消费者，INTERNAL_FUNCTION-内部函数，JVM-JVM监控，EXCEPTION-异常监控
    */
    private String metricKind;

    /**
    * rule
    */
    private AlarmRule rule;

    /**
    * 维度过滤条件列表
    */
    private List<AlarmFilter> filters;

    /**
    * 连续触发阈值，连续多少次触发阈值则报警
    */
    private Integer pendingCount;

    /**
    * 重复报警间隔，单位：分钟，设置为0表示关闭重复报警
    */
    private Integer renotifyIntervalInMinutes;

    /**
    * 最大重复次数，设置为0表示关闭重复报警
    */
    private Integer renotifyCount;

    /**
    * 恢复后是否通知
    */
    private Boolean notifyRecovery;

    /**
    * 无数据处理方式，可选值：SHOW_NO_DATA_AND_NOTIFY-显示无数据且发送报警通知，SHOW_NO_DATA-显示无数据但不发送报警通知，SHOW_OK-报警恢复，EVALUATE_AS_ZERO-将无数据指标视作0与规则阈值进行比较
    */
    private String onMissingData;

    /**
    * 无数据报警等待间隔，单位：分钟，当onMissingData为SHOW_NO_DATA_AND_NOTIFY时必填，设置为0则立即发出无数据报警
    */
    private Integer noDataNotifyPendingIntervalInMinutes;

    /**
    * 报警级别，默认CRITICAL，可选值：NOTICE-通知，WARNING-警告，MAJOR-重要，CRITICAL-严重
    */
    private String level;

    /**
    * 通知模板列表，统一用于异常通知、恢复通知、重复报警通知
    */
    private List<AlarmAction> actions;

    public String getId() {
        return id;
    }

    public ApmUpdateAlarmPolicyRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ApmUpdateAlarmPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }

    public AlarmTarget getTarget() {
        return target;
    }

    public ApmUpdateAlarmPolicyRequest setTarget(AlarmTarget target) {
        this.target = target;
        return this;
    }

    public String getMetricKind() {
        return metricKind;
    }

    public ApmUpdateAlarmPolicyRequest setMetricKind(String metricKind) {
        this.metricKind = metricKind;
        return this;
    }

    public AlarmRule getRule() {
        return rule;
    }

    public ApmUpdateAlarmPolicyRequest setRule(AlarmRule rule) {
        this.rule = rule;
        return this;
    }

    public List<AlarmFilter> getFilters() {
        return filters;
    }

    public ApmUpdateAlarmPolicyRequest setFilters(List<AlarmFilter> filters) {
        this.filters = filters;
        return this;
    }

    public Integer getPendingCount() {
        return pendingCount;
    }

    public ApmUpdateAlarmPolicyRequest setPendingCount(Integer pendingCount) {
        this.pendingCount = pendingCount;
        return this;
    }

    public Integer getRenotifyIntervalInMinutes() {
        return renotifyIntervalInMinutes;
    }

    public ApmUpdateAlarmPolicyRequest setRenotifyIntervalInMinutes(Integer renotifyIntervalInMinutes) {
        this.renotifyIntervalInMinutes = renotifyIntervalInMinutes;
        return this;
    }

    public Integer getRenotifyCount() {
        return renotifyCount;
    }

    public ApmUpdateAlarmPolicyRequest setRenotifyCount(Integer renotifyCount) {
        this.renotifyCount = renotifyCount;
        return this;
    }

    public Boolean getNotifyRecovery() {
        return notifyRecovery;
    }

    public ApmUpdateAlarmPolicyRequest setNotifyRecovery(Boolean notifyRecovery) {
        this.notifyRecovery = notifyRecovery;
        return this;
    }

    public String getOnMissingData() {
        return onMissingData;
    }

    public ApmUpdateAlarmPolicyRequest setOnMissingData(String onMissingData) {
        this.onMissingData = onMissingData;
        return this;
    }

    public Integer getNoDataNotifyPendingIntervalInMinutes() {
        return noDataNotifyPendingIntervalInMinutes;
    }

    public ApmUpdateAlarmPolicyRequest setNoDataNotifyPendingIntervalInMinutes(Integer noDataNotifyPendingIntervalInMinutes) {
        this.noDataNotifyPendingIntervalInMinutes = noDataNotifyPendingIntervalInMinutes;
        return this;
    }

    public String getLevel() {
        return level;
    }

    public ApmUpdateAlarmPolicyRequest setLevel(String level) {
        this.level = level;
        return this;
    }

    public List<AlarmAction> getActions() {
        return actions;
    }

    public ApmUpdateAlarmPolicyRequest setActions(List<AlarmAction> actions) {
        this.actions = actions;
        return this;
    }

}
