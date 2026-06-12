package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAlarmResponse extends BaseBceResponse {

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

    public String getId() {
        return id;
    }

    public DescribeAlarmResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getSeriesId() {
        return seriesId;
    }

    public DescribeAlarmResponse setSeriesId(String seriesId) {
        this.seriesId = seriesId;
        return this;
    }

    public String getState() {
        return state;
    }

    public DescribeAlarmResponse setState(String state) {
        this.state = state;
        return this;
    }

    public String getInitState() {
        return initState;
    }

    public DescribeAlarmResponse setInitState(String initState) {
        this.initState = initState;
        return this;
    }

    public String getCloseReason() {
        return closeReason;
    }

    public DescribeAlarmResponse setCloseReason(String closeReason) {
        this.closeReason = closeReason;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public DescribeAlarmResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public DescribeAlarmResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getType() {
        return type;
    }

    public DescribeAlarmResponse setType(String type) {
        this.type = type;
        return this;
    }

    public AlarmResource getResource() {
        return resource;
    }

    public DescribeAlarmResponse setResource(AlarmResource resource) {
        this.resource = resource;
        return this;
    }

    public AlarmPolicySummary getPolicy() {
        return policy;
    }

    public DescribeAlarmResponse setPolicy(AlarmPolicySummary policy) {
        this.policy = policy;
        return this;
    }

    public List<AlarmAction> getActions() {
        return actions;
    }

    public DescribeAlarmResponse setActions(List<AlarmAction> actions) {
        this.actions = actions;
        return this;
    }

    public List<AlertMetric> getAlertMetrics() {
        return alertMetrics;
    }

    public DescribeAlarmResponse setAlertMetrics(List<AlertMetric> alertMetrics) {
        this.alertMetrics = alertMetrics;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeAlarmResponse{" + "id=" + id + "\n" + "seriesId=" + seriesId + "\n" + "state=" + state + "\n" + "initState=" + initState + "\n" + "closeReason="
                + closeReason + "\n" + "startTime=" + startTime + "\n" + "endTime=" + endTime + "\n" + "type=" + type + "\n" + "resource=" + resource + "\n" + "policy=" + policy
                + "\n" + "actions=" + actions + "\n" + "alertMetrics=" + alertMetrics + "\n" + "}";
    }

}
