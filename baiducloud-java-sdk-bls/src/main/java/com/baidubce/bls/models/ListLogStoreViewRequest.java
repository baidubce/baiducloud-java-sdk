package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListLogStoreViewRequest extends BaseBceRequest {

    /**
    * 指定筛选日志组的关键字
    */
    private String project;

    /**
    * 筛选日志视图部分匹配的关键字
    */
    private String name;

    /**
    * 排序规则，desc为降序，asc为升序，默认为 desc
    */
    private String order;

    /**
    * 排序字段，默认为创建时间，可选createdTimestamp/updatedTimestamp
    */
    private String orderBy;

    /**
    * 起始页码，默认为 1
    */
    private Integer pageNo;

    /**
    * 每页显示数据大小，默认为 10
    */
    private Integer pageSize;

    public String getProject() {
        return project;
    }

    public ListLogStoreViewRequest setProject(String project) {
        this.project = project;
        return this;
    }

    public String getName() {
        return name;
    }

    public ListLogStoreViewRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListLogStoreViewRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListLogStoreViewRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListLogStoreViewRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListLogStoreViewRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
