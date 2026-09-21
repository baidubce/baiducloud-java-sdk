package com.baidubce.cce.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InspectionTaskInfo {
    /**
     * 巡检任务 ID
     */
    private String taskId;

    /**
     * 巡检类型，可选 [ manual（手动）, automatic（自动） ]
     */
    private String inspectionType;

    /**
     * 巡检状态，可选 [ inspecting（巡检中）, normal（正常）, hasRisks（存在风险）, inspectionFailed（巡检失败） ]
     */
    private String inspectionStatus;

    /**
     * 巡检开始时间，如 2024-05-14T11:06:11+08:00
     */
    private String inspectStartTime;

    /**
     * 巡检结束时间
     */
    private String inspectEndTime;

    public InspectionTaskInfo setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public InspectionTaskInfo setInspectionType(String inspectionType) {
        this.inspectionType = inspectionType;
        return this;
    }

    public String getInspectionType() {
        return this.inspectionType;
    }

    public InspectionTaskInfo setInspectionStatus(String inspectionStatus) {
        this.inspectionStatus = inspectionStatus;
        return this;
    }

    public String getInspectionStatus() {
        return this.inspectionStatus;
    }

    public InspectionTaskInfo setInspectStartTime(String inspectStartTime) {
        this.inspectStartTime = inspectStartTime;
        return this;
    }

    public String getInspectStartTime() {
        return this.inspectStartTime;
    }

    public InspectionTaskInfo setInspectEndTime(String inspectEndTime) {
        this.inspectEndTime = inspectEndTime;
        return this;
    }

    public String getInspectEndTime() {
        return this.inspectEndTime;
    }

    @Override
    public String toString() {
        return "InspectionTaskInfo{" + "taskId=" + taskId + "\n" + "inspectionType=" + inspectionType + "\n" + "inspectionStatus=" + inspectionStatus + "\n" + "inspectStartTime="
                + inspectStartTime + "\n" + "inspectEndTime=" + inspectEndTime + "\n" + "}";
    }

}