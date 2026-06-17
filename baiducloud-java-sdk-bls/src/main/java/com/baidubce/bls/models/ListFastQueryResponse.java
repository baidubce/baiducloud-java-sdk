package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListFastQueryResponse extends BaseBceResponse {

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
    * 返回的结果集
    */
    private List<FastQuery> result;

    public String getOrder() {
        return order;
    }

    public ListFastQueryResponse setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListFastQueryResponse setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListFastQueryResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListFastQueryResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListFastQueryResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<FastQuery> getResult() {
        return result;
    }

    public ListFastQueryResponse setResult(List<FastQuery> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "ListFastQueryResponse{" + "order=" + order + "\n" + "orderBy=" + orderBy + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount="
                + totalCount + "\n" + "result=" + result + "\n" + "}";
    }

}
