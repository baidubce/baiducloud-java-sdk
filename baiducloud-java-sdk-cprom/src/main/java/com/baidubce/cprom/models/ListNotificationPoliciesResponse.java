package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListNotificationPoliciesResponse extends BaseBceResponse {

    /**
    * 筛选条件类型
    */
    private String keywordType;

    /**
    * 筛选条件关键字
    */
    private String keyword;

    /**
    * 通知策略列表排序依据字段
    */
    private String orderBy;

    /**
    * 通知策略列表排序方式：desc倒序，asc升序
    */
    private String order;

    /**
    * 通知策略分页当前页码数
    */
    private Integer pageNo;

    /**
    * 当前页页通知策略个数
    */
    private Integer pageSize;

    /**
    * 通知策略总个数
    */
    private Integer totalCount;

    /**
    * 通知策略列表
    */
    private List<NotifyRule> items;

    public String getKeywordType() {
        return keywordType;
    }

    public ListNotificationPoliciesResponse setKeywordType(String keywordType) {
        this.keywordType = keywordType;
        return this;
    }

    public String getKeyword() {
        return keyword;
    }

    public ListNotificationPoliciesResponse setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListNotificationPoliciesResponse setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListNotificationPoliciesResponse setOrder(String order) {
        this.order = order;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListNotificationPoliciesResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListNotificationPoliciesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListNotificationPoliciesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<NotifyRule> getItems() {
        return items;
    }

    public ListNotificationPoliciesResponse setItems(List<NotifyRule> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return "ListNotificationPoliciesResponse{" + "keywordType=" + keywordType + "\n" + "keyword=" + keyword + "\n" + "orderBy=" + orderBy + "\n" + "order=" + order + "\n"
                + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount=" + totalCount + "\n" + "items=" + items + "\n" + "}";
    }

}
