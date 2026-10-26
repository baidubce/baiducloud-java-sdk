package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListL3AccessGroupResponse extends BaseBceResponse {

    /**
    * 唯一请求 ID，每次请求都会返回
    */
    private String requestId;

    /**
    * 当前页的权限组列表
    */
    private List<AccessGroupInfo> result;

    /**
    * 当前页码
    */
    private Integer pageNo;

    /**
    * 每页条数
    */
    private Integer pageSize;

    /**
    * 过滤后的总条数，用于计算总页数
    */
    private Integer totalCount;

    /**
    * 过滤前的全量总条数，用于配额展示
    */
    private Integer realTotalCount;

    /**
    * 排序方向
    */
    private String order;

    /**
    * 排序字段
    */
    private String orderBy;

    public String getRequestId() {
        return requestId;
    }

    public ListL3AccessGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public List<AccessGroupInfo> getResult() {
        return result;
    }

    public ListL3AccessGroupResponse setResult(List<AccessGroupInfo> result) {
        this.result = result;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListL3AccessGroupResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListL3AccessGroupResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListL3AccessGroupResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getRealTotalCount() {
        return realTotalCount;
    }

    public ListL3AccessGroupResponse setRealTotalCount(Integer realTotalCount) {
        this.realTotalCount = realTotalCount;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListL3AccessGroupResponse setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListL3AccessGroupResponse setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    @Override
    public String toString() {
        return "ListL3AccessGroupResponse{" + "requestId=" + requestId + "\n" + "result=" + result + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n"
                + "totalCount=" + totalCount + "\n" + "realTotalCount=" + realTotalCount + "\n" + "order=" + order + "\n" + "orderBy=" + orderBy + "\n" + "}";
    }

}
