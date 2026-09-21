package com.baidubce.cce.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DiagnosisTaskInfo {
    /**
     * 诊断任务 ID
     */
    private String taskId;

    /**
     * 诊断类型，可选 [ pod, node ]
     */
    private String diagnosisType;

    /**
     * 任务结果，可选 [ succeeded（成功）, doing（诊断中）, failed（失败） ]
     */
    private String result;

    /**
     * 任务开始时间
     */
    private String startTime;

    /**
     * 任务结束时间
     */
    private String endTime;

    /**
     * target
     */
    private Target target;

    /**
     * 任务阶段状态列表
     */
    private List<TaskPhase> taskPhases;

    public DiagnosisTaskInfo setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public DiagnosisTaskInfo setDiagnosisType(String diagnosisType) {
        this.diagnosisType = diagnosisType;
        return this;
    }

    public String getDiagnosisType() {
        return this.diagnosisType;
    }

    public DiagnosisTaskInfo setResult(String result) {
        this.result = result;
        return this;
    }

    public String getResult() {
        return this.result;
    }

    public DiagnosisTaskInfo setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public DiagnosisTaskInfo setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public DiagnosisTaskInfo setTarget(Target target) {
        this.target = target;
        return this;
    }

    public Target getTarget() {
        return this.target;
    }

    public DiagnosisTaskInfo setTaskPhases(List<TaskPhase> taskPhases) {
        this.taskPhases = taskPhases;
        return this;
    }

    public List<TaskPhase> getTaskPhases() {
        return this.taskPhases;
    }

    @Override
    public String toString() {
        return "DiagnosisTaskInfo{" + "taskId=" + taskId + "\n" + "diagnosisType=" + diagnosisType + "\n" + "result=" + result + "\n" + "startTime=" + startTime + "\n"
                + "endTime=" + endTime + "\n" + "target=" + target + "\n" + "taskPhases=" + taskPhases + "\n" + "}";
    }

}