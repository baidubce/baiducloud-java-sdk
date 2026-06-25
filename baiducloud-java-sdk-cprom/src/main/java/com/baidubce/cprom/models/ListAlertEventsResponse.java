package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAlertEventsResponse extends BaseBceResponse {

    /**
    * 告警事件总个数
    */
    private Integer totalCount;

    /**
    * 当前页码数
    */
    private Integer pageNo;

    /**
    * 当前页告警事件个数
    */
    private Integer pageSize;

    /**
    * 告警事件列表
    */
    private List<Event> items;

    /**
    * 排序依据字段
    */
    private String orderBy;

    /**
    * 排序方式：desc 倒序，asc 升序
    */
    private String order;

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListAlertEventsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListAlertEventsResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListAlertEventsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public List<Event> getItems() {
        return items;
    }

    public ListAlertEventsResponse setItems(List<Event> items) {
        this.items = items;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListAlertEventsResponse setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListAlertEventsResponse setOrder(String order) {
        this.order = order;
        return this;
    }

    @Override
    public String toString() {
        return "ListAlertEventsResponse{" + "totalCount=" + totalCount + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "items=" + items + "\n" + "orderBy="
                + orderBy + "\n" + "order=" + order + "\n" + "}";
    }

}
