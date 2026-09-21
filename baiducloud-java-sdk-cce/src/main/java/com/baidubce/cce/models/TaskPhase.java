package com.baidubce.cce.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaskPhase {
    /**
     * 阶段 ID
     */
    private Integer phaseId;

    /**
     * 阶段名称，可选 [ identifying（识别）, collecting（采集）, evaluating（评估）, analyzing（分析） ]
     */
    private String phaseName;

    /**
     * 阶段状态，可选 [ doing, succeeded, failed ]
     */
    private String phaseResult;

    /**
     * 阶段完成时间
     */
    private String phaseTime;

    /**
     * 错误信息，仅在阶段失败时返回
     */
    private String errorMessage;

    public TaskPhase setPhaseId(Integer phaseId) {
        this.phaseId = phaseId;
        return this;
    }

    public Integer getPhaseId() {
        return this.phaseId;
    }

    public TaskPhase setPhaseName(String phaseName) {
        this.phaseName = phaseName;
        return this;
    }

    public String getPhaseName() {
        return this.phaseName;
    }

    public TaskPhase setPhaseResult(String phaseResult) {
        this.phaseResult = phaseResult;
        return this;
    }

    public String getPhaseResult() {
        return this.phaseResult;
    }

    public TaskPhase setPhaseTime(String phaseTime) {
        this.phaseTime = phaseTime;
        return this;
    }

    public String getPhaseTime() {
        return this.phaseTime;
    }

    public TaskPhase setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    @Override
    public String toString() {
        return "TaskPhase{" + "phaseId=" + phaseId + "\n" + "phaseName=" + phaseName + "\n" + "phaseResult=" + phaseResult + "\n" + "phaseTime=" + phaseTime + "\n"
                + "errorMessage=" + errorMessage + "\n" + "}";
    }

}