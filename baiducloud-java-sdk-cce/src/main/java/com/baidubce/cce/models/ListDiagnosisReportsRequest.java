package com.baidubce.cce.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListDiagnosisReportsRequest extends BaseBceRequest {

    /**
    * clusterID
    */
    @JsonIgnore
    private String clusterID;

    /**
    * pageNo
    */
    @JsonIgnore
    private Integer pageNo;

    /**
    * pageSize
    */
    @JsonIgnore
    private Integer pageSize;

    /**
    * order
    */
    @JsonIgnore
    private String order;

    /**
    * orderBy
    */
    @JsonIgnore
    private String orderBy;

    /**
    * resultFilter
    */
    @JsonIgnore
    private String resultFilter;

    public String getClusterID() {
        return clusterID;
    }

    public ListDiagnosisReportsRequest setClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListDiagnosisReportsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListDiagnosisReportsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListDiagnosisReportsRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListDiagnosisReportsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getResultFilter() {
        return resultFilter;
    }

    public ListDiagnosisReportsRequest setResultFilter(String resultFilter) {
        this.resultFilter = resultFilter;
        return this;
    }

}
