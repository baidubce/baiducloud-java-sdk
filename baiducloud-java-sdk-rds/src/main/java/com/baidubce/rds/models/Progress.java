package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Progress {
    /**
     * 步骤标识，如：initialize_task/prepare_resource/sync_data/wait_timewindow/execute_switchover/finish_task 等
     */
    private String step;

    /**
     * 步骤状态，可取值：created/running/success/failed
     */
    private String status;

    /**
     * 步骤描述
     */
    private String description;

    /**
     * 步骤开始时间，未开始时可能不返回
     */
    private String startTime;

    /**
     * 步骤完成时间，未完成时可能不返回
     */
    private String finishTime;

    /**
     * 当前步骤完成百分比，取值 0~100
     */
    private Integer percentage;

    /**
     * 当前步骤预估剩余时间，单位：秒
     */
    private Integer estimateTime;

    public Progress setStep(String step) {
        this.step = step;
        return this;
    }

    public String getStep() {
        return this.step;
    }

    public Progress setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public Progress setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Progress setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public Progress setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    public String getFinishTime() {
        return this.finishTime;
    }

    public Progress setPercentage(Integer percentage) {
        this.percentage = percentage;
        return this;
    }

    public Integer getPercentage() {
        return this.percentage;
    }

    public Progress setEstimateTime(Integer estimateTime) {
        this.estimateTime = estimateTime;
        return this;
    }

    public Integer getEstimateTime() {
        return this.estimateTime;
    }

    @Override
    public String toString() {
        return "Progress{" + "step=" + step + "\n" + "status=" + status + "\n" + "description=" + description + "\n" + "startTime=" + startTime + "\n" + "finishTime=" + finishTime
                + "\n" + "percentage=" + percentage + "\n" + "estimateTime=" + estimateTime + "\n" + "}";
    }

}