package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAlertsResponse extends BaseBceResponse {

    /**
    * 筛选条件类型
    */
    private String keywordType;

    /**
    * 筛选条件关键字
    */
    private String keyword;

    /**
    * 告警列表排序依据字段
    */
    private String orderBy;

    /**
    * 告警列表排序方式：desc倒序，asc升序
    */
    private String order;

    /**
    * 分页当前页码数
    */
    private Integer pageNo;

    /**
    * 当前页告警个数
    */
    private Integer pageSize;

    /**
    * 告警总个数
    */
    private Integer totalCount;

    /**
    * 告警列表
    */
    private List<RuleDetail> items;

    public String getKeywordType() {
        return keywordType;
    }

    public ListAlertsResponse setKeywordType(String keywordType) {
        this.keywordType = keywordType;
        return this;
    }

    public String getKeyword() {
        return keyword;
    }

    public ListAlertsResponse setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListAlertsResponse setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListAlertsResponse setOrder(String order) {
        this.order = order;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListAlertsResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListAlertsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListAlertsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<RuleDetail> getItems() {
        return items;
    }

    public ListAlertsResponse setItems(List<RuleDetail> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return "ListAlertsResponse{" + "keywordType=" + keywordType + "\n" + "keyword=" + keyword + "\n" + "orderBy=" + orderBy + "\n" + "order=" + order + "\n" + "pageNo="
                + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount=" + totalCount + "\n" + "items=" + items + "\n" + "}";
    }

}
