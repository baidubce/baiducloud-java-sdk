package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetRedisBigKeyAnalysisResultResponse extends BaseBceResponse {

    /**
    * 任务列表
    */
    private List<BigKeyTask> tasks;

    /**
    * 任务总个数
    */
    private Integer totalCount;

    public List<BigKeyTask> getTasks() {
        return tasks;
    }

    public GetRedisBigKeyAnalysisResultResponse setTasks(List<BigKeyTask> tasks) {
        this.tasks = tasks;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public GetRedisBigKeyAnalysisResultResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    @Override
    public String toString() {
        return "GetRedisBigKeyAnalysisResultResponse{" + "tasks=" + tasks + "\n" + "totalCount=" + totalCount + "\n" + "}";
    }

}
