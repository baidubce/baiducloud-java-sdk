package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListChartVersionsResponse extends BaseBceResponse {

    /**
    * 私有网络域名
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
    * Chart版本结果列表
    */
    private List<HelmChartVersion> items;

    public Integer getTotal() {
        return total;
    }

    public ListChartVersionsResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListChartVersionsResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListChartVersionsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public List<HelmChartVersion> getItems() {
        return items;
    }

    public ListChartVersionsResponse setItems(List<HelmChartVersion> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return "ListChartVersionsResponse{" + "total=" + total + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "items=" + items + "\n" + "}";
    }

}
