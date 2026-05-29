package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListProjectRequest extends BaseBceRequest {

    /**
    * 指定筛选日志组名称的关键字
    */
    private String name;

    /**
    * 指定筛选日志组描述的关键字
    */
    private String description;

    /**
    * 排序字段，默认为创建时间，支持createdAt: 创建时间，updatedAt: 修改时间, name: 名称
    */
    private String orderBy;

    /**
    * 排序顺序，desc为降序，asc为升序，默认为 desc
    */
    private String order;

    /**
    * 起始页码，默认为 1
    */
    private Integer pageNo;

    /**
    * 每页显示数据大小，默认为 10
    */
    private Integer pageSize;

    public String getName() {
        return name;
    }

    public ListProjectRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ListProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListProjectRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListProjectRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListProjectRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListProjectRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
