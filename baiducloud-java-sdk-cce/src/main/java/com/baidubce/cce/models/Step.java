package com.baidubce.cce.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Step {
    /**
     * 
     */
    private String stepName;

    /**
     * 
     */
    private String stepStatus;

    /**
     * 
     */
    private Boolean ready;

    /**
     * 
     */
    private String startTime;

    /**
     * 
     */
    private String finishedTime;

    /**
     * 
     */
    private Integer costSeconds;

    /**
     * 
     */
    private Integer retryCount;

    /**
     * 
     */
    private Object errInfo;

    public Step setStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }

    public String getStepName() {
        return this.stepName;
    }

    public Step setStepStatus(String stepStatus) {
        this.stepStatus = stepStatus;
        return this;
    }

    public String getStepStatus() {
        return this.stepStatus;
    }

    public Step setReady(Boolean ready) {
        this.ready = ready;
        return this;
    }

    public Boolean getReady() {
        return this.ready;
    }

    public Step setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public Step setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }

    public String getFinishedTime() {
        return this.finishedTime;
    }

    public Step setCostSeconds(Integer costSeconds) {
        this.costSeconds = costSeconds;
        return this;
    }

    public Integer getCostSeconds() {
        return this.costSeconds;
    }

    public Step setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
        return this;
    }

    public Integer getRetryCount() {
        return this.retryCount;
    }

    public Step setErrInfo(Object errInfo) {
        this.errInfo = errInfo;
        return this;
    }

    public Object getErrInfo() {
        return this.errInfo;
    }

    @Override
    public String toString() {
        return "Step{" + "stepName=" + stepName + "\n" + "stepStatus=" + stepStatus + "\n" + "ready=" + ready + "\n" + "startTime=" + startTime + "\n" + "finishedTime="
                + finishedTime + "\n" + "costSeconds=" + costSeconds + "\n" + "retryCount=" + retryCount + "\n" + "errInfo=" + errInfo + "\n" + "}";
    }

}