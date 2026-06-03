package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListRepositoriesResponse extends BaseBceResponse {

    /**
    * 记录总数
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
    * 结果列表
    */
    private List<Repository> items;

    public Integer getTotal() {
        return total;
    }

    public ListRepositoriesResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListRepositoriesResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListRepositoriesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public List<Repository> getItems() {
        return items;
    }

    public ListRepositoriesResponse setItems(List<Repository> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return "ListRepositoriesResponse{" + "total=" + total + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "items=" + items + "\n" + "}";
    }

}
