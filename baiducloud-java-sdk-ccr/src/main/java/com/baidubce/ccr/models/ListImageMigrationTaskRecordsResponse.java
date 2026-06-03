package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListImageMigrationTaskRecordsResponse extends BaseBceResponse {

    /**
    * 任务执行结果总数
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
    * 任务执行结果列表
    */
    private List<TaskResult> items;

    public Integer getTotal() {
        return total;
    }

    public ListImageMigrationTaskRecordsResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListImageMigrationTaskRecordsResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListImageMigrationTaskRecordsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public List<TaskResult> getItems() {
        return items;
    }

    public ListImageMigrationTaskRecordsResponse setItems(List<TaskResult> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return "ListImageMigrationTaskRecordsResponse{" + "total=" + total + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "items=" + items + "\n" + "}";
    }

}
