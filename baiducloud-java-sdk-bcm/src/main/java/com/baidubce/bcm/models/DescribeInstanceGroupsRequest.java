package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeInstanceGroupsRequest extends BaseBceRequest {

    /**
    * 云产品类型
    */
    private String scope;

    /**
    * 资源类型
    */
    private String resourceType;

    /**
    * 实例组名称，支持部分匹配
    */
    private String name;

    /**
    * 排序顺序，默认值：desc，可选值：desc / asc
    */
    private String order;

    /**
    * 排序字段，默认值：updatedTime，可选值：updatedTime / createdTime
    */
    private String orderBy;

    /**
    * 页号，从1开始
    */
    private Integer pageNo;

    /**
    * 页大小，取值范围：[1, 100]
    */
    private Integer pageSize;

    public String getScope() {
        return scope;
    }

    public DescribeInstanceGroupsRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getResourceType() {
        return resourceType;
    }

    public DescribeInstanceGroupsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getName() {
        return name;
    }

    public DescribeInstanceGroupsRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public DescribeInstanceGroupsRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public DescribeInstanceGroupsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public DescribeInstanceGroupsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public DescribeInstanceGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
