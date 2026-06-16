package com.baidubce.bls.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DownloadTaskListResult {
    /**
     * 下载任务列表
     */
    private List<Task> tasks;

    /**
     * 总数
     */
    private Integer total;

    /**
     * 排序字段
     */
    private String orderBy;

    /**
     * 排序顺序
     */
    private String order;

    /**
     * 页码
     */
    private Integer pageNo;

    /**
     * 每页大小
     */
    private Integer pageSize;

    public DownloadTaskListResult setTasks(List<Task> tasks) {
        this.tasks = tasks;
        return this;
    }

    public List<Task> getTasks() {
        return this.tasks;
    }

    public DownloadTaskListResult setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getTotal() {
        return this.total;
    }

    public DownloadTaskListResult setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrderBy() {
        return this.orderBy;
    }

    public DownloadTaskListResult setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrder() {
        return this.order;
    }

    public DownloadTaskListResult setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public DownloadTaskListResult setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    @Override
    public String toString() {
        return "DownloadTaskListResult{" + "tasks=" + tasks + "\n" + "total=" + total + "\n" + "orderBy=" + orderBy + "\n" + "order=" + order + "\n" + "pageNo=" + pageNo + "\n"
                + "pageSize=" + pageSize + "\n" + "}";
    }

}