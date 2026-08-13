package com.baidubce.aigw.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RouteListPage {
    /**
     * 排序字段
     */
    private String orderBy;

    /**
     * 排序方向：asc、desc
     */
    private String order;

    /**
     * 当前页码
     */
    private Integer pageNo;

    /**
     * 每页条数
     */
    private Integer pageSize;

    /**
     * 总记录数
     */
    private Integer totalCount;

    /**
     * 路由摘要列表
     */
    private List<RouteSummary> result;

    public RouteListPage setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrderBy() {
        return this.orderBy;
    }

    public RouteListPage setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrder() {
        return this.order;
    }

    public RouteListPage setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public RouteListPage setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public RouteListPage setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public RouteListPage setResult(List<RouteSummary> result) {
        this.result = result;
        return this;
    }

    public List<RouteSummary> getResult() {
        return this.result;
    }

    @Override
    public String toString() {
        return "RouteListPage{" + "orderBy=" + orderBy + "\n" + "order=" + order + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount=" + totalCount
                + "\n" + "result=" + result + "\n" + "}";
    }

}