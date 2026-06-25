package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListPodMonitorsResponse extends BaseBceResponse {

    /**
    * 排序字段
    */
    private String orderBy;

    /**
    * 排序方式
    */
    private String order;

    /**
    * 筛选条件类型
    */
    private String keywordType;

    /**
    * 筛选关键字
    */
    private String keyword;

    /**
    * 当前页码
    */
    private Integer pageNo;

    /**
    * 每页数量
    */
    private Integer pageSize;

    /**
    * 总数量
    */
    private Integer totalCount;

    /**
    * Pod Monitor 服务状态：running/terminated
    */
    private String status;

    /**
    * Pod Monitor 列表
    */
    private List<PodMonitorItem> items;

    public String getOrderBy() {
        return orderBy;
    }

    public ListPodMonitorsResponse setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListPodMonitorsResponse setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getKeywordType() {
        return keywordType;
    }

    public ListPodMonitorsResponse setKeywordType(String keywordType) {
        this.keywordType = keywordType;
        return this;
    }

    public String getKeyword() {
        return keyword;
    }

    public ListPodMonitorsResponse setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListPodMonitorsResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListPodMonitorsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListPodMonitorsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ListPodMonitorsResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public List<PodMonitorItem> getItems() {
        return items;
    }

    public ListPodMonitorsResponse setItems(List<PodMonitorItem> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return "ListPodMonitorsResponse{" + "orderBy=" + orderBy + "\n" + "order=" + order + "\n" + "keywordType=" + keywordType + "\n" + "keyword=" + keyword + "\n" + "pageNo="
                + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount=" + totalCount + "\n" + "status=" + status + "\n" + "items=" + items + "\n" + "}";
    }

}
