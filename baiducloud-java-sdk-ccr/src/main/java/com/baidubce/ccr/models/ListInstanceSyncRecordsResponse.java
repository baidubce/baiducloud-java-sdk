package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListInstanceSyncRecordsResponse extends BaseBceResponse {

    /**
    * 执行记录总数
    */
    private Integer total;

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

    public ListInstanceSyncRecordsResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListInstanceSyncRecordsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public List<ExecutionResult> getItems() {
        return items;
    }

    public ListInstanceSyncRecordsResponse setItems(List<ExecutionResult> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return "ListInstanceSyncRecordsResponse{" + "total=" + total + "\n" + "pageSize=" + pageSize + "\n" + "items=" + items + "\n" + "}";
    }

}
