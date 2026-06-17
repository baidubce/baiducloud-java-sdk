package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListLogStoreRequest extends BaseBceRequest {

    /**
    * 日志组名称，默认default
    */
    private String project;

    /**
    * 日志集名称
    */
    private String namePattern;

    /**
    * 排序方向，asc或者desc
    */
    private String order;

    /**
    * 排序列，支持creationDateTime，lastModifiedTime，name
    */
    private String orderBy;

    /**
    * 页码，必须大于0
    */
    private Integer pageNo;

    /**
    * 每页大小，必须大于0
    */
    private Integer pageSize;

    public String getProject() {
        return project;
    }

    public ListLogStoreRequest setProject(String project) {
        this.project = project;
        return this;
    }

    public String getNamePattern() {
        return namePattern;
    }

    public ListLogStoreRequest setNamePattern(String namePattern) {
        this.namePattern = namePattern;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListLogStoreRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListLogStoreRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListLogStoreRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListLogStoreRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
