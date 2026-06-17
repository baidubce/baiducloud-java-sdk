package com.baidubce.bls.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExecutionListResult {
    /**
     * 第几页
     */
    private Integer pageNo;

    /**
     * 每页展示数量
     */
    private Integer pageSize;

    /**
     * 总数
     */
    private Integer totalCount;

    /**
     * 执行列表
     */
    private List<Execution> executions;

    public ExecutionListResult setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public ExecutionListResult setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public ExecutionListResult setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ExecutionListResult setExecutions(List<Execution> executions) {
        this.executions = executions;
        return this;
    }

    public List<Execution> getExecutions() {
        return this.executions;
    }

    @Override
    public String toString() {
        return "ExecutionListResult{" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount=" + totalCount + "\n" + "executions=" + executions + "\n" + "}";
    }

}