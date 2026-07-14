package com.baidubce.as.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAsGroupV2Response extends BaseBceResponse {

    /**
    * 排序的key
    */
    private String orderBy;

    /**
    * 排序顺序（升序asc，降序desc）
    */
    private String order;

    /**
    * 页码数
    */
    private Integer pageNo;

    /**
    * 每页返回结果数
    */
    private Integer pageSize;

    /**
    * 符合条件的查询结果数
    */
    private Integer totalCount;

    /**
    * 查询结果
    */
    private List<AsGroup> result;

    public String getOrderBy() {
        return orderBy;
    }

    public ListAsGroupV2Response setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListAsGroupV2Response setOrder(String order) {
        this.order = order;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListAsGroupV2Response setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListAsGroupV2Response setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListAsGroupV2Response setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<AsGroup> getResult() {
        return result;
    }

    public ListAsGroupV2Response setResult(List<AsGroup> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "ListAsGroupV2Response{" + "orderBy=" + orderBy + "\n" + "order=" + order + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount="
                + totalCount + "\n" + "result=" + result + "\n" + "}";
    }

}
