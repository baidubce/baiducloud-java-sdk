package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAlarmTemplatesRequest extends BaseBceRequest {

    /**
    * 模板名称，支持模糊匹配
    */
    private String name;

    /**
    * 云产品类型
    */
    private String scope;

    /**
    * 资源类型
    */
    private String resourceType;

    /**
    * 子资源类型
    */
    private String subResourceType;

    /**
    * 排序方向，asc/desc
    */
    private String order;

    /**
    * 排序字段
    */
    private String orderBy;

    /**
    * 页码，从1开始
    */
    private Integer pageNo;

    /**
    * 每页条数
    */
    private Integer pageSize;

    public String getName() {
        return name;
    }

    public DescribeAlarmTemplatesRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public DescribeAlarmTemplatesRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getResourceType() {
        return resourceType;
    }

    public DescribeAlarmTemplatesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getSubResourceType() {
        return subResourceType;
    }

    public DescribeAlarmTemplatesRequest setSubResourceType(String subResourceType) {
        this.subResourceType = subResourceType;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public DescribeAlarmTemplatesRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public DescribeAlarmTemplatesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public DescribeAlarmTemplatesRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public DescribeAlarmTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
