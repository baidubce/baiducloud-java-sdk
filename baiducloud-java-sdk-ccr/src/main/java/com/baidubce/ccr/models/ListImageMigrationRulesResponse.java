package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListImageMigrationRulesResponse extends BaseBceResponse {

    /**
    * 镜像迁移规则总数
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
    * 镜像迁移规则对象列表
    */
    private List<ReplicationPolicyResult> items;

    public Integer getTotal() {
        return total;
    }

    public ListImageMigrationRulesResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListImageMigrationRulesResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListImageMigrationRulesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public List<ReplicationPolicyResult> getItems() {
        return items;
    }

    public ListImageMigrationRulesResponse setItems(List<ReplicationPolicyResult> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return "ListImageMigrationRulesResponse{" + "total=" + total + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "items=" + items + "\n" + "}";
    }

}
