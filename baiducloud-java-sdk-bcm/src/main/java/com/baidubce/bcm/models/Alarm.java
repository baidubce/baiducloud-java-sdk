package com.baidubce.bcm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Alarm {
    /**
     * 报警记录ID
     */
    private String id;

    /**
     * 报警序列ID
     */
    private String seriesId;

    /**
     * 报警状态
     */
    private String state;

    /**
     * 初始状态
     */
    private String initState;

    /**
     * 关闭原因
     */
    private String closeReason;

    /**
     * 报警开始时间
     */
    private String startTime;

    /**
     * 报警结束时间
     */
    private String endTime;

    /**
     * 报警类型
     */
    private String type;

    /**
     * resource
     */
    private AlarmResource resource;

    /**
     * policy
     */
    private AlarmPolicySummary policy;

    /**
     * 报警动作列表
     */
    private List<AlarmAction> actions;

    /**
     * 报警指标详情列表
     */
    private List<AlertMetric> alertMetrics;

    public Alarm setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Alarm setSeriesId(String seriesId) {
        this.seriesId = seriesId;
        return this;
    }

    public String getSeriesId() {
        return this.seriesId;
    }

    public Alarm setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public Alarm setInitState(String initState) {
        this.initState = initState;
        return this;
    }

    public String getInitState() {
        return this.initState;
    }

    public Alarm setCloseReason(String closeReason) {
        this.closeReason = closeReason;
        return this;
    }

    public String getCloseReason() {
        return this.closeReason;
    }

    public Alarm setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public Alarm setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public Alarm setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public Alarm setResource(AlarmResource resource) {
        this.resource = resource;
        return this;
    }

    public AlarmResource getResource() {
        return this.resource;
    }

    public Alarm setPolicy(AlarmPolicySummary policy) {
        this.policy = policy;
        return this;
    }

    public AlarmPolicySummary getPolicy() {
        return this.policy;
    }

    public Alarm setActions(List<AlarmAction> actions) {
        this.actions = actions;
        return this;
    }

    public List<AlarmAction> getActions() {
        return this.actions;
    }

    public Alarm setAlertMetrics(List<AlertMetric> alertMetrics) {
        this.alertMetrics = alertMetrics;
        return this;
    }

    public List<AlertMetric> getAlertMetrics() {
        return this.alertMetrics;
    }

    @Override
    public String toString() {
        return "Alarm{" + "id=" + id + "\n" + "seriesId=" + seriesId + "\n" + "state=" + state + "\n" + "initState=" + initState + "\n" + "closeReason=" + closeReason + "\n"
                + "startTime=" + startTime + "\n" + "endTime=" + endTime + "\n" + "type=" + type + "\n" + "resource=" + resource + "\n" + "policy=" + policy + "\n" + "actions="
                + actions + "\n" + "alertMetrics=" + alertMetrics + "\n" + "}";
    }

}