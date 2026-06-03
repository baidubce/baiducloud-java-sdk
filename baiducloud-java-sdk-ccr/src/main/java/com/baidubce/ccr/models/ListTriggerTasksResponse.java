package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListTriggerTasksResponse extends BaseBceResponse {

    /**
    * 触发器任务总数
    */
    private Integer total;

    /**
    * 当前页
    */
    private Integer pageNo;

    /**
    * 每页记录数
    */
    private Integer pageSize;

    /**
    * 触发器任务列表
    */
    private List<TriggerJob> jobs;

    public Integer getTotal() {
        return total;
    }

    public ListTriggerTasksResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListTriggerTasksResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListTriggerTasksResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public List<TriggerJob> getJobs() {
        return jobs;
    }

    public ListTriggerTasksResponse setJobs(List<TriggerJob> jobs) {
        this.jobs = jobs;
        return this;
    }

    @Override
    public String toString() {
        return "ListTriggerTasksResponse{" + "total=" + total + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "jobs=" + jobs + "\n" + "}";
    }

}
