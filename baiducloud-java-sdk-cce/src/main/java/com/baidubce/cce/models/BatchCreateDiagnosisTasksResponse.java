package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchCreateDiagnosisTasksResponse extends BaseBceResponse {

    /**
    * 诊断任务 ID 列表，顺序与 targets 一一对应
    */
    private List<String> taskIds;

    public List<String> getTaskIds() {
        return taskIds;
    }

    public BatchCreateDiagnosisTasksResponse setTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }

    @Override
    public String toString() {
        return "BatchCreateDiagnosisTasksResponse{" + "taskIds=" + taskIds + "\n" + "}";
    }

}
