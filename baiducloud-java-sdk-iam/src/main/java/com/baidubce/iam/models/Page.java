package com.baidubce.iam.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Page {
    /**
     * orderBy
     */
    private String orderBy;

    /**
     * order
     */
    private String order;

    /**
     * 
     */
    private Integer pageNo;

    /**
     * 
     */
    private Integer pageSize;

    /**
     * 
     */
    private Integer totalCount;

    /**
     * 
     */
    private List<APIKey> result;

    public Page setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrderBy() {
        return this.orderBy;
    }

    public Page setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrder() {
        return this.order;
    }

    public Page setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public Page setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public Page setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public Page setResult(List<APIKey> result) {
        this.result = result;
        return this;
    }

    public List<APIKey> getResult() {
        return this.result;
    }

    @Override
    public String toString() {
        return "Page{" + "orderBy=" + orderBy + "\n" + "order=" + order + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount=" + totalCount + "\n"
                + "result=" + result + "\n" + "}";
    }

}