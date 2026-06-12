package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAlarmPoliciesRequest extends BaseBceRequest {

    /**
    * 按策略名称筛选，支持部分匹配
    */
    private String policyName;

    /**
    * 按策略ID筛选，精确匹配
    */
    private String policyId;

    /**
    * 云产品类型筛选
    */
    private String scope;

    /**
    * 资源类型筛选（scope不能为空）
    */
    private String resourceType;

    /**
    * 是否包含子类型，默认为false
    */
    private Boolean recursive;

    /**
    * 子资源类型筛选
    */
    private String subResourceType;

    /**
    * 通知状态筛选
    */
    private Boolean notifyEnabled;

    /**
    * 策略类型筛选，可选值：APP / SITE / CLOUD / CUSTOM
    */
    private String type;

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

    public String getPolicyName() {
        return policyName;
    }

    public DescribeAlarmPoliciesRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    public String getPolicyId() {
        return policyId;
    }

    public DescribeAlarmPoliciesRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public DescribeAlarmPoliciesRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getResourceType() {
        return resourceType;
    }

    public DescribeAlarmPoliciesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public Boolean getRecursive() {
        return recursive;
    }

    public DescribeAlarmPoliciesRequest setRecursive(Boolean recursive) {
        this.recursive = recursive;
        return this;
    }

    public String getSubResourceType() {
        return subResourceType;
    }

    public DescribeAlarmPoliciesRequest setSubResourceType(String subResourceType) {
        this.subResourceType = subResourceType;
        return this;
    }

    public Boolean getNotifyEnabled() {
        return notifyEnabled;
    }

    public DescribeAlarmPoliciesRequest setNotifyEnabled(Boolean notifyEnabled) {
        this.notifyEnabled = notifyEnabled;
        return this;
    }

    public String getType() {
        return type;
    }

    public DescribeAlarmPoliciesRequest setType(String type) {
        this.type = type;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public DescribeAlarmPoliciesRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public DescribeAlarmPoliciesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public DescribeAlarmPoliciesRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public DescribeAlarmPoliciesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
