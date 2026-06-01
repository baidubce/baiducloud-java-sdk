package com.baidubce.apm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlarmEventDetail {
    /**
     * 报警ID
     */
    private String id;

    /**
     * 报警开始时间，UTC时间
     */
    private String startTime;

    /**
     * 报警关闭时间，UTC时间，未关闭时为空字符串
     */
    private String endTime;

    /**
     * 报警持续时间，单位：分钟
     */
    private Integer duration;

    /**
     * 初始报警状态，可选项：`ALERT` - 报警中，`NODATA` - 无数据报警
     */
    private String initState;

    /**
     * 报警状态，可选项：`OK` - 已恢复，`ALERT` - 报警中，`NODATA` - 无数据报警，`CLOSED` - 已关闭
     */
    private String state;

    /**
     * 报警关闭原因，可选项：`POLICY_MODIFIED` - 报警策略更新
     */
    private String closeReason;

    /**
     * 报警异常值描述
     */
    private String currentValue;

    /**
     * 异常资源信息
     */
    private String monitorObject;

    /**
     * policy
     */
    private AlarmPolicyDetail policy;

    public AlarmEventDetail setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public AlarmEventDetail setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public AlarmEventDetail setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public AlarmEventDetail setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public AlarmEventDetail setInitState(String initState) {
        this.initState = initState;
        return this;
    }

    public String getInitState() {
        return this.initState;
    }

    public AlarmEventDetail setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public AlarmEventDetail setCloseReason(String closeReason) {
        this.closeReason = closeReason;
        return this;
    }

    public String getCloseReason() {
        return this.closeReason;
    }

    public AlarmEventDetail setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    public String getCurrentValue() {
        return this.currentValue;
    }

    public AlarmEventDetail setMonitorObject(String monitorObject) {
        this.monitorObject = monitorObject;
        return this;
    }

    public String getMonitorObject() {
        return this.monitorObject;
    }

    public AlarmEventDetail setPolicy(AlarmPolicyDetail policy) {
        this.policy = policy;
        return this;
    }

    public AlarmPolicyDetail getPolicy() {
        return this.policy;
    }

    @Override
    public String toString() {
        return "AlarmEventDetail{" + "id=" + id + "\n" + "startTime=" + startTime + "\n" + "endTime=" + endTime + "\n" + "duration=" + duration + "\n" + "initState=" + initState
                + "\n" + "state=" + state + "\n" + "closeReason=" + closeReason + "\n" + "currentValue=" + currentValue + "\n" + "monitorObject=" + monitorObject + "\n"
                + "policy=" + policy + "\n" + "}";
    }

}