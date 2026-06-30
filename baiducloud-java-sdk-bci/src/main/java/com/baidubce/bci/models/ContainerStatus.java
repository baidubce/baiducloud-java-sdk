package com.baidubce.bci.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContainerStatus {
    /**
     * 状态：Waiting、Running、Terminated
     */
    private String state;

    /**
     * 状态Reason
     */
    private String reason;

    /**
     * 状态信息
     */
    private String message;

    /**
     * 运行开始时间
     */
    private String startTime;

    /**
     * 运行结束时间
     */
    private String finishTime;

    /**
     * 状态详情
     */
    private String detailStatus;

    /**
     * 运行退出码
     */
    private Integer exitCode;

    public ContainerStatus setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public ContainerStatus setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getReason() {
        return this.reason;
    }

    public ContainerStatus setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public ContainerStatus setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public ContainerStatus setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    public String getFinishTime() {
        return this.finishTime;
    }

    public ContainerStatus setDetailStatus(String detailStatus) {
        this.detailStatus = detailStatus;
        return this;
    }

    public String getDetailStatus() {
        return this.detailStatus;
    }

    public ContainerStatus setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    public Integer getExitCode() {
        return this.exitCode;
    }

    @Override
    public String toString() {
        return "ContainerStatus{" + "state=" + state + "\n" + "reason=" + reason + "\n" + "message=" + message + "\n" + "startTime=" + startTime + "\n" + "finishTime="
                + finishTime + "\n" + "detailStatus=" + detailStatus + "\n" + "exitCode=" + exitCode + "\n" + "}";
    }

}