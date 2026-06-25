package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAlertEventsRequest extends BaseBceRequest {

    /**
    * startTime
    */
    @JsonIgnore
    private Integer startTime;

    /**
    * endTime
    */
    @JsonIgnore
    private Integer endTime;

    /**
    * pageNo
    */
    @JsonIgnore
    private Integer pageNo;

    /**
    * pageSize
    */
    @JsonIgnore
    private Integer pageSize;

    /**
    * monitorInstanceId
    */
    @JsonIgnore
    private String monitorInstanceId;

    /**
    * alertingRuleId
    */
    @JsonIgnore
    private String alertingRuleId;

    /**
    * alertingRuleName
    */
    @JsonIgnore
    private String alertingRuleName;

    /**
    * notifyRuleId
    */
    @JsonIgnore
    private String notifyRuleId;

    /**
    * notifyRuleName
    */
    @JsonIgnore
    private String notifyRuleName;

    /**
    * severity
    */
    @JsonIgnore
    private String severity;

    /**
    * status
    */
    @JsonIgnore
    private String status;

    /**
    * expr
    */
    @JsonIgnore
    private String expr;

    /**
    * orderBy
    */
    @JsonIgnore
    private String orderBy;

    /**
    * order
    */
    @JsonIgnore
    private String order;

    /**
    * alarmTags
    */
    @JsonIgnore
    private String alarmTags;

    public Integer getStartTime() {
        return startTime;
    }

    public ListAlertEventsRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public ListAlertEventsRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListAlertEventsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListAlertEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public String getMonitorInstanceId() {
        return monitorInstanceId;
    }

    public ListAlertEventsRequest setMonitorInstanceId(String monitorInstanceId) {
        this.monitorInstanceId = monitorInstanceId;
        return this;
    }

    public String getAlertingRuleId() {
        return alertingRuleId;
    }

    public ListAlertEventsRequest setAlertingRuleId(String alertingRuleId) {
        this.alertingRuleId = alertingRuleId;
        return this;
    }

    public String getAlertingRuleName() {
        return alertingRuleName;
    }

    public ListAlertEventsRequest setAlertingRuleName(String alertingRuleName) {
        this.alertingRuleName = alertingRuleName;
        return this;
    }

    public String getNotifyRuleId() {
        return notifyRuleId;
    }

    public ListAlertEventsRequest setNotifyRuleId(String notifyRuleId) {
        this.notifyRuleId = notifyRuleId;
        return this;
    }

    public String getNotifyRuleName() {
        return notifyRuleName;
    }

    public ListAlertEventsRequest setNotifyRuleName(String notifyRuleName) {
        this.notifyRuleName = notifyRuleName;
        return this;
    }

    public String getSeverity() {
        return severity;
    }

    public ListAlertEventsRequest setSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ListAlertEventsRequest setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getExpr() {
        return expr;
    }

    public ListAlertEventsRequest setExpr(String expr) {
        this.expr = expr;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListAlertEventsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListAlertEventsRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getAlarmTags() {
        return alarmTags;
    }

    public ListAlertEventsRequest setAlarmTags(String alarmTags) {
        this.alarmTags = alarmTags;
        return this;
    }

}
