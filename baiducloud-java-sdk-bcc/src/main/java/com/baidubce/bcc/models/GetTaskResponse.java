package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTaskResponse extends BaseBceResponse {

    /**
    * 任务详情列表
    */
    private List<TaskDetail> tasks;

    public List<TaskDetail> getTasks() {
        return tasks;
    }

    public GetTaskResponse setTasks(List<TaskDetail> tasks) {
        this.tasks = tasks;
        return this;
    }

    @Override
    public String toString() {
        return "GetTaskResponse{" + "tasks=" + tasks + "\n" + "}";
    }

}
