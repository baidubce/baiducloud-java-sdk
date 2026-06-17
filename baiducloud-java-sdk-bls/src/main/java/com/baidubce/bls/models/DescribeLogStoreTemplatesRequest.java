package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLogStoreTemplatesRequest extends BaseBceRequest {

    /**
    * 按模板名称过滤
    */
    private String name;

    /**
    * 排序字段，createdTime: 创建时间， updatedTime: 更新时间，name: 名称，priority: 优先级 默认值：priority
    */
    private String orderBy;

    /**
    * 排序方式，asc: 升序， desc: 降序，默认值：desc
    */
    private String order;

    /**
    * 第几页，从1开始计数
    */
    private Integer pageNo;

    /**
    * 每页展示数量，最大值：100
    */
    private Integer pageSize;

    public String getName() {
        return name;
    }

    public DescribeLogStoreTemplatesRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public DescribeLogStoreTemplatesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public DescribeLogStoreTemplatesRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public DescribeLogStoreTemplatesRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public DescribeLogStoreTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
