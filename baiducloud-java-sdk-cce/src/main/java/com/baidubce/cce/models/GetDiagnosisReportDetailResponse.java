package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetDiagnosisReportDetailResponse extends BaseBceResponse {

    /**
    * 诊断任务 ID
    */
    private String taskId;

    /**
    * 诊断类型，可选 [ pod, node ]
    */
    private String diagnosisType;

    /**
    * 诊断报告是否完成
    */
    private Boolean completed;

    /**
    * 诊断任务结果，可选 [ normal（健康）, abnormal（异常）, doing（诊断中）, failed（诊断失败） ]
    */
    private String taskResult;

    /**
    * 任务开始时间
    */
    private String startTime;

    /**
    * 任务结束时间
    */
    private String endTime;

    /**
    * 任务执行的诊断项数量
    */
    private Integer itemsCount;

    /**
    * target
    */
    private Target target;

    /**
    * 诊断项列表，外层 key 为诊断项类别，内层 key 为诊断项英文名
    */
    private Map<String, Map<String, DiagnosisReportItem>> reportItems;

    /**
    * conclusion
    */
    private Conclusion conclusion;

    public String getTaskId() {
        return taskId;
    }

    public GetDiagnosisReportDetailResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    public String getDiagnosisType() {
        return diagnosisType;
    }

    public GetDiagnosisReportDetailResponse setDiagnosisType(String diagnosisType) {
        this.diagnosisType = diagnosisType;
        return this;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public GetDiagnosisReportDetailResponse setCompleted(Boolean completed) {
        this.completed = completed;
        return this;
    }

    public String getTaskResult() {
        return taskResult;
    }

    public GetDiagnosisReportDetailResponse setTaskResult(String taskResult) {
        this.taskResult = taskResult;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public GetDiagnosisReportDetailResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public GetDiagnosisReportDetailResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public Integer getItemsCount() {
        return itemsCount;
    }

    public GetDiagnosisReportDetailResponse setItemsCount(Integer itemsCount) {
        this.itemsCount = itemsCount;
        return this;
    }

    public Target getTarget() {
        return target;
    }

    public GetDiagnosisReportDetailResponse setTarget(Target target) {
        this.target = target;
        return this;
    }

    public Map<String, Map<String, DiagnosisReportItem>> getReportItems() {
        return reportItems;
    }

    public GetDiagnosisReportDetailResponse setReportItems(Map<String, Map<String, DiagnosisReportItem>> reportItems) {
        this.reportItems = reportItems;
        return this;
    }

    public Conclusion getConclusion() {
        return conclusion;
    }

    public GetDiagnosisReportDetailResponse setConclusion(Conclusion conclusion) {
        this.conclusion = conclusion;
        return this;
    }

    @Override
    public String toString() {
        return "GetDiagnosisReportDetailResponse{" + "taskId=" + taskId + "\n" + "diagnosisType=" + diagnosisType + "\n" + "completed=" + completed + "\n" + "taskResult="
                + taskResult + "\n" + "startTime=" + startTime + "\n" + "endTime=" + endTime + "\n" + "itemsCount=" + itemsCount + "\n" + "target=" + target + "\n"
                + "reportItems=" + reportItems + "\n" + "conclusion=" + conclusion + "\n" + "}";
    }

}
