package com.baidubce.oos.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExecutionPage {
    /**
     * 执行列表
     */
    private List<Execution> executions;

    /**
     * 排序字段
     */
    private String orderBy;

    /**
     * 排序方向 asc/desc
     */
    private String order;

    /**
     * 页数
     */
    private Integer pageNo;

    /**
     * 每页展示数量
     */
    private Integer pageSize;

    /**
     * 总数量
     */
    private Integer totalCount;

    public ExecutionPage setExecutions(List<Execution> executions) {
        this.executions = executions;
        return this;
    }

    public List<Execution> getExecutions() {
        return this.executions;
    }

    public ExecutionPage setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrderBy() {
        return this.orderBy;
    }

    public ExecutionPage setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrder() {
        return this.order;
    }

    public ExecutionPage setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public ExecutionPage setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public ExecutionPage setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    @Override
    public String toString() {
        return "ExecutionPage{" + "executions=" + executions + "\n" + "orderBy=" + orderBy + "\n" + "order=" + order + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize
                + "\n" + "totalCount=" + totalCount + "\n" + "}";
    }

}