package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeNotifyTemplatesRequest extends BaseBceRequest {

    /**
    * 按通知模板名称筛选，支持部分匹配
    */
    private String name;

    /**
    * 策略ID，查询被该策略使用的通知模板
    */
    private String policyId;

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

    public String getName() {
        return name;
    }

    public DescribeNotifyTemplatesRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getPolicyId() {
        return policyId;
    }

    public DescribeNotifyTemplatesRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public DescribeNotifyTemplatesRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public DescribeNotifyTemplatesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public DescribeNotifyTemplatesRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public DescribeNotifyTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
