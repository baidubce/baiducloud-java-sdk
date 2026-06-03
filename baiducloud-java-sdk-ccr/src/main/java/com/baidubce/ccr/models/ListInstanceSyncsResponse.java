package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListInstanceSyncsResponse extends BaseBceResponse {

    /**
    * 同步规则总数
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
    * 同步规则对象列表
    */
    private List<ReplicationSyncPolicyResult> items;

    public Integer getTotal() {
        return total;
    }

    public ListInstanceSyncsResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListInstanceSyncsResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListInstanceSyncsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public List<ReplicationSyncPolicyResult> getItems() {
        return items;
    }

    public ListInstanceSyncsResponse setItems(List<ReplicationSyncPolicyResult> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return "ListInstanceSyncsResponse{" + "total=" + total + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "items=" + items + "\n" + "}";
    }

}
