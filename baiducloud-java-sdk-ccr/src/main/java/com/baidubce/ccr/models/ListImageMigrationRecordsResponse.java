package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListImageMigrationRecordsResponse extends BaseBceResponse {

    /**
    * 执行记录总数
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
    * 执行记录列表
    */
    private List<ExecutionResult> items;

    public Integer getTotal() {
        return total;
    }

    public ListImageMigrationRecordsResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListImageMigrationRecordsResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListImageMigrationRecordsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public List<ExecutionResult> getItems() {
        return items;
    }

    public ListImageMigrationRecordsResponse setItems(List<ExecutionResult> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return "ListImageMigrationRecordsResponse{" + "total=" + total + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "items=" + items + "\n" + "}";
    }

}
