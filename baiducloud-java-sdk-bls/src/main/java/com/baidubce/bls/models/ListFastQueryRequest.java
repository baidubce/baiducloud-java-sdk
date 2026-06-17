package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListFastQueryRequest extends BaseBceRequest {

    /**
    * project
    */
    @JsonIgnore
    private String project;

    /**
    * logStoreName
    */
    @JsonIgnore
    private String logStoreName;

    /**
    * namePattern
    */
    @JsonIgnore
    private String namePattern;

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
    * pageNo
    */
    @JsonIgnore
    private Integer pageNo;

    /**
    * pageSize
    */
    @JsonIgnore
    private Integer pageSize;

    public String getProject() {
        return project;
    }

    public ListFastQueryRequest setProject(String project) {
        this.project = project;
        return this;
    }

    public String getLogStoreName() {
        return logStoreName;
    }

    public ListFastQueryRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public String getNamePattern() {
        return namePattern;
    }

    public ListFastQueryRequest setNamePattern(String namePattern) {
        this.namePattern = namePattern;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListFastQueryRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListFastQueryRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListFastQueryRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListFastQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
