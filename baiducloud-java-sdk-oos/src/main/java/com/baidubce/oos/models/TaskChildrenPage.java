package com.baidubce.oos.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaskChildrenPage {
    /**
     * 子执行分页列表
     */
    private List<Task> children;

    /**
     * 子执行总数量
     */
    private Integer total;

    /**
     * 排序字段
     */
    private String orderBy;

    /**
     * 排序方向 asc/desc
     */
    private String order;

    /**
     * 页数，从 1 开始计数
     */
    private Integer pageNo;

    /**
     * 每页展示数量
     */
    private Integer pageSize;

    public TaskChildrenPage setChildren(List<Task> children) {
        this.children = children;
        return this;
    }

    public List<Task> getChildren() {
        return this.children;
    }

    public TaskChildrenPage setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getTotal() {
        return this.total;
    }

    public TaskChildrenPage setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrderBy() {
        return this.orderBy;
    }

    public TaskChildrenPage setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrder() {
        return this.order;
    }

    public TaskChildrenPage setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public TaskChildrenPage setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    @Override
    public String toString() {
        return "TaskChildrenPage{" + "children=" + children + "\n" + "total=" + total + "\n" + "orderBy=" + orderBy + "\n" + "order=" + order + "\n" + "pageNo=" + pageNo + "\n"
                + "pageSize=" + pageSize + "\n" + "}";
    }

}