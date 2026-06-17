package com.baidubce.bls.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExecutionSummaryResult {
    /**
     * 执行统计列表
     */
    private List<ExecutionStats> executionStats;

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

    public ExecutionSummaryResult setExecutionStats(List<ExecutionStats> executionStats) {
        this.executionStats = executionStats;
        return this;
    }

    public List<ExecutionStats> getExecutionStats() {
        return this.executionStats;
    }

    public ExecutionSummaryResult setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public ExecutionSummaryResult setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public ExecutionSummaryResult setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    @Override
    public String toString() {
        return "ExecutionSummaryResult{" + "executionStats=" + executionStats + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount=" + totalCount
                + "\n" + "}";
    }

}