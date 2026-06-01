package com.baidubce.apm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApmDescribeAlarmResponse extends BaseBceResponse {

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
    * 报警ID
    */
    private String id;

    /**
    * 报警开始时间，UTC时间
    */
    private String startTime;

    /**
    * 报警关闭时间，UTC时间，若报警未关闭该值为空字符串
    */
    private String endTime;

    /**
    * 报警持续时间，单位：分钟
    */
    private Integer duration;

    /**
    * 初始报警状态，可选值：ALERT-报警中，NODATA-无数据报警
    */
    private String initState;

    /**
    * 报警状态，可选值：OK-已恢复，ALERT-报警中，NODATA-无数据报警，CLOSED-已关闭
    */
    private String state;

    /**
    * 报警关闭原因，可选值：POLICY_MODIFIED-报警策略更新
    */
    private String closeReason;

    /**
    * 报警异常值
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

    public Boolean getSuccess() {
        return success;
    }

    public ApmDescribeAlarmResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public ApmDescribeAlarmResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ApmDescribeAlarmResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getId() {
        return id;
    }

    public ApmDescribeAlarmResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public ApmDescribeAlarmResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public ApmDescribeAlarmResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public ApmDescribeAlarmResponse setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public String getInitState() {
        return initState;
    }

    public ApmDescribeAlarmResponse setInitState(String initState) {
        this.initState = initState;
        return this;
    }

    public String getState() {
        return state;
    }

    public ApmDescribeAlarmResponse setState(String state) {
        this.state = state;
        return this;
    }

    public String getCloseReason() {
        return closeReason;
    }

    public ApmDescribeAlarmResponse setCloseReason(String closeReason) {
        this.closeReason = closeReason;
        return this;
    }

    public String getCurrentValue() {
        return currentValue;
    }

    public ApmDescribeAlarmResponse setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    public String getMonitorObject() {
        return monitorObject;
    }

    public ApmDescribeAlarmResponse setMonitorObject(String monitorObject) {
        this.monitorObject = monitorObject;
        return this;
    }

    public AlarmPolicyDetail getPolicy() {
        return policy;
    }

    public ApmDescribeAlarmResponse setPolicy(AlarmPolicyDetail policy) {
        this.policy = policy;
        return this;
    }

    @Override
    public String toString() {
        return "ApmDescribeAlarmResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "id=" + id + "\n" + "startTime=" + startTime
                + "\n" + "endTime=" + endTime + "\n" + "duration=" + duration + "\n" + "initState=" + initState + "\n" + "state=" + state + "\n" + "closeReason=" + closeReason
                + "\n" + "currentValue=" + currentValue + "\n" + "monitorObject=" + monitorObject + "\n" + "policy=" + policy + "\n" + "}";
    }

}
