package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListInstancesRequest extends BaseBceRequest {

    /**
    * pageSize
    */
    @JsonIgnore
    private Integer pageSize;

    /**
    * pageNo
    */
    @JsonIgnore
    private Integer pageNo;

    /**
    * orderBy
    */
    @JsonIgnore
    private String orderBy;

    /**
    * order
    */
    @JsonIgnore
    private String order;

    /**
    * phase
    */
    @JsonIgnore
    private String phase;

    public Integer getPageSize() {
        return pageSize;
    }

    public ListInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListInstancesRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListInstancesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListInstancesRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getPhase() {
        return phase;
    }

    public ListInstancesRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }

}
