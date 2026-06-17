package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListLogStreamResponse extends BaseBceResponse {

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
    * LogStream 列表
    */
    private List<LogStream> result;

    public String getOrder() {
        return order;
    }

    public ListLogStreamResponse setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListLogStreamResponse setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListLogStreamResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListLogStreamResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListLogStreamResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<LogStream> getResult() {
        return result;
    }

    public ListLogStreamResponse setResult(List<LogStream> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "ListLogStreamResponse{" + "order=" + order + "\n" + "orderBy=" + orderBy + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount="
                + totalCount + "\n" + "result=" + result + "\n" + "}";
    }

}
