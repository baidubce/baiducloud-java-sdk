package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTaskListResponse extends BaseBceResponse {

    /**
    * 任务列表，元素结构见下方 Task
    */
    private List<Task> tasks;

    /**
    * 符合查询条件的任务总数
    */
    private Integer count;

    public List<Task> getTasks() {
        return tasks;
    }

    public QueryTaskListResponse setTasks(List<Task> tasks) {
        this.tasks = tasks;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public QueryTaskListResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    @Override
    public String toString() {
        return "QueryTaskListResponse{" + "tasks=" + tasks + "\n" + "count=" + count + "\n" + "}";
    }

}
