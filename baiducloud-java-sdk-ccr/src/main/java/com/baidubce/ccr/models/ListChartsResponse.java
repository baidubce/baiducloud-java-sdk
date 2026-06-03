package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListChartsResponse extends BaseBceResponse {

    /**
    * 结果记录条数
    */
    private Integer total;

    /**
    * 当前页码
    */
    private Integer pageNo;

    /**
    * 每页记录数
    */
    private Integer pageSize;

    /**
    * HelmChart结果列表
    */
    private List<HelmChart> items;

    public Integer getTotal() {
        return total;
    }

    public ListChartsResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListChartsResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListChartsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public List<HelmChart> getItems() {
        return items;
    }

    public ListChartsResponse setItems(List<HelmChart> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return "ListChartsResponse{" + "total=" + total + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "items=" + items + "\n" + "}";
    }

}
