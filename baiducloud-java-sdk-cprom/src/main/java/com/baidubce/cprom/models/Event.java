package com.baidubce.cprom.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Event {
    /**
     * 事件 ID
     */
    private String eventId;

    /**
     * 监控实例 ID
     */
    private String monitorInstanceId;

    /**
     * 告警规则 ID
     */
    private String alertingRuleId;

    /**
     * 告警规则名称
     */
    private String alertingRuleName;

    /**
     * 通知规则 ID
     */
    private String notifyRuleId;

    /**
     * 通知规则名称
     */
    private String notifyRuleName;

    /**
     * 告警等级：critical/warning/info
     */
    private String severity;

    /**
     * 事件状态：abnormal/normal/level1-4
     */
    private String status;

    /**
     * 事件开始时间（Unix 时间戳，秒）
     */
    private Integer startTime;

    /**
     * 事件结束时间（Unix 时间戳，秒），0 表示未结束
     */
    private Integer endTime;

    /**
     * 事件持续时间（秒）
     */
    private Integer duration;

    /**
     * 告警值
     */
    private String alarmValue;

    /**
     * 告警表达式
     */
    private String expr;

    /**
     * 告警描述
     */
    private String description;

    /**
     * 告警标签
     */
    private Object alarmTags;

    /**
     * 告警规则标签
     */
    private Object labels;

    /**
     * 告警规则注解
     */
    private Object annotations;

    /**
     * claimedInfo
     */
    private ClaimedInfo claimedInfo;

    public Event setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    public String getEventId() {
        return this.eventId;
    }

    public Event setMonitorInstanceId(String monitorInstanceId) {
        this.monitorInstanceId = monitorInstanceId;
        return this;
    }

    public String getMonitorInstanceId() {
        return this.monitorInstanceId;
    }

    public Event setAlertingRuleId(String alertingRuleId) {
        this.alertingRuleId = alertingRuleId;
        return this;
    }

    public String getAlertingRuleId() {
        return this.alertingRuleId;
    }

    public Event setAlertingRuleName(String alertingRuleName) {
        this.alertingRuleName = alertingRuleName;
        return this;
    }

    public String getAlertingRuleName() {
        return this.alertingRuleName;
    }

    public Event setNotifyRuleId(String notifyRuleId) {
        this.notifyRuleId = notifyRuleId;
        return this;
    }

    public String getNotifyRuleId() {
        return this.notifyRuleId;
    }

    public Event setNotifyRuleName(String notifyRuleName) {
        this.notifyRuleName = notifyRuleName;
        return this;
    }

    public String getNotifyRuleName() {
        return this.notifyRuleName;
    }

    public Event setSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    public String getSeverity() {
        return this.severity;
    }

    public Event setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public Event setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    public Integer getStartTime() {
        return this.startTime;
    }

    public Event setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

    public Integer getEndTime() {
        return this.endTime;
    }

    public Event setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public Event setAlarmValue(String alarmValue) {
        this.alarmValue = alarmValue;
        return this;
    }

    public String getAlarmValue() {
        return this.alarmValue;
    }

    public Event setExpr(String expr) {
        this.expr = expr;
        return this;
    }

    public String getExpr() {
        return this.expr;
    }

    public Event setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Event setAlarmTags(Object alarmTags) {
        this.alarmTags = alarmTags;
        return this;
    }

    public Object getAlarmTags() {
        return this.alarmTags;
    }

    public Event setLabels(Object labels) {
        this.labels = labels;
        return this;
    }

    public Object getLabels() {
        return this.labels;
    }

    public Event setAnnotations(Object annotations) {
        this.annotations = annotations;
        return this;
    }

    public Object getAnnotations() {
        return this.annotations;
    }

    public Event setClaimedInfo(ClaimedInfo claimedInfo) {
        this.claimedInfo = claimedInfo;
        return this;
    }

    public ClaimedInfo getClaimedInfo() {
        return this.claimedInfo;
    }

    @Override
    public String toString() {
        return "Event{" + "eventId=" + eventId + "\n" + "monitorInstanceId=" + monitorInstanceId + "\n" + "alertingRuleId=" + alertingRuleId + "\n" + "alertingRuleName="
                + alertingRuleName + "\n" + "notifyRuleId=" + notifyRuleId + "\n" + "notifyRuleName=" + notifyRuleName + "\n" + "severity=" + severity + "\n" + "status=" + status
                + "\n" + "startTime=" + startTime + "\n" + "endTime=" + endTime + "\n" + "duration=" + duration + "\n" + "alarmValue=" + alarmValue + "\n" + "expr=" + expr + "\n"
                + "description=" + description + "\n" + "alarmTags=" + alarmTags + "\n" + "labels=" + labels + "\n" + "annotations=" + annotations + "\n" + "claimedInfo="
                + claimedInfo + "\n" + "}";
    }

}