package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAIGatewaysResponse extends BaseBceResponse {

    /**
    * 实际排序字段
    */
    private String orderBy;

    /**
    * 实际排序方向
    */
    private String order;

    /**
    * 当前页码
    */
    private Integer pageNo;

    /**
    * 每页数量
    */
    private Integer pageSize;

    /**
    * 实例总数
    */
    private Long totalCount;

    /**
    * 网关实例列表
    */
    private List<AIGatewayListItem> result;

    public String getOrderBy() {
        return orderBy;
    }

    public ListAIGatewaysResponse setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListAIGatewaysResponse setOrder(String order) {
        this.order = order;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListAIGatewaysResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListAIGatewaysResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public ListAIGatewaysResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<AIGatewayListItem> getResult() {
        return result;
    }

    public ListAIGatewaysResponse setResult(List<AIGatewayListItem> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "ListAIGatewaysResponse{" + "orderBy=" + orderBy + "\n" + "order=" + order + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount="
                + totalCount + "\n" + "result=" + result + "\n" + "}";
    }

}
