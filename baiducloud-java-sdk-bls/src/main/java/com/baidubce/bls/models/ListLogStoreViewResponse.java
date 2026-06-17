package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListLogStoreViewResponse extends BaseBceResponse {

    /**
    * 排序规则，desc为降序，asc为升序
    */
    private String order;

    /**
    * 排序字段
    */
    private String orderBy;

    /**
    * 起始页码
    */
    private Integer pageNo;

    /**
    * 每页显示数据大小
    */
    private Integer pageSize;

    /**
    * 总数目
    */
    private Integer totalCount;

    /**
    * LogStore 列表
    */
    private List<LogStoreView> views;

    public String getOrder() {
        return order;
    }

    public ListLogStoreViewResponse setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListLogStoreViewResponse setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListLogStoreViewResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListLogStoreViewResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListLogStoreViewResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<LogStoreView> getViews() {
        return views;
    }

    public ListLogStoreViewResponse setViews(List<LogStoreView> views) {
        this.views = views;
        return this;
    }

    @Override
    public String toString() {
        return "ListLogStoreViewResponse{" + "order=" + order + "\n" + "orderBy=" + orderBy + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount="
                + totalCount + "\n" + "views=" + views + "\n" + "}";
    }

}
